package com.stepdefinition;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.POM.SingleTonDgZoho;
import com.Zoho.Base_Class;
import com.Zoho.XLS_Read;

import com.property.ConfigurationHpZoho;
import com.runner.Runner;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinition  extends Base_Class{
	public static WebDriver driver =Runner.driver;
	
	public static SingleTonDgZoho stz=new SingleTonDgZoho(driver);
	
   @Given("^user launch the Zoho website$")
  public void user_launch_the_Zoho_website() throws Throwable {
	
	   
	   
	   String url=ConfigurationHpZoho.getinstance().geturl();
		geturl(url);
		maxi();
	   
	   
	   //driver.get("https://www.zoho.com/login.html");
	
			//WebElement singup = driver.findElement(By.xpath("//*[@id='block-system-main']/div/div[2]/div/div[4]/p[2]/a"));
			//singup.click();
			
	 //  click(singup);
			
}
   @When("^user click the signup$")
   public void user_click_the_signup() throws Throwable {
	   
   click(stz.getLogin_Page().getsignup());
   }
@When("^user enter the user name$")
public void user_enter_the_user_name() throws Throwable {
	
	String username= ConfigurationHpZoho.getinstance().getusername();
	sendkeys(stz.getLogin_Page().getUsername(), username);

	// String value = XLS_Read.particularData("Zoho", 0, 1);
	//	WebElement emailId = driver.findElement(By.id("emailfield"));
	    // emailId.sendKeys(value);
		//click(emailId);
		Thread.sleep(1000);
}

@When("^user enter the password$")
public void user_enter_the_password() throws Throwable {
		
	String passwrd= ConfigurationHpZoho.getinstance().getpass();
	sendkeys(stz.getLogin_Page().getPassword(),passwrd);
	
	
	
	//String value1 = XLS_Read.particularData("Zoho", 1, 1);
		//WebElement password = driver.findElement(By.id("password"));
		//click(password);
	//password.sendKeys(value1);
		Thread.sleep(1000);
    
}

@When("^user click the radio button$")
public void user_click_the_radio_button() throws Throwable
{
	click(stz.getLogin_Page().getradiobutton());
}
@Then("^login the application$")
public void login_the_application() throws Throwable {
	click(stz.getLogin_Page().getsign());

	
	TakesScreenshot ts1 = (TakesScreenshot) driver;
	File s5 = ts1.getScreenshotAs(OutputType.FILE);
	File d1 = new File("C:\\Users\\Dinesh\\eclipse-workspace\\Zoho\\screenshot\\zoho.png");
	FileUtils.copyFile(s5, d1);
	Thread.sleep(2000);

	
	
	//WebElement button = driver.findElement(By.xpath("//*[@id='signup-termservice']"));
	//button.click();
	//click(button);

//	WebElement signupclick = driver.findElement(By.xpath("//*[@id='signup-termservice']"));
	//signupclick.submit();
	//click(signupclick);
         
	
}
    
}



