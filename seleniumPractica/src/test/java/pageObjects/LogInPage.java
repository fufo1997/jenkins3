package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LogInPage {

	public LogInPage(WebDriver driver) {
		// queda "escuchando" todo cambio que se genere en tu objeto de la página
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "email")
	WebElement lblEmail;

	@FindBy(id = "passwd")
	WebElement lblPassword;

	@FindBy(id = "SubmitLogin")
	WebElement btnSubmit;

	public void sendEmail(String email) {
		lblEmail.sendKeys(email);
	}

	public void sendPassword(String password) {
		lblPassword.sendKeys(password);
	}

	public void clkSubmit() {
		btnSubmit.click();
	}

}
