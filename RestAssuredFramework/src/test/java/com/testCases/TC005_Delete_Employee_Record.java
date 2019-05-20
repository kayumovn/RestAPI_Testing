package com.testCases;

import org.json.simple.JSONObject;
import org.junit.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.employeeapi.utilities.RestUtils;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import com.employeee.base.TestBase;

public class TC005_Delete_Employee_Record extends TestBase {

	
	RequestSpecification httpRequest;
	Response response;

	
	@BeforeClass
	void createEmployee() throws InterruptedException {
		logger.info("*********Started TC003_Get_Single_Employee_Record****");
		RestAssured.baseURI = "	http://dummy.restapiexample.com/api/v1";
		httpRequest = RestAssured.given();
		
	
		response = httpRequest.request(Method.GET, "/employees");
		 JsonPath jsonpathEvaluvator = response.jsonPath();
		String empID =  jsonpathEvaluvator.get("[0].id");
		response = httpRequest.request(Method.DELETE,"/delete"+empID);
Thread.sleep(5);
	}
	@Test
	void checkResponseBody() {
		String responseBody = response.getBody().asString();
		Assert.assertEquals(responseBody.contains("Successfully deleted Records"), true);
	}
	@Test
	void checkStatusCode() {
		int statusCode = response.getStatusCode();
		Assert.assertEquals(statusCode, 200);
	}

	@Test
	void checkStatusLine() {
		String statusLine = response.getStatusLine();
		Assert.assertEquals(statusLine, "HTTP/1,1 200 OK");
	}
	@Test
	void checkContentType() {
		String contentType = response.header("Content-Type");
		Assert.assertEquals(contentType,"text/html; charset=UTF-8");
	}
	@Test
	void checkServerType() {
		String serverType = response.header("Server");
		Assert.assertEquals(serverType, "nginx/1.14.1");
	}
	@Test
	void checkContentLength() {
		String contentLength = response.header("Content-Length");
		Assert.assertTrue(Integer.parseInt(contentLength)<100);
	}
	@AfterClass
	void tearDown() {
		logger.info("*******Finished TC003_Post_Emloyee_Record****");
		

	}

}
