package com.hrms.runners;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)// I would like to execute with cucumber class
@CucumberOptions(// any configurations inside the this file
		features="\\src\\test\\resources\\features\\GoogleSeacrh.feature"// which feature would you like to run
		
		)

public class GoogleSearchRunner {//configuration class

}
