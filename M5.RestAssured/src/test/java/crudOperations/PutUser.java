package crudOperations;

import org.json.simple.JSONObject;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class PutUser {

	public static void main(String[] args) {
    
		JSONObject o=new JSONObject();
		o.put("name","suvro");
		o.put("job","CEO");
		
		//Steps to send request
		
		RequestSpecification req = RestAssured.given();
		req.body(o);
		req.contentType(ContentType.JSON);
		Response resp = req.put("https://reqres.in/api/user/2");
		     
		     //log the response
		     resp.then().log().all();
		
	
	
	}

}
