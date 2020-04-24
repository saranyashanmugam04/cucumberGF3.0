package stepdefinition;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class StepDef {
	WebDriver driver;
	@Given("user should naviagtes to demowebshop on chrome browser")
	public void user_should_naviagtes_to_demowebshop_on_chrome_browser() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\saranya.a.shanmugam\\Downloads\\chromedriver_win32 (13)\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("http://demowebshop.tricentis.com");
	    
	}

	@When("user clicks on register link")
	public void user_clicks_on_register_link() {
		driver.findElement(By.linkText("Register")).click();
	   
	}

	@When("user selects gender")
	public void user_selects_gender() {
	    driver.findElement(By.id("gender-female")).click();
	}

	@When("user enters with first name")
	public void user_enters_with_first_name() {
	    driver.findElement(By.name("FirstName")).sendKeys("saranya");
	}

	@When("user enters with last name")
	public void user_enters_with_last_name() {
	    driver.findElement(By.name("LastName")).sendKeys("saro");
	}

	@When("user enters with email")
	public void user_enters_with_email() {
	    driver.findElement(By.name("Email")).sendKeys("saro@gmail.com");
	}

	@When("user enters with password")
	public void user_enters_with_password() {
	    driver.findElement(By.name("Password")).sendKeys("password@1");
	}

	@When("user enters with confirm password")
	public void user_enters_with_confirm_password() {
	    driver.findElement(By.name("ConfirmPassword")).sendKeys("password@1");
	}

	@When("user clicks on register button")
	public void user_clicks_on_register_button() {
	    driver.findElement(By.name("register-button")).click();
	}

	@Then("user should verify registration success")
	public void user_should_verify_registration_success() {
	   String title=driver.getTitle();
	   Assert.assertTrue(title.contains("Register"));
	   driver.close();
	}
	
	@Given("user enters with first name as {string}")
	public void user_enters_with_first_name_as(String fn) {
	   driver.findElement(By.name("FirstName")).sendKeys(fn);
	}

	@Given("user enters with last name as {string}")
	public void user_enters_with_last_name_as(String ln) {
	    driver.findElement(By.name("LastName")).sendKeys(ln);
	}

	@Given("user enters with email as {string}")
	public void user_enters_with_email_as(String email) {
		driver.findElement(By.name("Email")).sendKeys(email);
	}

	@Given("user enters with password as {string}")
	public void user_enters_with_password_as(String psd) {
		 driver.findElement(By.name("Password")).sendKeys(psd);

	}

	@Given("user enters with confirm password as {string}")
	public void user_enters_with_confirm_password_as(String confirmpsd) {
		 driver.findElement(By.name("ConfirmPassword")).sendKeys(confirmpsd);

	    
	}




}
