import org.junit.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class TC001_GET_Request {

	@Test
	void getCountryName() {
		
		RestAssured.baseURI="https://restcountries.eu/rest/v2/name/";
		RequestSpecification httpRequest = RestAssured.given();
		Response response = httpRequest.request(Method.GET,"Uzbekistan");
		String responseBody=response.getBody().asString();
		System.out.println("Response body is:" +responseBody);
		 int statusCode=response.getStatusCode();
	    System.out.println("Status code is:" +statusCode);
	    Assert.assertEquals(statusCode, 200);
	    String statusLine=response.statusLine();
	    System.out.println(statusLine);
	    Assert.assertEquals(statusLine,"HTTP/1.1 200 ");
	}
	
}
