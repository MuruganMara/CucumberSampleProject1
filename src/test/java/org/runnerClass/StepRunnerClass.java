package org.runnerClass;

import org.helper.Report;
import org.junit.AfterClass;
import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="src\\test\\resources\\FeatureFile", 
glue="org.loginFunction", monochrome = true, strict = true, dryRun = false, plugin = {"html:Reports\\Html", "json:Reports\\json", "junit:Reports\\junit", "jvm: Reports\\JVM" })

public class StepRunnerClass {
	
	
//	@AfterClass
//	private void allReports() {
//
//		Report.toGenerateBDDReport("Reports\\json");
//		
//		
	//}

}
