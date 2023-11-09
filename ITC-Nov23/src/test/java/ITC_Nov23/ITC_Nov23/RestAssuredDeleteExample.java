package ITC_Nov23.ITC_Nov23;

import org.testng.annotations.Test;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class RestAssuredDeleteExample {

	@Test 
	public void RestAssuredDelete()
	{
		// Define the base URL of the API you want to access
		String baseUrl = "https://jsonplaceholder.typicode.com";

		// Specify the resource ID you want to delete
		int resourceIdToDelete = 1; // Example: Delete a resource with ID 1

		// Perform a DELETE request to delete the resource
		Response response = RestAssured.delete(baseUrl + "/posts/" + resourceIdToDelete);

		// Get the HTTP status code from the response
		int statusCode = response.getStatusCode();

		// Print the status code
		System.out.println("Status Code: " + statusCode);

		// Perform assertions to validate the response
		// For example, you can use TestNG or JUnit for more structured assertions
		// Here, we're just checking the status code for simplicity
		if (statusCode == 200) {
			System.out.println("DELETE request was successful.");
		} else {
			System.out.println("DELETE request failed.");
		}
	}

}


