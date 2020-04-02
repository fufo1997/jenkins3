package stepDefinitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import pageObjects.LogInPage;
import pageObjects.ShoppingProcedure;

public class GivenTest {

	public static WebDriver driver = SetUpClass.driver;
	LogInPage lg;
	ShoppingProcedure sp;

	@Given("User is on login page")
	public void user_is_on_login_page() {

		driver.get("http://automationpractice.com/index.php?controller=authentication&back=my-account");
		driver.manage().window().maximize();
	}

	@Given("Login succesful with {string} and {string}")
	public void login_succesful_with_and(String email, String psw) {
		lg = new LogInPage(driver);
		lg.sendEmail(email);
		lg.sendPassword(psw);
		lg.clkSubmit();
	}

	@Given("User is in homepage")
	public void user_is_in_homepage() {
		sp = new ShoppingProcedure(driver);
		sp.clkMainLogo();
	}

}
