package com.basic.FirstFeatureFile;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//import cucumber.api.PendingException;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class MyFirstStepDef {

	WebDriver driver;

	@Given("^User need to be on gmail page$")
	public void user_need_to_be_on_gmail_page() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "E:\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get(
				"https://accounts.google.com/signin/v2/identifier?hl=en&continue=https%3A%2F%2Fmail.google.com%2Fmail&service=mail&ec=GAlAFw&flowName=GlifWebSignIn&flowEntry=AddSession");
		// throw new PendingException();
	}

	@When("^User enters \"(.*)\" email$")
	public void user_enters_email(String email) throws Throwable {
		driver.findElement(By.xpath("//*[@id='identifierId']")).sendKeys(email);
		// throw new PendingException();
	}

	@And("^Clicks next button for password$")
	public void clicks_next_button_for_password() throws Throwable {
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//*[@id=\'identifierNext\']")).click();
		// throw new PendingException();
	}

	@And("^User enters \"(.*)\" password$")
	public void user_enters_password(String password) throws Throwable {
		driver.findElement(By.xpath("//*[@id='password']/div[1]/div/div[1]/input")).sendKeys(password);
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		// throw new PendingException();
	}

	@And("^Clicks next button for login$")
	public void clicks_next_button_for_login() throws Throwable {
		driver.findElement(By.xpath("//*[@id='passwordNext']")).click();
		Thread.sleep(3000);
		// throw new PendingException();
	}

	@Then("^Mailbox page of user should be displayed$")
	public void mailbox_page_of_user_should_be_displayed() throws Throwable {
		// driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.quit();
	}

}
