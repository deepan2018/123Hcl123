package StepDef;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Steps {
	static WebDriver driver;
	//import given 
	@Given("to open the chrome browser and url of the application")
	public void to_open_the_chrome_browser_and_url_of_the_application() {
	    // Write code here that turns the phrase above into concrete actions
		System.setProperty("webdriver.chrome.driver", "E:\\ChromeDriver\\chromedriver.exe");
		 driver = new ChromeDriver();
	}
	
	@When("enter username and password")
	public void enter_username_and_password() {
driver.get("https://www.facebook.com/r.php");
		
		
		
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("username");
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("password");
		driver.findElement(By.xpath("//button[@name='websubmit']")).click();
	    // Write code here that turns the phrase above into concrete actions
	   
	}
	@Then("login to account")
	public void login_to_account() {
		
		
	    // Write code here that turns the phrase above into concrete actions
	    
	}
}
