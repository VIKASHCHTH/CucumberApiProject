package Com.TestLuncher;

import org.testng.annotations.Listeners;

import cucumber.api.CucumberOptions;

//@Listeners(CustomReporter.class)
@CucumberOptions(features = (""),
         glue={"StepDefination"},
         tags={"vika11"},
         plugin={"html:target/custom-report/cucumber-htmlreports",
        		 "json:target/custom-report/cucumber-reports/cucumber-jsonreports.json",
        		 "junit:target/custom-report/cucumber-reports/cucumber-junitreports.xml",
        		 "io.qameta.allure.cucumber4jvm.AllureCucumber4jvm"})
         
public class TestLuncher{
// extends AbstractTestNGCucumberTest
}
