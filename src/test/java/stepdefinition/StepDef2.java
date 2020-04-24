package stepdefinition;

import cucumber.api.java.en.Given;

public class StepDef2 {
	
	@Given("user perform login")
	public void user_perform_login() {
		System.out.println("login");
	   
	}

	@Given("user perform search product available in catalog")
	public void user_perform_search_product_available_in_catalog() {
		System.out.println("search");

	}

	@Given("user selects the product")
	public void user_selects_the_product() {
		System.out.println("select");

	}

	@Given("user is moving the product to cart")
	public void user_is_moving_the_product_to_cart() {
		System.out.println("cart");

	}

	@Given("user closing browser")
	public void user_closing_browser() {
		System.out.println("close");

	}


}
