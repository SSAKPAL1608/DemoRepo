package com.cg.project.stepdefs;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.cg.project.utils.DriverUtil;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class GoogleSearchStepDef {
	private  WebDriver driver;
	
	@Before
	public void setUpEnv() {
		driver= DriverUtil.getDriver();
	}

	@Given("User should open Google Home Page")
	public void user_should_open_Google_Home_Page() {
		driver.get("https://www.google.in");
	}

	@When("User enterd {string} in search box and click on submit button")
	public void user_enterd_in_search_box_and_click_on_submit_button(String string) {
		WebElement searchElement = driver.findElement(By.name("q"));
		WebElement submitBtn = driver.findElement(By.name("btnK"));
		searchElement.sendKeys(string);
		submitBtn.submit();
	}

	@Then("Multiple Links should be displayed on {string} topic")
	public void multiple_Links_should_be_displayed_on_topic(String string) {
		String expectedTitle=string+ " - Google Search";
		String actualTitle=driver.getTitle();
		Assert.assertEquals(expectedTitle, actualTitle);
	}

	@When("User enterd {string} in serach box")
	public void user_enterd_in_serach_box(String string) {
		WebElement searchElement1 =driver.findElement(By.name("q"));
		searchElement1.sendKeys(string);
	}

	@When("click on submit button")
	public void click_on_submit_button() {
		WebElement submitBtn1 = driver.findElement(By.name("btnK"));
		submitBtn1.submit();
	}

	@Then("google should display map between {string} and also display the distance in KM")
	public void google_should_display_map_between_and_also_display_the_distance_in_KM(String string) {
     String exp = "Pune Mumbai Distance - Google Search";
     String act = driver.getTitle();
     Assert.assertEquals(exp, act);
	}

	@Given("User should open Google translater page")
	public void user_should_open_Google_translater_page() {
     
	}

	@When("User enterd {string} into {string} language and select {string} language")
	public void user_enterd_into_language_and_select_language(String string, String string2, String string3) {

	}

	@Then("Google translater should display {string} into {string} language")
	public void google_translater_should_display_into_language(String string, String string2) {

	}

	@After
	public void tearDownEnv() {
			driver.quit();
			driver= null;
	}
}