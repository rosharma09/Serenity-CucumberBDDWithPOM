package FeatureRunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(

		features = { "src/test/resources/features/FindNewCarFunctionality" }, glue = { "stepdefinations" }

)

public class AllFeatureRunner {

}
