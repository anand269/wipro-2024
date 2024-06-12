package estassuredExamples;

import io.restassured.RestAssured;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

public class RestAssuredExample {
    public static void main(String[] args) {
        // Set the base URI for the API
        RestAssured.baseURI = "https://jsonplaceholder.typicode.com";

        // Perform a GET request and validate the response
        given().
            header("Accept", "application/xml").
        when().
            get("/posts/1").
        then().
            statusCode(200).
            body("userId", equalTo(1)).
            body("id", equalTo(1)).
            body("title", not(empty())).
            body("body", not(empty())).
            log().all(); // Log the response details
    }
}
