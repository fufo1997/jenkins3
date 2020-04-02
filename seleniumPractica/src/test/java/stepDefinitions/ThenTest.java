package stepDefinitions;

import static org.testng.Assert.assertTrue;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import io.cucumber.java.en.Then;
import pageObjects.LogInPage;
import pageObjects.ShoppingProcedure;

public class ThenTest {

	public static WebDriver driver = SetUpClass.driver;
	ShoppingProcedure sp;

	@Then("User order on My Store is complete.")
	public void user_order_on_My_Store_is_complete() {
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		WebElement lblMyOrder = driver.findElement(By.className("page-heading"));
		System.out.println(lblMyOrder.getText());
		assertTrue(lblMyOrder.getText().equals("ORDER CONFIRMATION"));
		;
	}

}
