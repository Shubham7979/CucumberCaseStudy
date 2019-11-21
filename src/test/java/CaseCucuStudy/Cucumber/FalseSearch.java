package CaseCucuStudy.Cucumber;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class FalseSearch {
	WebDriver driver;
	
	@Given("^user has registered into testme app$")
	public void user_has_registered_into_testme_app() throws Throwable {
		driver = UtilityClass.openBrowser("chrome");
		driver.get("http://10.232.237.143:443/TestMeApp/login.htm");
 		driver.findElement(By.name("userName")).sendKeys("Lalitha");
		driver.findElement(By.name("password")).sendKeys("Password123");
 		driver.findElement(By.name("Login")).click();
		//System.out.println("");
	}

	@When("^User search a product \"([^\"]*)\"$")
	public void user_search_a_product(String arg1) throws Throwable {
  	driver.findElement(By.name("products")).sendKeys(arg1);
  	
  	driver.findElement(By.xpath("//input[@value ='FIND DETAILS']")).click();
	}

	@When("^try to proceed to payment without adding any item into the cart$")
	public void try_to_proceed_to_payment_without_adding_any_item_into_the_cart() throws Throwable {
	
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	//Assert.assertSame(driver.findElement(By.name("SignOut")), driver.findElement(By.partialLinkText("Cart")));
  	System.out.println("I m here on sign out!!!!"); 
  	//Assert.assertEquals(driver.findElement(By.partialLinkText("Cart")));
	Assert.assertEquals("Search", driver.getTitle());
	}

	@Then("^testme app doesnt display cart item$")
	public void testme_app_doesnt_display_cart_item() throws Throwable {
  	System.out.println("Test mee app does not display the cart item");
	}

}
