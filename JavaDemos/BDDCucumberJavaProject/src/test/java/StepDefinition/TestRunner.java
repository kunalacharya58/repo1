package StepDefinition;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)

//to run all the features
//@CucumberOptions(features="src\\test\\resources\\Features", glue = {"StepDefinition"})

@CucumberOptions(features="src\\test\\resources\\Features\\GoogleSearchPageFeature.feature",
				 glue = {"StepDefinition"},
				 monochrome=true,
				 plugin = {"pretty","json:target/JSONReports"},
				 tags="@GoogleSearch")

public class TestRunner { 

}

/*
 * glue will indicate the folder where TestRunner should look;
 * monochrome will present logs in much readable format.
 * plugin = {"pretty","html:target/HTMLReports"}
 * plugin = {"pretty","json:target/JSONReports"}
 * plugin = {"pretty","junit:target/JUnitReports/reports.xml"}
 */
