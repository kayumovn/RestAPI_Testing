import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class TC006_GET_AllField_From_Body {

	@Test
	void verifyAllNodes() {
	RestAssured.baseURI="https://restcountries.eu/rest/v2/capital";
	RequestSpecification httpRequest = RestAssured.given();
	Response response = httpRequest.request(Method.GET,"/Tashkent");
	
	JsonPath path = response.jsonPath();
	
	System.out.println(path.get("name"));
	System.out.println(path.get("capital"));
	System.out.println(path.get("region"));
	System.out.println(path.get("numericCode"));
	System.out.println(path.get("languages"));
	
	Assert.assertEquals(path.get("region"), "Asia");
}
}