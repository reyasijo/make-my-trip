package com.MakeMyTrip.pageObjects;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
WebDriver ldriver;
	
	public HomePage(WebDriver rdriver)
	{
		ldriver=rdriver;
		PageFactory.initElements(ldriver, this);
	}
	@FindBy(xpath="//span[text()='Flights']")
	@CacheLookup
	WebElement flights;
	
	@FindBy(xpath="//li[contains(text(),'Round Trip')]")
	@CacheLookup
	WebElement roundtrip;
	
	@FindBy(id="fromCity")
	@CacheLookup
	WebElement fromCity;

	@FindBy(xpath="//input[contains(@placeholder,'From')]")
	@CacheLookup
	WebElement fromSearchBox;
	
	@FindBy(id="toCity")
	@CacheLookup
	WebElement toCity;
	
	@FindBy(xpath="//input[contains(@placeholder,'To')]")
	@CacheLookup
	WebElement toSearchBox;
	
	@FindBy(id="departure")
	@CacheLookup
	WebElement departureDate;
	
	@FindBy(xpath="//div[@class='DayPicker-Day DayPicker-Day--today']//p[contains(text(),'29')]")
	////div[@class='DayPicker-Day DayPicker-Day--start DayPicker-Day--end DayPicker-Day--selected']//p[contains(text(),'30')]
	@CacheLookup
	WebElement departureDay;
;
	
	@FindBy(id="return")
	@CacheLookup
	WebElement returnDate;
	
	@FindBy(xpath="//div[contains(@class,'DayPicker-Months')]//div[2]//div[3]//div[contains(text(),'7')]\"")
	@CacheLookup
	WebElement returnDay;
	
	@FindBy(xpath="//a[contains(@class,'primaryBtn font24 latoBold widgetSearchBtn')]")
	@CacheLookup
	WebElement searchbutton;
	
	public void clkFlightRoundtrip() throws InterruptedException
	{
		System.out.println("starting..........");
		
		Thread.sleep(5000);
		flights.click();
		roundtrip.click();
		System.out.println("***** Flight and Roundtrip *******");
	}
	
	public void enter_FromPlace() throws InterruptedException
	{
		Thread.sleep(5000);
		fromCity.click();
		fromSearchBox.click();
		fromSearchBox.sendKeys("Delhi");
		fromSearchBox.sendKeys(Keys.ARROW_DOWN);
		fromSearchBox.sendKeys(Keys.RETURN);
		System.out.println("***** From City Selected *******");
		
	}
	public void enter_ToPlace()
	{
		toCity.click();
		toSearchBox.click();
		toSearchBox.sendKeys("Delhi");
		toSearchBox.sendKeys(Keys.ARROW_DOWN);
		toSearchBox.sendKeys(Keys.RETURN);
		System.out.println("***** To City Selected *******");
	}
	
	public void settingDates()
	{
		departureDate.click();
		departureDay.click();
		returnDate.click();
		returnDay.click();
	}
	
	public void search()
	{
		searchbutton.click();
	}
	
	

}
