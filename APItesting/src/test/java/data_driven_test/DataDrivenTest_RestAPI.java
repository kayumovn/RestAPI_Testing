package data_driven_test;

import org.json.simple.JSONObject;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import junit.framework.Assert;

public class DataDrivenTest_RestAPI {

	
	@Test(dataProvider="empdataprovider")
	void registerNewEmployee(String ename, String esal, String eage) {
		
		RestAssured.baseURI = "http://dummy.restapiexample.com/api/v1";
		RequestSpecification httpRequest = RestAssured.given();
		
		JSONObject params = new JSONObject();
		params.put("name", ename);
		params.put("salary", esal);
		params.put("age", eage);
		
		httpRequest.header("Content-type", "application/json");
		httpRequest.body(params.toJSONString());
		
		Response response = httpRequest.request(Method.POST, "/create");
		String responseBody = response.getBody().asString();
		
		Assert.assertEquals(responseBody.contains(ename), true);
		Assert.assertEquals(responseBody.contains(esal), true);
		Assert.assertEquals(responseBody.contains(eage), true);
		
		int statusCode = response.getStatusCode();
		Assert.assertEquals(200, statusCode);
	}
		
		@DataProvider(name = "empdataprovider")
		String [][] getEmpdata(){
			
		String [][] empdata = {{"xyzasas"}, {"30000"}, {"23"}, {"dadada"}, {"60000"}, {"55"}, {"ddadaw"},{"20000"},{"32"}};
		
		return (empdata);
		
		
		
		
		
	}
}
