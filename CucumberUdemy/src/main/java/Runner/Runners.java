package Runner;

import org.junit.runner.RunWith;
import org.testng.annotations.Test;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@RunWith(Cucumber.class)
@CucumberOptions(
		features="E:\\Photon Workspace\\CucumberUdemy\\src\\main\\java\\Features\\login3.feature"
		,glue= {"stepDef"},
		plugin = { "pretty", "html:target/cucumber-reports", "json:json_output/cucumber.json"},
		monochrome=true,
		strict=true,
		dryRun=false
		)

public class Runners 
{

}
