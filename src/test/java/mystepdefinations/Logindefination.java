package mystepdefinations;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

public class Logindefination {

@Given("application is launched")
public void application_is_launched() {
    // Write code here that turns the phrase above into concrete actions
   // throw new cucumber.api.PendingException();
    System.out.println("application is launched");
}

@When("user enters credentials")
public void user_enters_credentials() {
    // Write code here that turns the phrase above into concrete actions
   // throw new cucumber.api.PendingException();
    System.out.println("enters credential");
}

}
