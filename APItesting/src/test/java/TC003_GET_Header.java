import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class TC003_GET_Header {

	@Test
	void getVerifyHeader() {
	RestAssured.baseURI="https://restcountries.eu";
	RequestSpecification httpRequest = RestAssured.given();
	Response response = httpRequest.request(Method.GET,"/rest/v2/alpha?codes=uzb;no;ee");
	String responseBody=response.getBody().asString();
	System.out.println("Response body is:" +responseBody);
	
	String contentType=response.getHeader("Content-Type");
	System.out.println("Content Type is:" +contentType);
	Assert.assertEquals(contentType, "application/json;charset=utf-8");
	
	String transferEncoding=response.getHeader("Transfer-Encoding");
	System.out.println("Transfer Encoding is:" +transferEncoding);
	Assert.assertEquals(transferEncoding, "chunked");
}
}