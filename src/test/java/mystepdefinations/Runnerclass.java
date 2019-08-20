package mystepdefinations;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="C:\\Users\\training_h2a.06.15\\Desktop\\selenium workspace\\cucumber123\\myfeatures\\demoontags.feature",glue="mystepdefinations",tags= {"@Regression,@Smoke"})

public class Runnerclass {

}
