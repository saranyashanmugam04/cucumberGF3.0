package stepdefinition;

import cucumber.api.java.en.Given;

public class StepDef1 {
	@Given("user navigates to demowebsop on chrome")
	public void user_navigates_to_demowebsop_on_chrome() {
	  System.out.println("user navigates to demowebshop");
	}

	@Given("user enter {string} in search store")
	public void user_enter_in_search_store(String productname) {
		  System.out.println("user entered product name as "+productname);

	}

	@Given("verify whether the application displayed with computer product")
	public void verify_whether_the_application_displayed_with_computer_product() {
		  System.out.println("verfied success");

	}

	@Given("user adding product to a cart")
	public void user_adding_product_to_a_cart() {
	    System.out.println("user adding a product to cart");
	}

	@Given("user proceeding to payment")
	public void user_proceeding_to_payment() {
		  System.out.println("user proceeding to payment");

	}

	@Given("close browser")
	public void close_browser() {
		  System.out.println("user closing the browser");

	}
	
	
	



}
