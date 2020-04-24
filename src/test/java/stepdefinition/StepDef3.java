package stepdefinition;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.en.Given;

public class StepDef3 {
	WebDriver driver;
	
	@Given("launch application on chrome browser")
	public void launch_application_on_chrome_browser() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\saranya.a.shanmugam\\Downloads\\chromedriver_win32 (13)\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("http://demowebshop.tricentis.com");
	}

	@Given("click on login link")
	public void click_on_login_link() {
		LoginClass lc = PageFactory.initElements(driver, LoginClass.class);
		lc.clicklogin();
	}

	@Given("enter email as {string}")
	public void enter_email_as(String mailid) {
	   LoginClass.enteremail(mailid);
	}

	@Given("enter password as {string}")
	public void enter_password_as(String password) {
		LoginClass.enterpsd(password);
	}

	@Given("click on login")
	public void click_on_login() {
	    LoginClass.clickloginbutton();
	}



}
