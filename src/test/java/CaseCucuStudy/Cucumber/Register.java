package CaseCucuStudy.Cucumber;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import CaseCucuStudy.Cucumber.UtilityClass;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class Register {
	WebDriver driver;
 	Boolean b1=false;
	
	@Given("^user must be on the signup page$")
	public void user_must_be_on_the_signup_page() throws Throwable {
		driver = UtilityClass.openBrowser("chrome");
		driver.get("http://10.232.237.143:443/TestMeApp/fetchcat.htm");
  		System.out.println("u r on the sign up page");
		driver.findElement(By.linkText("SignUp")).click();
  		System.out.println("u r on the sign up page");

		
  	}

	@When("^user enters \"([^\"]*)\" as username$")
	public void user_enters_as_username(String arg1) throws Throwable {
		driver.findElement(By.name("userName")).sendKeys(arg1);
		
  	}

	@When("^user enters \"([^\"]*)\" as firstname$")
	public void user_enters_as_firstname(String arg1) throws Throwable {
		driver.findElement(By.name("firstName")).sendKeys(arg1);

	}

	@When("^user enters \"([^\"]*)\" as lastname$")
	public void user_enters_as_lastname(String arg1) throws Throwable {
		driver.findElement(By.name("lastName")).sendKeys(arg1);

  	}

	@When("^user enters \"([^\"]*)\" as password$")
	public void user_enters_as_password(String arg1) throws Throwable {
		driver.findElement(By.name("password")).sendKeys(arg1);

	}

	@When("^user enters \"([^\"]*)\" as confirm password$")
	public void user_enters_as_confirm_password(String arg1) throws Throwable {
		driver.findElement(By.name("confirmPassword")).sendKeys(arg1);

  	}
	@When("^user selects his/her as gender$")
	public void user_selects_his_her_as_gender() throws Throwable {
		driver.findElement(By.xpath("//input[@value='Male' and @type='radio']")).click();

  	}

	@When("^user enters \"([^\"]*)\" as mailid$")
	public void user_enters_as_mailid(String arg1) throws Throwable {
		driver.findElement(By.name("emailAddress")).sendKeys(arg1);

 	}

	@When("^user enters \"([^\"]*)\" as mobno$")
	public void user_enters_as_mobno(String arg1) throws Throwable {
		driver.findElement(By.name("mobileNumber")).sendKeys(arg1);

  	}

	@When("^user enters \"([^\"]*)\" as dob$")
	public void user_enters_as_dob(String arg1) throws Throwable {
        driver.findElement(By.name("dob")).sendKeys(arg1);

  	}

	@When("^user enters \"([^\"]*)\" as address$")
	public void user_enters_as_address(String arg1) throws Throwable {
		driver.findElement(By.name("address")).sendKeys(arg1);

	}

	@When("^user selects \"([^\"]*)\" as security que$")
	public void user_selects_as_security_que(String arg1) throws Throwable {
		Select sel=new Select(driver.findElement(By.name("securityQuestion")));
		sel.selectByIndex(2);
  	}

	@When("^user enters \"([^\"]*)\" as security answer$")
	public void user_enters_as_security_answer(String arg1) throws Throwable {
		driver.findElement(By.name("answer")).sendKeys(arg1);

	}

	@When("^user clicks on the register button$")
	public void user_clicks_on_the_register_button() throws Throwable {
		driver.findElement(By.name("Submit")).click();

  	}

	@Then("^user registers successfully$")
	public void user_registers_successfully() throws Throwable {
		Assert.assertEquals("Login", driver.getTitle());
		
		System.out.println("Sign up Successfully !!");
		
  	}
}
