package com.Steps;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.HomePage.HomePage_Flipkart;
import com.Utility.ExcelManager;

import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class Steps_Flipkart extends BaseTest{
	
HomePage_Flipkart fp;

	public Steps_Flipkart() {}
	
	@Before
	public void setUp(){
		initialization();
	}
	String url="https://www.flipkart.com/";
	
//	@After
//	public void tearDown() {
//		//driver.close();
//	}
	@Given("User is on Login Page")
	public void user_is_on_login_page() {
	    driver.get(url);
	}
	
//	@Then("^User enter \"([^\"]*)\" Email address or Mobile Number$")
//	public void user_enter_email_address_or_mobile_number(String string) {
//		fp=new HomePage_Flipkart(driver);
//	    fp.email.sendKeys(string);
//	}
//
//	@Then("^User enter \"([^\"]*)\" Password$")
//	public void user_enter_password(String string) {
//		fp=new HomePage_Flipkart(driver);
//		fp.password.sendKeys(string);
//	}
	@Then("User enter {string} and {int}")
	public void user_enter_and(String sheetName, Integer rowNumber) throws InvalidFormatException, IOException {
		fp=new HomePage_Flipkart(driver);
	   ExcelManager em=new ExcelManager();
	   List<Map<String,String>> testData=em.getData("C:\\Users\\SSAKPAL\\Downloads\\BDD_Flipkart_Excel\\BDD_Flipkart_Excel\\Flipkart _Login.xlsx", sheetName);
	   String email=testData.get(rowNumber).get("UserName");
	   String password=testData.get(rowNumber).get("Password");
	   fp.takedetailsfromExcel(email, password);
	}

	@Then("User click on login")
	public void user_click_on_login() throws InterruptedException {
		fp=new HomePage_Flipkart(driver);
	    fp.loginButton.click();
	    }
	
	@Then("User should enter the things which they want to search like {string}")
	public void user_should_enter_the_things_which_they_want_to_search_like(String string) throws InterruptedException {
		fp=new HomePage_Flipkart(driver);
	    fp.searchProducts.sendKeys(string);
	    Thread.sleep(3000);
	}

	@Then("User click on search button")
	public void user_click_on_search_button() throws InterruptedException {
		fp=new HomePage_Flipkart(driver);
	    fp.searchButton.click();
	    Thread.sleep(3000);
	}


	@Then("User should hover on {string}")
	public void user_should_hover_on(String string) throws InterruptedException{
		Actions action = new Actions(driver);
		Thread.sleep(3000);
		action.moveToElement(driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[2]/div/div/div[6]/a/div[1]/div/img"))).build().perform();
		Thread.sleep(1000);
		}
		
	@Then("User click on {string}")
	public void user_click_on(String string) throws InterruptedException {
		List<WebElement> list1 = driver.findElements(By.xpath("//a[@class='_6WOcW9']"));
		for (WebElement i : list1) {
        //System.out.println(i.getText());
			if (i.getText().contains(string)) {
				Thread.sleep(1000);
				i.click();
	}
//	@DataProvider(name="login")
//	public Object[][] getData() throws IOException{
//		Object data[][] = ExcelManager.getTestData("Sheet1");
//		return data;
//	}

		}}

}
