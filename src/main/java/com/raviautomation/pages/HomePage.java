package com.raviautomation.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.raviautomation.testbase.TestBase;

public class HomePage extends TestBase {
	
	
	@FindBy(linkText = "Logout")
	public WebElement logout;
	
	
	@FindBy(linkText = "Registration")
	public WebElement registration;
	
	@FindBy(linkText = "Perminent Registration")
	public WebElement perminentRegistration;
	
	@FindBy(linkText = "Emergency Registration")
	public WebElement emergencyRegistration;
	
	@FindBy(linkText = "Search Registration")
	public WebElement searchRegistration;
	
	@FindBy(linkText = "Registration List")
	public WebElement registrationList;
	
	@FindBy(xpath = "//div[@class ='border']/h3")
	public WebElement borderText;
	
	@FindBy(xpath = "//div[@class ='box']/p/br")
	public WebElement aboutApplicationText;
	
	public HomePage()
	{
		
		PageFactory.initElements(driver, this);
	}
	
	
}
