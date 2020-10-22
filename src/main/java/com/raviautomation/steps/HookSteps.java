package com.raviautomation.steps;

import com.raviautomation.pages.LoginPage;
import com.raviautomation.testbase.TestBase;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class HookSteps extends TestBase {
	
	
	
	
	@Before(order = 0)
	public void openBrowser()
	{
		TestBase.intilization();
	}
	
	@Before(order = 1)
	public void navigateApp()
	{
		LoginPage loginPage = new LoginPage();
		loginPage.loginIntoApp();
	}
	
	@After
	public void closeBrowser()
	{
		driver.quit();
	}
	
}
