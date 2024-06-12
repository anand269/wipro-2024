package estassuredExamples;

import org.junit.Test;
import org.junit.Assert;
import static org.testng.Assert.assertEquals;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;
public class JsonPayloadTest {
	
	@Test
	public void getUserById()
	{
		RestAssured.baseURI="https://jsonplaceholder.typicode.com";
		//User user=given().get("users/1").then().statusCode(200).extract().as(User.class);
		User user = given().contentType(ContentType.JSON).get("users/2").then().statusCode(200).extract().as(User.class);
		System.out.println(user.getEmail());
		/*
		 * assertEquals(1, user.getId());//validation assertEquals("Leanne Graham",
		 * user.getName()); assertEquals("Sincere@april.biz", user.getEmail());
		 */
	}

}
