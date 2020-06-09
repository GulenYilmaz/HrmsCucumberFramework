package com.hrms.runners;
import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions (
		features = "src/test/resources/features/", //specify which feature file to run
					//in our case we do say to run all features inside features package
		glue="com/hrms/steps", //where we can find implementation code for gherkin steps?
					//we specify just package
		//dryRun=true, //if set to true it will quickly scan that all gherkin steps have implementation code
					// if set to true no actual execution will happen
	
	monochrome = true//translate the console output for the cucumber executing test are much more readable.
		,strict=true //tell unimplemented features steps without executing saves time
		, tags= "@inProgress"//
		)

public class TestRunner {

	
}