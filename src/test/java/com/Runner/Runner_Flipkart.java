package com.Runner;

import java.io.IOException;

import org.testng.annotations.DataProvider;

import com.Utility.ExcelManager;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


@CucumberOptions(
		features="App/Flipkart_Excel.feature",
		glue= {"com.Steps"}
		)

public class Runner_Flipkart extends AbstractTestNGCucumberTests{
	@DataProvider(name="login")
	public Object[][] scenarois(){
		return super.scenarios();
	}


}
