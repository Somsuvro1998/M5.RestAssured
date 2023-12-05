package crudOperations;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class DeleteUser {

	public static void main(String[] args) {

		
		Response resp = RestAssured.delete("https://reqres.in/api/users/2");
		
		resp.then().log().all();
		
	
	}

}
