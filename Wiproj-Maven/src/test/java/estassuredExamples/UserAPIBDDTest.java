package estassuredExamples;

import org.junit.Before;
import org.junit.Test;

import io.restassured.RestAssured;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

public class UserAPIBDDTest {
	
	/*
	 * @Before public static void setup() {
	 * RestAssured.baseURI="https://jsonplaceholder.typicode.com"; }
	 */
	
	@Test //Get
	public void testGetUserById()
	{
		RestAssured.baseURI="https://jsonplaceholder.typicode.com";
		given().when().get("users/10")
		.then()
		.statusCode(200)
		.body("id", equalTo(10))
		.body("username",not(empty()))
		.body("email", containsString("@"))
		.log().all();
		
	}
	
	/*
	 * @Test public void testCreateUser() { String
	 * newUser="{\"name\":\"Ranki Reddy\", \"username\": \"RankiReddy\",\"email\": \"john.doe@example.com\"}"
	 * ; given() .contentType("application/json") .body(newUser) .when()
	 * .post("/users") .then() .statusCode(201) .body("name",equalTo("Ranki Reddy"))
	 * .body("username",equalTo("RankiReddy"))
	 * .body("email",equalTo("ranki.reddy@gmail.com")) .log().all();
	 * 
	 * }
	 */

}
