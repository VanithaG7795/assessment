package runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/feature/BillPay.feature",glue="stepdefinition", monochrome=true,dryRun=true,
plugin = {"pretty",
		"json:Report.json",
		"html:HtmlReport"}
		)

public class Runnerclass {

}
