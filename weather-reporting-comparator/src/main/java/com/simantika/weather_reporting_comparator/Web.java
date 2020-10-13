package com.simantika.weather_reporting_comparator;

import java.sql.Driver;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Web {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\siman\\git\\MobileAutomationFramework\\MobileAutomationFramework\\target\\test-classes\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.ndtv.com/");
		driver.manage().window().maximize();
		Thread.sleep(30000);
		driver.findElement(By.xpath("//a[text()='No Thanks']")).click();
		driver.findElement(By.id("h_sub_menu")).click();
		Thread.sleep(20000);
		WebElement weatherlink=driver.findElement(By.xpath("//a[text()='WEATHER']"));
		weatherlink.click();
	}

}
