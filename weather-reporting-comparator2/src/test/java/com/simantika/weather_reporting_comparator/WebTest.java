package com.simantika.weather_reporting_comparator;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class WebTest extends Web{

	@Test
	public void validatePresenceCityandTemperature() throws Exception
	{
      String Temp=Web.tempWebCalc();
      System.out.println(Temp);
		
	}
	
}
