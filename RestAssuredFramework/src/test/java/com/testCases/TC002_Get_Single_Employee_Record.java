package com.testCases;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.employeee.base.TestBase;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
public class TC002_Get_Single_Employee_Record extends TestBase{
RequestSpecification httpRequest;
Response response;

@BeforeClass
void getEmployeeData() throws InterruptedException {
	logger.info("*********Started TC002_Get_Single_Employee_Record****");
	RestAssured.baseURI = "	http://dummy.restapiexample.com/api/v1/employee";
	httpRequest = RestAssured.given();
	httpRequest.request(Method.GET,"/" +empID);
			
	Thread.sleep(5000);
		
}
@Test
void getResponseBody() {
	String responseBody = response.getBody().asString();
	Assert.assertEquals(responseBody.contains(empID), true);
}
@Test
void checkStatusCode() {
	int statusCode = response.getStatusCode();
	Assert.assertEquals(statusCode,200);
}
@Test
void checkResponseTime() {
	long responseTime = response.getTime();
	Assert.assertTrue(responseTime<6000);
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
	logger.info("*******Finished TC002_Get_Single_Employee_Record****");
	

}
}
