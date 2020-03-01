package org.web.hcl.steps;

import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.*;

public class StepCode {

	 ChromeDriver driver ;
@Given("^User is on login page$")
public void user_is_on_login_page() throws Throwable {
	 System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
     driver = new ChromeDriver();
     driver.get("https://www.facebook.com");
     driver.manage().window().maximize();
}

@When("^User enters username$")
public void user_enters_username() throws Throwable {
     driver.findElementById("email").sendKeys("abcd");
}

@When("^User enters password$")
public void user_enters_password() throws Throwable {
    driver.findElementById("pass").sendKeys("abcd");
}

@When("^User enters passwd$")
public void user_enters_password1() throws Throwable {
    driver.findElementById("paewqeqwss").sendKeys("abcd");
}

@When("^User clicks on signin button$")
public void user_clicks_on_signin_button() throws Throwable {
    driver.findElementByXPath("//input[@type='submit']").click();
}

@Then("^User verify login successfully$")
public void user_verify_login_successfully() throws Throwable {
    
}

@Then("^User should get welcome message$")
public void user_should_get_welcome_message() throws Throwable {
    
}

@When("^User enter data in search box$")
public void user_enter_data_in_search_box() throws Throwable {
    
}

@When("^User click on Search button$")
public void user_click_on_Search_button() throws Throwable {
    }

@Then("^Search results should be displayed$")
public void search_results_should_be_displayed() throws Throwable {
   }


	
}
