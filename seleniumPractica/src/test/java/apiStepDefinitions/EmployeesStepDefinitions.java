package apiStepDefinitions;

import org.testng.Assert;

import apiPageObjects.GetEmployees;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.restassured.response.Response;
import io.cucumber.java.en.Then;

public class EmployeesStepDefinitions {

	Response response;
	GetEmployees employees;
	
	@Given("User set valid auth key")
	public void user_set_valid_auth_key() {
		System.out.println("Correct Auth");
	}
	
	@When("User send a Get request on {string}")
	public void user_send_a_Get_request_on(String endPoint) {
	    employees=new GetEmployees(endPoint);
	}

	@Then("User should get status code {int}")
	public void user_should_get_status_code(Integer statusCode) {
	   System.out.println("Response: " + employees.response.asString());
		Assert.assertTrue(employees.response.getStatusCode()==statusCode);
	
	}
	
}
