package com.simantika.weather_reporting_comparator;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.jayway.jsonpath.JsonPath;

import io.restassured.RestAssured;
//import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

public class ApiTest extends WebTest {
	
	@Test
	public void getCityTemp() {
		// TODO Auto-generated method stub
		Response response=RestAssured.given()
        .baseUri("http://api.openweathermap.org")
        .queryParam("appid","7fe67bf08c80ded756e598d6f8fedaea")
        .queryParam("q", "Bengaluru")
        .log().all()
        .when()
        .get("/data/2.5/weather").andReturn();
         response.then().log().all().extract().response();
         
     	
         Double Farenh = JsonPath.read(response.body().asString(), "$.coord.lon");
         Double Celsius = JsonPath.read(response.body().asString(), "$.coord.lat");
         System.out.println(Celsius);
         System.out.println(Farenh);
         String temp1=Double. toString(Celsius);
         String temp2=Double. toString(Farenh);
         String temp3=temp1+" "+temp2;
         
         Assert.assertEquals(Web.tempWeb,temp3, "Temperature retrieved varies in web and API");
	     	
	
	}
}


    

