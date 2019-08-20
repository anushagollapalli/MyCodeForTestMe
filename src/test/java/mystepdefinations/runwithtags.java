package mystepdefinations;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class runwithtags { 
	@Given("launch the application")
	public void launch_the_application() {
		System.out.println("application is launched");
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
	}

	@Given("enter credentials")
	public void enter_credentials() {
	    // Write code here that turns the phrase above into concrete actions
	   // throw new cucumber.api.PendingException();
		System.out.println("entered credentials");
	}

	@Then("click on login")
	public void click_on_login() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		System.out.println("logged in");
	}

	@Given("user searching the product with code")
	public void user_searching_the_product_with_code() {
	    // Write code here that turns the phrase above into concrete actions
	   // throw new cucumber.api.PendingException();
		System.out.println("searched for products");
	}

	@Then("user able to add it to cart")
	public void user_able_to_add_it_to_cart() {
	    // Write code here that turns the phrase above into concrete actions
	   // throw new cucumber.api.PendingException();
		System.out.println("added to cart");
	}

	@Given("user able to see items count in his cart")
	public void user_able_to_see_items_count_in_his_cart() {
	    // Write code here that turns the phrase above into concrete actions
	   // throw new cucumber.api.PendingException();
		System.out.println("can see items count");
	}

	@Then("user can remove items from cart")
	public void user_can_remove_items_from_cart() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		System.out.println("items are removed");
	}

	@Given("user has active order")
	public void user_has_active_order() {
	    // Write code here that turns the phrase above into concrete actions
	   // throw new cucumber.api.PendingException();
		System.out.println("ordered");
	}

	@Then("user verifies the status of order")
	public void user_verifies_the_status_of_order() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		System.out.println("verified");
	}


	
}
