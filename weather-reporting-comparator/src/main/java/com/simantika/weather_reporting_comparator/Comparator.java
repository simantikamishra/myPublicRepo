package com.simantika.weather_reporting_comparator;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Comparator {
	public static String readAPIResponse() throws IOException
	{
	FileReader FR = new FileReader("C:\\Users\\siman\\OneDrive\\Desktop\\TestVagrant\\APIResponse.txt");
	  BufferedReader BR = new BufferedReader(FR);
	  String Content=BR.readLine();
	  //Loop to read all lines one by one from file and print It.
	  while((Content = BR.readLine())!= null){
	   System.out.println(Content);
	   

}
	return Content;  
	}}
