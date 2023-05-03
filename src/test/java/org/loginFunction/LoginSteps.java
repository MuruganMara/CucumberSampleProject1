package org.loginFunction;

import java.io.IOException;

import org.fbPom.FacebookPom;
import org.helper.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginSteps extends BaseClass {

	FacebookPom p1;

	@Given("User has to be in login page")
	public void user_has_to_be_in_login_page() {
		openChromeBrowser();
		driver.get("https://www.facebook.com/");

	}
	@When("User has to enter  {string}and{string}")
	public void user_has_to_enter_and(String a1, String a2) {

		p1 = new FacebookPom();
		WebElement txtemail = p1.getTxtemail();
		toFillTextBox(txtemail, a1);
		WebElement txtpswd = p1.getTxtpswd();
		toFillTextBox(txtpswd, a2);
		
		
	}

@When("User has to enter  valid username and invalidpassword")
public void user_has_to_enter_valid_username_and_invalidpassword() throws IOException {

	p1 = new FacebookPom();
	WebElement txtemail = p1.getTxtemail();
	toFillTextBox(txtemail, toReadExcelFile(1, 2));
	WebElement txtpswd = p1.getTxtpswd();
	toFillTextBox(txtpswd, toReadExcelFile(1, 3));

}

@When("User has to enter  invalidusername and valid password")
public void user_has_to_enter_invalidusername_and_valid_password() throws IOException {

	p1 = new FacebookPom();
	WebElement txtemail = p1.getTxtemail();
	toFillTextBox(txtemail, toReadExcelFile(1, 5));
	WebElement txtpswd = p1.getTxtpswd();
	toFillTextBox(txtpswd, toReadExcelFile(1, 4));
}

@When("User has to enter  invalidusername and invalidpassword")
public void user_has_to_enter_invalidusername_and_invalidpassword() throws IOException {

	p1 = new FacebookPom();
	WebElement txtemail = p1.getTxtemail();
	toFillTextBox(txtemail, toReadExcelFile(1, 6));
	WebElement txtpswd = p1.getTxtpswd();
	toFillTextBox(txtpswd, toReadExcelFile(1, 8));

}





	@When("User has to enter invalid username and password")
	public void user_has_to_enter_invalid_username_and_password() throws IOException {
		p1 = new FacebookPom();
		WebElement txtemail = p1.getTxtemail();
		toFillTextBox(txtemail, toReadExcelFile(1, 3));
		WebElement txtpswd = p1.getTxtpswd();
		toFillTextBox(txtpswd, toReadExcelFile(1, 2));
	}

	@When("User has to click login button")
	public void user_has_to_click_login_button() throws InterruptedException {
		driver.findElement(By.name("login")).click();
		

		Thread.sleep(5000);

	}

	@Then("User have to be in invalid credential page")
	public void user_have_to_be_in_invalid_credential_page() {

		String url = driver.getCurrentUrl();

		if (url.contains("jnjjdjj")) {
			toPrint(url);
		} else {

			toPrint(url);
		}
		driver.close();
	}

}