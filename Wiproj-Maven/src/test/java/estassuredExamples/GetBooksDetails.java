package estassuredExamples;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.http.Header;
import io.restassured.http.Headers;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;


import io.restassured.RestAssured; 
import io.restassured.http.ContentType; 

public class GetBooksDetails {
	
	@Test (enabled=true)
	public void GetBooksDetailsTest()
	{
		//Specify the base url
		RestAssured.baseURI = "https://demoqa.com/BookStore/v1/Books";
		//Get the request specification to be sent to the server
		RequestSpecification  httpRequest = RestAssured.given();
		//Specify the http method type 
		Response response = httpRequest.request(Method.GET);
		//print the status and message of the response 
		System.out.println("Status received-> "+response.getStatusLine());
		System.out.println("Status received-> "+response.getStatusCode());
		System.out.println("Response=> "+ response.prettyPrint());
		
		int statusCode = response.getStatusCode();
		//Assert to check the status
		Assert.assertEquals(statusCode, 200,"Checking the status code");
		System.out.println("Test case pass");
	}
	
	@Test (enabled=false)
	public void iteratingHeaders()
	{
		RestAssured.baseURI = "https://demoqa.com/BookStore/v1/Books";
		RequestSpecification httpRequest = RestAssured.given();
		Response response = httpRequest.get("");
		Headers allHeaders = response.headers();
		
		for(Header header: allHeaders)
		{
			System.out.println("Key: "+header.getName()+" Value: "+ header.getValue());
			
		}
	}
	


}
