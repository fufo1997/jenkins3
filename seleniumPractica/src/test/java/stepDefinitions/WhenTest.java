package stepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import io.cucumber.java.en.When;
import pageObjects.LogInPage;
import pageObjects.ShoppingProcedure;

public class WhenTest {

//	WebDriver driver = GivenTest.driver;
	public static WebDriver driver = SetUpClass.driver;
	LogInPage lg;
	ShoppingProcedure sp;

	@When("User clicks on women category")
	public void user_clicks_on_women_category() {
		sp = new ShoppingProcedure(driver);
		sp.clkWomen();
	}

	@When("User adds a product to the cart")
	public void user_adds_a_product_to_the_cart() throws InterruptedException {
		sp = new ShoppingProcedure(driver);
		sp.mousehoverAddToCart();
		sp.clkAddToCart();
	}

	@When("User clicks on Proceed Checkout")
	public void user_clicks_on_Proceed_Checkout() throws InterruptedException {
		sp = new ShoppingProcedure(driver);
		sp.clkCheckout();
	}

	@When("User clicks on Proceed Checkout again")
	public void user_clicks_on_Proceed_Checkout_again() throws InterruptedException {
		sp = new ShoppingProcedure(driver);
		sp.clkCheckoutAgain();
	}

	@When("User clicks on Proceed Checkout and again")
	public void user_clicks_on_Proceed_Checkout_and_again() throws InterruptedException {
		sp = new ShoppingProcedure(driver);
		sp.clkCheckoutAndAgain();
	}

	@When("User accepts terms of service")
	public void user_accepts_terms_of_service() {
		sp = new ShoppingProcedure(driver);
		sp.clkTermsBox();
	}

	@When("User pays by check")
	public void user_pays_by_check() {
		sp = new ShoppingProcedure(driver);
		sp.clkPayCheck();
	}

	@When("User confirms order")
	public void user_confirms_order() {
		sp = new ShoppingProcedure(driver);
		sp.clkConfirm();
	}

}
