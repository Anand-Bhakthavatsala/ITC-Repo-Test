package ITC_Nov23.ITC_Nov23;

import io.restassured.response.Response;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.specification.RequestSpecification;

public class BooksRequest {


	@Test
	public void GetBookHeaders() { 
		RestAssured.baseURI = "https://demoqa.com/BookStore/v1/Books";
		RequestSpecification httpRequest = RestAssured.given();
		Response response = httpRequest.get(""); 
		// Access header with a given name. 
		String contentType = response.header("Content-Type"); 
		System.out.println("Content-Type value: " + contentType); 
		// Access header with a given name. 
		String serverType = response.header("Server"); 
		System.out.println("ServererType); 
		// Access header with a given name. Header = Content-Encoding 
		String acceptLanguage = response.header("Content-Encoding"); 
		System.out.println("Content-Encoding: " + acceptLanguage); 
	} 

}
