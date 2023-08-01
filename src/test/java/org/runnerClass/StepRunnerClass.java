package org.runnerClass;

import org.helper.Report;
import org.junit.AfterClass;
import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src\\test\\resources\\FeatureFile", glue = "org.loginFunction", monochrome = true, strict = true, 
plugin={"junit:Reports\\junit\\fb.xml", "json:Reports\\json\\facebook.json"})

public class StepRunnerClass {

	@AfterClass
	public static void allReports() {

		Report.toGenerateBDDReport("Reports\\json\\facebook.json");
		
		
	 }

	
	
}
