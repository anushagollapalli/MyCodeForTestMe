package mystepdefinations;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class mercury_login {
	WebDriver driver;

@Given("user has launched the application")
public void user_has_launched_the_application() {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\training_h2a.06.15\\Downloads\\SeleniumBroDrivers\\SeleniumBroDrivers\\chromedriver.exe");
	 driver=new ChromeDriver();
	 driver.get("http://newtours.demoaut.com/");
	 // Write code here that turns the phrase above into concrete actions
    //throw new cucumber.api.PendingException();
}

@Then("User enters valid credentials")
public void user_enters_valid_credentials() {
	driver.findElement(By .name("userName")).sendKeys("demo");
	driver.findElement(By .name("password")).sendKeys("demo");
    // Write code here that turns the phrase above into concrete actions
   // new cucumber.api.PendingException();
}

@Then("user clicks on submit button")
public void user_clicks_on_submit_button() {
	driver.findElement(By .xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[2]/td[3]/form/table/tbody/tr[4]/td/table/tbody/tr[4]/td[2]/div/input")).click();
    // Write code here that turns the phrase above into concrete actions
    //throw new cucumber.api.PendingException();
}



@Then("user verifies the login status")
public void user_verifies_the_login_status() {
	
	 
	 boolean b=driver.findElement(By.linkText("SIGN-OFF")).isDisplayed();
	 Assert.assertTrue(b);
	 driver.findElement(By.linkText("SIGN-OFF")).click();
    // Write code here that turns the phrase above into concrete actions
   // throw new cucumber.api.PendingException();
}

@Then("user clicks on sign up link")
public void user_clicks_on_sign_up_link() {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\training_h2a.06.15\\Downloads\\SeleniumBroDrivers\\SeleniumBroDrivers\\chromedriver.exe");
	 driver=new ChromeDriver();
	 driver.get("http://newtours.demoaut.com/");
	driver.findElement(By .xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[2]/td/table/tbody/tr/td[2]/a")).click();
    // Write code here that turns the phrase above into concrete actions
   // throw new cucumber.api.PendingException();
}

@When("the user enters valid data in the form")
public void the_user_enters_valid_data_in_the_form() {
	driver.findElement(By .name("firstName")).sendKeys("anusha");
	driver.findElement(By .name("lastName")).sendKeys("sha");
	driver.findElement(By .name("phone")).sendKeys("9058897765");
	driver.findElement(By .name("userName")).sendKeys("anusha.gollapalli@gmail.com");
	driver.findElement(By .name("address1")).sendKeys("hyderabad");
	driver.findElement(By .name("city")).sendKeys("gajhbhbhk");
	driver.findElement(By .name("state")).sendKeys("hbhbhk");
	driver.findElement(By .name("postalCode")).sendKeys("gajhk");
	Select s=new Select(driver.findElement(By .name("country")));
    s.selectByValue("11");
    driver.findElement(By .name("email")).sendKeys("anusha.gollapalli");
    driver.findElement(By .name("password")).sendKeys("gollapalli");
    driver.findElement(By .name("confirmPassword")).sendKeys("gollapalli");
    
    
    
    // Write code here that turns the phrase above into concrete actions
   // throw new cucumber.api.PendingException();
}

@When("user clicks on submit button available")
public void user_clicks_on_submit_button_available() {
	driver.findElement(By .xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[18]/td/input")).click();
    
    // Write code here that turns the phrase above into concrete actions
   // throw new cucumber.api.PendingException();
}

@Then("user verifies the registration status")
public void user_verifies_the_registration_status() {
	String actual="SIGN_OFF";
	
	String expected=driver.findElement(By .xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[2]/td/table/tbody/tr/td[1]/a")).getText();
	 System.out.println(expected);
	
	 Assert.assertEquals(expected,actual);
	
    // Write code here that turns the phrase above into concrete actions
   // throw new cucumber.api.PendingException();
}

}
