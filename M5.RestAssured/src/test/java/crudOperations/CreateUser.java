package crudOperations;

import org.json.simple.JSONObject;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class CreateUser {
	
	public static void main(String[] args) {
		
		//Step1: Create Data required/request body required
		
		JSONObject j=new JSONObject();
		j.put("name","som");
		j.put("job","AT");
		
		//Step2: Send the Request
		RequestSpecification req = RestAssured.given();
		req.body(j);
		req.contentType(ContentType.JSON);
		
		Response resp=req.post("https://reqres.in/api/users");
		
		//Step3: Log the Response
		resp.then().log().all();
	}

}
