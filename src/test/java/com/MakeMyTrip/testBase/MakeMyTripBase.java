package com.MakeMyTrip.testBase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class MakeMyTripBase {
public WebDriver driver;
	
	@BeforeClass
	public void setup()
	{
		System.setProperty("webdriver.chrome.driver","/Users/reya/Documents/Selenium/Drivers/chromedriver 2");

		driver = new ChromeDriver();
	}
	
	@AfterClass
	public void teardown()
	{
		driver.quit();
	}
	

}
