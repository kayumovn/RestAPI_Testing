package com.testCases;

import org.json.simple.JSONObject;
import org.junit.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.employeeapi.utilities.RestUtils;
import com.employeee.base.TestBase;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
public class TC003_Post_Employee_Record extends TestBase {

RequestSpecification httpRequest;
Response response;

String empName = RestUtils.empName();
String empSalary = RestUtils.empSal();
String empAge = RestUtils.empAge();

@BeforeClass
void createEmployee() throws InterruptedException {
	logger.info("*********Started TC003_Get_Single_Employee_Record****");
	RestAssured.baseURI = "	http://dummy.restapiexample.com/api/v1";
	httpRequest = RestAssured.given();
	
	JSONObject requestParams = new JSONObject ();
	requestParams.put("name", empName);
	requestParams.put("salary", empSalary);
	requestParams.put("age", empAge);
	
	httpRequest.header("Content-Type", "application/json");
	httpRequest.body(requestParams.toJSONString());
	
	response = httpRequest.request(Method.POST, "/create");
	
	Thread.sleep(5);
}
@Test
void checkResponseBody() {
	String responseBody = response.getBody().asString();
	Assert.assertEquals(responseBody.contains(empName), true);
	Assert.assertEquals(responseBody.contains(empSalary),true);
	Assert.assertEquals(responseBody.contains(empAge),true);
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
	
	

