package estassuredExamples;

import io.restassured.RestAssured;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

public class StatusCodeTest {

    @BeforeAll
    public static void setup() {
        RestAssured.baseURI = "https://jsonplaceholder.typicode.com";
    }

    @Test
    public void testStatusCode() {
        given()
        .when()
            .get("/posts/1")
        .then()
            .statusCode(equalTo(200));
        
        System.out.println("Executed testStatusCode successfully");
    }
    
    @Test
    public void testResponseBody() {
        given()
        .when()
            .get("/posts/1")
        .then()
        	.body("userId", equalTo(1))
        	.body("id", equalTo(2))
        	.body("body",not(emptyString()));
        
        System.out.println("Executed testResponseBody successfully");
    }
}
