package com.testCases;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.employeee.base.TestBase;

import io.restassured.RestAssured;
import io.restassured.http.Method;

public class TC001_Get_All_employees extends TestBase {

	@BeforeClass
	void getAllEmployees() throws InterruptedException {
	logger.info("****Started TC001_Get_All_employees****");	
	RestAssured.baseURI = "http://dummy.restapiexample.com/api/v1/";
	httpRequest = RestAssured.given();
	response = httpRequest.request(Method.GET,"/employees");
	Thread.sleep(3);
	}
	@Test
	void checkResponseBody() {
	
		logger.info("****Cheking Response Body****");
		String responseBody = response.getBody().asString();
		logger.info("***Response Body is:" + responseBody);
		Assert.assertTrue(responseBody !=null);
	}
	
	@Test
	void chekStatusCode() {
		logger.info("********Cheking status code*****");
		int statusCode = response.getStatusCode();
		logger.info("Status code is:" + statusCode);
		Assert.assertEquals(statusCode, 200);
	}
	
		@Test
		void checkResponseTime() {
			logger.info("************Cheking Response Time*****");
			long responseTime = response.getTime();
			logger.info("***Response Time is:" + responseTime);
			if(responseTime>2000) 
				logger.warn("****Response Time is greater than 2000");
			Assert.assertTrue(responseTime<2000);
			}
			@Test
			void checkstatusLine() {
			logger.info("**** Cheking Status Line****");	
			String statusLine = response.getStatusLine();
			logger.info("Status Line is:" + statusLine);
			Assert.assertEquals(statusLine, "HTTP/1.1 200 OK");
			}
			@Test
			void checkContentType() {
				logger.info("****Checking Content Type****");
				String contentType = response.getContentType();
				logger.info("Content type is:" + contentType);
				Assert.assertEquals(contentType,"text/html; charset=UTF-8");
			}
			@Test
			void checkServerType() {
				logger.info("*******Cheking Server Type****");
				String serverType = response.header("Server");
				logger.info("Server type is:" + serverType);
				Assert.assertEquals(serverType,"nginx/1.14.1");
			}
			@Test
			void checkContentEncoding() {
				logger.info("***********Cheking Content Encoding");
				String contentEncoding = response.header("Content-Encoding");
				logger.info("Content Encoding is:" + contentEncoding);
				Assert.assertEquals(contentEncoding, "gzip");
			}
			@Test
			void checkContentLength() {
				logger.info("***********Cheking Content Length******");
				String contentLength = response.header("Content-Length");
				logger.info("ContentLength is:" + contentLength);
				if(Integer.parseInt(contentLength)<100);
				logger.warn("Content Length is less than 100");
				Assert.assertTrue(Integer.parseInt(contentLength)>100);
			}
			@AfterClass
			void tearDown() {
				logger.info("***********Finished TC001 Get_All_employees_test");
				
			
			
			
		}
		
		
		
		}
	

