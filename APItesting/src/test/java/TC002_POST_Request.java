import org.json.simple.JSONObject;
import org.junit.Assert;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class TC002_POST_Request {

	void getRegistered() {
		RestAssured.baseURI="https://restapi.demoqa.com/customer";
		RequestSpecification httpRequest = RestAssured.given();
		JSONObject parameters = new JSONObject();
		parameters.put("FirstName", "David");
		parameters.put("LasTName", "Mcdonald");
		parameters.put("Password", "HbVhj213");
		parameters.put("Email", "mdavid@gmail.com");
		
		httpRequest.header("Content-Type", "application/json");
		httpRequest.body(parameters.toJSONString());
		
		Response response = httpRequest.request(Method.POST,"/register");
		
		String responseBody=response.getBody().asString();
		System.out.println("Response body is:" +responseBody);
		 int statusCode=response.getStatusCode();
	    System.out.println("Status code is:" +statusCode);
	    Assert.assertEquals(statusCode, 201);
	    
	    String successCode=response.jsonPath().get("SuccessCode");
	    Assert.assertEquals(statusCode, "OPERATION SUCCESS");
	    
	}
}
