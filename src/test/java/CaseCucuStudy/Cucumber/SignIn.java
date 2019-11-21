package CaseCucuStudy.Cucumber;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import CaseCucuStudy.Cucumber.UtilityClass;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class SignIn {
	WebDriver driver;

	@Given("^User must be on the sign in page$")
	public void user_must_be_on_the_sign_in_page() throws Throwable {
		
		driver=UtilityClass.openBrowser("chrome");
		driver.get("http://10.232.237.143:443/TestMeApp/login.htm");
		
		System.out.println("Hello u r on the sign in page!!");
 	}

	@When("^user enters  \"([^\"]*)\"  as username$")
	public void user_enters_as_username(String arg1) throws Throwable {
		driver.findElement(By.name("userName")).sendKeys(arg1);

 	}

	@When("^user enters \"([^\"]*)\"  as password$")
	public void user_enters_as_password(String arg1) throws Throwable {
		driver.findElement(By.name("password")).sendKeys(arg1);

 	}

	@When("^user clicks on the sign in button$")
	public void user_clicks_on_the_sign_in_button() throws Throwable {
 		driver.findElement(By.name("Login")).click();

 	}

	@Then("^user is signed in successfully$")
	public void user_is_signed_in_successfully() throws Throwable {
  	System.out.println("Signed in successfully!!!");
	}

}
