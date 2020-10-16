package com.simantika.weather_reporting_comparator;

import java.io.IOException;

import org.testng.annotations.Test;

public class CompareWebAPIResult {
@Test
public void compare() throws IOException
{
	String s=Comparator.readAPIResponse().substring(5,9);
	
	
    System.out.println(s);
}
}