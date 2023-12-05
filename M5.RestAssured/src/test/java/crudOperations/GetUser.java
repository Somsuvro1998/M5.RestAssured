package crudOperations;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class GetUser {

	public static void main(String[] args) {
		
		//Step 1: Create data
		
		//Step 2: Send Request
		Response resp = RestAssured.get("https://reqres.in/api/users/2");
		
		//Step 3: log the response
		resp.then().log().all();
		
		
	}
	
}
