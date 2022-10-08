package com.runner;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.Zoho.Base_Class;

//import cucumber.api.CucumberOptions;
//import cucumber.api.junit.Cucumber;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features= "C:\\Users\\Dinesh\\eclipse-workspace\\Zoho\\src\\test\\java\\com\\feature\\Zoho.feature",
glue ="com.stepdefinition")

public class Runner {
	
	public static   WebDriver driver;

	@BeforeClass
	public static void Set_up() {
		driver=Base_Class.setPro("chrome");
		driver=Base_Class.maxi();
		
		
//		System.setProperty("webdriver.chrome.driver",
//				"C:\\Users\\Dinesh\\eclipse-workspace\\Zoho\\webdriver\\chromedriver.exe");
//		
//		driver= new ChromeDriver();
//		
//		driver.manage().window().maximize();
		
	}
	@AfterClass
	public static void tearDown() {
		//driver=Base_Class.close();
		
//	driver.close();
}
}
