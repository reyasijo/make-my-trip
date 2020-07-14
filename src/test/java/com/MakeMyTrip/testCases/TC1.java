package com.MakeMyTrip.testCases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.MakeMyTrip.pageObjects.HomePage;
import com.MakeMyTrip.testBase.MakeMyTripBase;

public class TC1 extends MakeMyTripBase{

	
	@Test
	public void searchFlight() throws InterruptedException
	{
		
		driver.get("https://www.makemytrip.com");
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		HomePage hp=new HomePage(driver);
		//hp.clkFlightRoundtrip();
		//hp.enter_FromPlace();
		//hp.enter_ToPlace();
		hp.settingDates();
		hp.search();
		
	}
	
	
	
	
	
	
	
	
	
	
}
