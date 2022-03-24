package com.HomePage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.BasePage.BasePage_Flipkart;

public class HomePage_Flipkart extends BasePage_Flipkart{
	
	public HomePage_Flipkart(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//input[@class='_2IX_2- VJZDxU']")
	public WebElement email;
	
	@FindBy(xpath="//input[@class='_2IX_2- _3mctLh VJZDxU']")
	public WebElement password;
	
	@FindBy(xpath="//button[@class='_2KpZ6l _2HKlqd _3AWRsL']")
	public WebElement loginButton;

	@FindBy(xpath="//input[@class='_3704LK']")
	public WebElement searchProducts;
	
	@FindBy(xpath="//button[@type='submit']")
	public WebElement searchButton;
	
	@FindBy(xpath="//div[@class='_37M3Pb']")
	public WebElement home;
	
	@FindBy(xpath="//div[@class='_3XS_gI _7qr1OC']")
	public WebElement homeList;
	
	public void takedetailsfromExcel(String emailExcel,String passwordExcel)
	{
		email.sendKeys(emailExcel);
		password.sendKeys(passwordExcel);
	}


}
