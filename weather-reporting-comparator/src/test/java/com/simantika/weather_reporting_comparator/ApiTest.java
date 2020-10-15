package com.simantika.weather_reporting_comparator;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class ApiTest {
	
	@Test
	public void getCityTemp() {
		// TODO Auto-generated method stub
		Response response=RestAssured.given()
        .baseUri("api.openweathermap.org/data/2.5/weather")
        .queryParam("apiid","7fe67bf08c80ded756e598d6f8fedaea")
        .queryParam("q", "Bengaluru")
        .log().all()
        .when()
        .get("/data/2.5/weather").andReturn();
         response.then().log().all().extract().response();
         String str1=response.getBody().asString();
     	 System.out.println(str1);
		
		
	}
}


    

