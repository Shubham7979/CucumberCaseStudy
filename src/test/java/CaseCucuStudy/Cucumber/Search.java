package CaseCucuStudy.Cucumber;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Search {
			WebDriver driver;
	@Given("^user must be on the home page$")
	public void user_must_be_on_the_home_page() throws Throwable { 
		
		driver = UtilityClass.openBrowser("chrome");
		driver.get("http://10.232.237.143:443/TestMeApp/login.htm");
 		driver.findElement(By.name("userName")).sendKeys("Lalitha");
		driver.findElement(By.name("password")).sendKeys("Password123");
 		driver.findElement(By.name("Login")).click();
		
		System.out.println("Yes im in the Home Page!!!");
	}

	@When("^User enters \"([^\"]*)\" in search tab$")
	public void user_enters_in_search_tab(String arg1) throws Throwable {
		
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.findElement(By.name("products")).sendKeys(arg1);
  
		}

	@When("^User clicks first option$")
	public void user_clicks_first_option() throws Throwable {
		driver.findElement(By.xpath("//*[@id=\"myInput\"]")).click();
  	}

	@When("^User clicks on the Find Deatails$")
	public void user_clicks_on_the_Find_Deatails() throws Throwable {
		driver.findElement(By.xpath("//input[@value = 'FIND DETAILS']")).click();
		
  	}

	@When("^User clicks on the Add to cart$")
	public void user_clicks_on_the_Add_to_cart() throws Throwable {
		driver.findElement(By.linkText("Add to cart")).click();
		  
  	}

	@Then("^User Must be in the search page$")
	public void user_Must_be_in_the_search_page() throws Throwable {
		Assert.assertEquals("Search", driver.getTitle());
		System.out.println("User is in the search page only");
  	}

}
