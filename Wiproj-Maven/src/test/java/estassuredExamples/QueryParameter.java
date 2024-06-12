package estassuredExamples;

import org.json.JSONObject;
import org.junit.Test;

import io.cucumber.cienvironment.internal.com.eclipsesource.json.JsonObject;
import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;
import io.restassured.specification.RequestSpecification;
import junit.framework.Assert;

public class QueryParameter {
	
	@Test 
	public void queryParam()
	{
		RestAssured.baseURI = "https://bookstore.toolsqa.com/BookStore/v1";
		RequestSpecification httpRequest = RestAssured.given();
		Response res = httpRequest.queryParam("ISBN", "9781449331818").get("/Book");
		ResponseBody body = res.body();//res.getBody();
		String rbdy=body.asString();
		JsonPath jpath = new JsonPath(rbdy);
		String title = jpath.getString("title");
		System.out.println("The book title is- "+title);
		Assert.assertEquals(title, "Learning JavaScript Design Patterns");
		String author = jpath.getString("author");
		System.out.println("The Author is- "+author);
	}
	
	@Test
	public void postReq()
	{
		RestAssured.baseURI = "https://bookstore.toolsqa.com/BookStore/v1";
		RequestSpecification httpRequest = RestAssured.given();
		JsonObject reqParam = new JsonObject();
		reqParam.add("userId", "anand269");
		reqParam.add("isbn", "244535435");		
	}
	
	@Test
	public void UserRegistrationSuccessful() 
	{ 
	    RestAssured.baseURI ="https://demoqa.com/Account/v1"; 
	    RequestSpecification request = RestAssured.given(); 
	    JSONObject requestParams = new JSONObject();
	    requestParams.put("userName", "test_rest");
	    requestParams.put("password", "Testrest@123"); 
	    request.body(requestParams.toString());
	    Response response = request.put("/User"); 
	    ResponseBody body = response.getBody();
	    System.out.println(response.getStatusLine());
	    System.out.println(body.asString());
	     
	}
}
