package com.simantika.weather_reporting_comparator;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class WebTest extends Web{
Object Temp;
	@Test
	public Object validatePresenceCityandTemperature() throws Exception
	{
      Temp=Web.tempWebCalc();
      System.out.println(Temp);
		return Temp;
	}
	
}
