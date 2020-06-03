package TestRunners;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/java/features", glue = "PracticeLang.stepDefinitions", strict = true, monochrome = true, tags = "@Chrome",
plugin = {"pretty","json:target/ymail_ff_report.json","de.monochromata.cucumber.report.PrettyReports:target/pretty-cucumber"})
public class SendEmailYMailFF {

}
