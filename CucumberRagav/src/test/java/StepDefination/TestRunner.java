package StepDefination;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="E:\\Photon Workspace\\CucumberRagav\\src\\test\\resources\\Features\\LoginDemo.feature",glue= {"StepDefination"},
monochrome=true,
plugin= {"pretty","junit:target/JUnitReports/reports.xml"})

public class TestRunner {

}
