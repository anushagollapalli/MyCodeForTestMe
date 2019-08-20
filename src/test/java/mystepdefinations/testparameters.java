package mystepdefinations;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class testparameters {
	WebDriver driver;

@Given("testme app is launched")
public void testme_app_is_launched() {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\training_h2a.06.15\\Downloads\\SeleniumBroDrivers\\SeleniumBroDrivers\\chromedriver.exe");
	 driver=new ChromeDriver();
	 driver.get("http://10.232.237.143:443/TestMeApp/fetchcat.htm");
    // Write code here that turns the phrase above into concrete actions
    //throw new cucumber.api.PendingException();
}

@When("user clicks on Signin inlanding page")
public void user_clicks_on_Signin_inlanding_page() {
	driver.findElement(By.xpath("//*[@id=\"header\"]/div[1]/div/div/div[2]/div/ul/li[1]/a")).click();
    // Write code here that turns the phrase above into concrete actions
   // throw new cucumber.api.PendingException();
}

@Then("user provides valid username {string}")
public void user_provides_valid_username(String string) {
	driver.findElement(By.name("userName")).sendKeys(string);
	
    // Write code here that turns the phrase above into concrete actions
  //  throw new cucumber.api.PendingException();
}

@Then("user provides the valid password {string}")
public void user_provides_the_valid_password(String string) {
	driver.findElement(By.name("password")).sendKeys(string);
    // Write code here that turns the phrase above into concrete actions
   // throw new cucumber.api.PendingException();
}

@Then("user clicks for submission of the data")
public void user_clicks_for_submission_of_the_data() {
	driver.findElement(By.xpath("/html/body/main/div/div/div/form/fieldset/div[4]/div/input[1]")).click();
    // Write code here that turns the phrase above into concrete actions
   // throw new cucumber.api.PendingException();
}

@Then("verifies the login status for the account")
public void verifies_the_login_status_for_the_account() {
String actual="SignOut";
	
	String expected=driver.findElement(By .xpath("//*[@id=\"header\"]/div[1]/div/div/div[2]/div/ul/a")).getText();
	 System.out.println(expected);
	
	 Assert.assertEquals(expected,actual);
	 driver.findElement(By.xpath("//*[@id=\\\"header\\\"]/div[1]/div/div/div[2]/div/ul/a")).click();
    // Write code here that turns the phrase above into concrete actions
   // throw new cucumber.api.PendingException();
}
}
