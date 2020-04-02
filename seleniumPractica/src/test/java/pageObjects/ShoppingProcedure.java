package pageObjects;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import stepDefinitions.SetUpClass;

public class ShoppingProcedure {

	public static WebDriver driver = SetUpClass.driver;

	public ShoppingProcedure(WebDriver driver) {

		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//*[@id=\"header_logo\"]/a/img")
	WebElement btnMainLogo;

	public void clkMainLogo() {
		btnMainLogo.click();
	}

	// Women Category tab button
	@FindBy(xpath = "//a[@title=\"Women\"]")
	WebElement btnWomen;

	public void clkWomen() {
		btnWomen.click();
	}

	// Add to cart button
	@FindBy(xpath = "//*[@id=\"center_column\"]/ul/li[1]/div/div[2]/div[2]/a[1]/span")
	WebElement btnAddToCart;

	public void clkAddToCart() {
		btnAddToCart.click();
	}

	// Mouse hover action
	@FindBy(xpath = "//img[@src=\"http://automationpractice.com/img/p/1/1-home_default.jpg\"]")
	WebElement hoverAddToCart;

	public void mousehoverAddToCart() throws InterruptedException {
		Thread.sleep(2000);
		Actions hover = new Actions(driver);
		Action mouseHover = hover.moveToElement(hoverAddToCart).build();
		mouseHover.perform();
		Thread.sleep(2000);
	}

	// First two proceed checkouts
	@FindBy(linkText = "Proceed to checkout")
	WebElement btnCheckout;

	public void clkCheckout() {
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		btnCheckout.click();
	}

	/*
	 * For the proceed checkouts was necesary create different methods because the
	 * Address and Shiping sections doesn't work with the firs method
	 */
	// Third proceed checkout (Adress Section)
	@FindBy(xpath = "//span[text()=\"Proceed to checkout\"]")
	WebElement btnCheckoutAgain;

	public void clkCheckoutAgain() {
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		btnCheckoutAgain.click();
	}

	// Fourth proceed checkout (Shipping Section)
	@FindBy(xpath = "html/body/div/div[2]/div/div[3]/div/div/form/p/button/span")
	WebElement btnCheckoutAndAgain;

	public void clkCheckoutAndAgain() {
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		btnCheckoutAndAgain.click();
	}

	//Checkbox 
	@FindBy(id = "uniform-cgv")
	WebElement chekBox;

	public void clkTermsBox() {
		chekBox.click();
	}
	
	//Pay by check button
	@FindBy(xpath = "//*[@id=\"HOOK_PAYMENT\"]/div[2]/div/p/a")
	WebElement btnPayByCheck;

	public void clkPayCheck() {
		btnPayByCheck.click();
	}

	//Confirm Order button
	@FindBy(xpath = "//*[@id=\"cart_navigation\"]/button")
	WebElement btnConfirm;

	public void clkConfirm() {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		btnConfirm.click();
	}

}
