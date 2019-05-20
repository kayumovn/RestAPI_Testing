import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class TC005_GET_MethodBody {


	@Test
	void verifyBody() {
	RestAssured.baseURI="https://restcountries.eu/rest/v2/capital";
	RequestSpecification httpRequest = RestAssured.given();
	Response response = httpRequest.request(Method.GET,"/Tashkent");
	String responseBody=response.getBody().asString();
	System.out.println("Response body is:" +responseBody);
	
	Assert.assertEquals(responseBody.contains("Tashkent"), true);
}
}