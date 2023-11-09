package ITC_Nov23.ITC_Nov23;

import org.testng.Assert;
import org.testng.annotations.Test;
import io.restassured.RestAssured;
import static io.restassured.RestAssured.*;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class RestAssuredGetExample {

	@Test (enabled=false)
	public void RestAssuredGetSingleUser()
	{
		String baseUrl = "https://jsonplaceholder.typicode.com";

		// Perform a GET request to retrieve data from the API
		Response response = RestAssured.get(baseUrl + "/users/1"); // Example: Retrieve user with ID 1

		// Get the response body as a string
		String responseBody = response.getBody().asString();

		// Get the HTTP status code from the response
		int statusCode = response.getStatusCode();

		// Print the response body and status code
		System.out.println("Response Body: " + responseBody);
		System.out.println("Status Code: " + statusCode);

		// Perform assertions to validate the response
		// For example, you can use TestNG or JUnit for more structured assertions
		// Here, we're just checking the status code for simplicity
		/*
		 * if (statusCode == 201) { System.out.println("API request was successful."); }
		 * else { System.out.println("API request failed."); }
		 */
		
		Assert.assertEquals(statusCode, 201);
	}

	@Test (enabled=false)
	public void RestAssuredGetAllUsers()
	{
		String baseUrl = "https://jsonplaceholder.typicode.com";

		// Perform a GET request to retrieve data from the API
		Response response = RestAssured.get(baseUrl + "/users"); // Example: Retrieve user with ID 1

		// Get the response body as a string
		String responseBody = response.getBody().asString();
		System.out.println("Response Body: " + responseBody);
	}

	@Test (enabled=false)
	public void RestAssuredPost()
	{
		// Define the base URL of the API you want to access
		String baseUrl = "https://jsonplaceholder.typicode.com";

		// Define the request payload (JSON data)
		String requestBody = "{"
				+ "\"title\": \"New Post\","
				+ "\"body\": \"This is the body of the new post.\","
				+ "\"userId\": 11"
				+ "}";

		// Perform a POST request to create a new resource
		Response response = RestAssured.given()
				.contentType(ContentType.JSON) // Set the content type to JSON
				.body(requestBody) // Set the request body
				.post(baseUrl + "/posts");

		// Get the response body as a string
		String responseBody = response.getBody().asString();

		// Get the HTTP status code from the response
		int statusCode = response.getStatusCode();

		// Print the response body and status code
		System.out.println("Response Body: " + responseBody);
		System.out.println("Status Code: " + statusCode);

		// Perform assertions to validate the response
		// For example, you can use TestNG or JUnit for more structured assertions
		// Here, we're just checking the status code for simplicity
		if (statusCode == 201) {
			System.out.println("POST request was successful.");
		} else {
			System.out.println("POST request failed.");
		}	
	}

	@Test (enabled=false)
	public void GetBookDetails()
	{  
		// Specify the base URL to the RESTful web service
		RestAssured.baseURI = "https://demoqa.com/BookStore/v1/Books";
		// Get the RequestSpecification of the request to be sent to the server
		RequestSpecification httpRequest = RestAssured.given();

		Response response = httpRequest.get("");

		// Get the status code of the request. 
		//If request is successful, status code will be 200
		int statusCode = response.getStatusCode();

		// Assert that correct status code is returned.
		Assert.assertEquals(statusCode /*actual value*/, 200 /*expected value*/, 
				"Correct status code returned");
		
		System.out.println(response.getBody().asString());

	}
	
	@Test (enabled=false)
	public void guru99GetExample()
	{
		 given().queryParam("CUSTOMER_ID","68195")
         .queryParam("PASSWORD","1234!")
         .queryParam("Account_No","1")
         .when().get("http://demo.guru99.com/V4/sinkministatement.php").then().log()
         .body();
	}
}


