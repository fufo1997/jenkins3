import org.json.JSONObject;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class RestAssuredTest {
	
	public Response response;
	 public RequestSpecification request;
	 
	 
	 @BeforeTest()
	 public void setUp() {
	  RestAssured.baseURI = "https://reqres.in/api/";
	  request = RestAssured.given();
	 }
	 
	 @Test() //get list users
	 public void test1() {
	  response = request
	     .given()
	     .when()
	     .get("users");
	  
	  
	  System.out.println(response.prettyPrint());
	 }
	 
	 
	 @Test(enabled = false) //get single user
	 public void test2() {
	  response = request
	     .given()
	     .pathParam("id", 2)
	     .when()
	     .get("users/{id}");
	  
	  response.then().statusCode(201);
	  
	  System.out.println(response.prettyPrint());
	 }
	 
	 @Test(enabled = false) //post register succesful
	 public void test3() {
	  
	  JSONObject json = new JSONObject();
	  
	  json.put("email", "eve.holt@reqres.in");
	  json.put("password", "pistol");
	  
	  response = request
	     .given()
	     .contentType(ContentType.JSON)
	     .body(json.toString())
	     .when()
	     .post("register");
	  
	  response.then().statusCode(200);
	  
	  System.out.println(response.prettyPrint());
	 }
	 
	 @Test(enabled = false) //put update
	 public void test4() {
	  
	  JSONObject json = new JSONObject();
	  
	  json.put("name", "Alex");
	  json.put("job", "PA");
	  
	  
	  response = request
	     .given()
	     .pathParam("id", 784)
	     .contentType(ContentType.JSON)
	     .body(json.toString())
	     .when()
	     .put("users/{id}");
	  
	  response.then().statusCode(200);
	  
	  System.out.println(response.prettyPrint());
	 }
	 
	 @Test(enabled = false) //get new user
	 public void test5() {
	  
	  response = request
	     .given()
	     .pathParam("id", 784)
	     .when()
	     .get("users/{id}");
	  
	  response.then().statusCode(200);
	  
	  System.out.println(response.prettyPrint());
	 }
	 
	 @Test(enabled = false) //delete user
	 public void test6() {
	  
	 response = request
	     .given()
	     .pathParam("id", 740)
	     .when()
	     .delete("users/{740}");
	  
	  response.then().statusCode(201);
	  
	  System.out.println(response.prettyPrint());
	 }
		
	
	
}
