package com.simantika.weather_reporting_comparator;

import java.sql.Driver;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;




public class Web {
	public static String tempWeb;
	public static WebDriver driver;
	public static WebElement displayedCity;
	public static String[] arrOfStr;
	public static String tempWebCalc() throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\siman\\git\\MobileAutomationFramework\\MobileAutomationFramework\\target\\test-classes\\chromedriver.exe");
		 driver=new ChromeDriver();
		driver.get("https://www.ndtv.com/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[text()='No Thanks']")).click();
		driver.findElement(By.id("h_sub_menu")).click();
		Thread.sleep(3000);
		WebElement weatherlink=driver.findElement(By.xpath("//a[text()='WEATHER']"));
		weatherlink.click();
		WebElement sBox=driver.findElement(By.id("searchBox"));
		sBox.sendKeys("benga");
		WebElement selectCity=driver.findElement(By.id("Bengaluru"));
		if(selectCity.isSelected())
		{
		}
		else
		{
			selectCity.click();
		}
		
			
		
		displayedCity=driver.findElement(By.className("outerContainer"));
		WebDriverWait w=new WebDriverWait(driver,10);
		w.until(ExpectedConditions.visibilityOf(displayedCity));
		
if(displayedCity.getAttribute("title").equals("Bengaluru"))
{		
		WebElement tc=driver.findElement(By.className("temperatureContainer"));
		tc.isDisplayed();
		tempWeb=tc.getText();
	
		
			
		
	}

return tempWeb;
	}

		
	}


