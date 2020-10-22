package com.raviautomation.runner;


import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.cucumber.testng.CucumberOptions;
import io.cucumber.testng.FeatureWrapper;
import io.cucumber.testng.PickleWrapper;
import io.cucumber.testng.TestNGCucumberRunner;

@CucumberOptions(features ="E:\\SeleniumTeaching\\CodeDemo\\CucumberTestNGExtentsFrameWork\\src\\main\\java\\com\\raviautomation\\features"
,glue={"com\\raviautomation\\steps"},
plugin= {"pretty",
		"json:target/json_output/cucumberTestNGReport.json",
		"rerun:target/rerun/rerun.txt"},
publish =true,
monochrome = true,
dryRun = false
)

public class TestRunner{

	private TestNGCucumberRunner testNGCucumberRunner;
	
	@BeforeClass(alwaysRun = true)
	public void setUpClass()
	{
		testNGCucumberRunner = new TestNGCucumberRunner(this.getClass());
	}
	
	@Test(description = "Run Cucumber Feature", dataProvider= "scenarios")
	public void runScenarios(PickleWrapper pickleWrapper, FeatureWrapper featureWrapper)
	{
		testNGCucumberRunner.runScenario(pickleWrapper.getPickle());
		
	}
	
	@DataProvider
	public Object[][] scenarios()
	{
		return testNGCucumberRunner.provideScenarios();
	}
	
	@AfterClass(alwaysRun = true)
	public void tearDownClass()
	{
		testNGCucumberRunner.finish();
	}
	

}
