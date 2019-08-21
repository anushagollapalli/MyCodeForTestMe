package mystepdefinations;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="C:\Users\training_h2a.06.15\Desktop\selenium workspace\cucumber123\myfeatures\demotourslogin.feature",glue="mystepdefinations",plugin= {"html:target/cucumber-htmlreport.html","json:target/cucumber.json"})

public class Runnerclass {

}
