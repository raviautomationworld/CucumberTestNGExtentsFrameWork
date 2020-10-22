package com.raviautomation.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.raviautomation.testbase.TestBase;

public class LoginPage extends TestBase {
	
	
	@FindBy(name = "username")
	public WebElement userName;
	
	
	@FindBy(name = "password")
	public WebElement passWord;
	
	@FindBy(name = "submit")
	public WebElement login;
	
	@FindBy(name = "reset")
	public WebElement reset;
	
	@FindBy(xpath = "//div[@class='box']/h4[@align= 'center']")
	public WebElement userLoginText;
	
	@FindBy(xpath = "//div[@class='footer-g' and @align= 'center']")
	public WebElement applicationFooterText;
	
	@FindBy(xpath = "//div[@class='header-g']/h2")
	public WebElement applicationHeaderText;
	
	public LoginPage()
	{
		
		PageFactory.initElements(driver, this);
	}
	
	public void loginIntoApp()
	{
		userName.sendKeys(prop.getProperty("username"));
		passWord.sendKeys(prop.getProperty("password"));
		login.click();
	}
	
}
