package com.Zoho_Proj;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.Zoho.Base_Class;
import com.Zoho.XLS_Read;

public class ZohoLogin extends Base_Class {

	public static void main(String[] args) throws IOException, InterruptedException {
	
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dinesh\\eclipse-workspace\\AllEcomProject\\webdriver\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.zoho.com/login.html");
		WebElement singup=driver.findElement(By.xpath("//*[@id='block-system-main']/div/div[2]/div/div[4]/p[2]/a"));
		//singup.click();
		click(singup);
		
		WebElement emailId=driver.findElement(By.id("emailfield"));
		//emailId.sendKeys("nandy054@gmail.com");
		click(emailId);
		String value= XLS_Read.particularData("Zoho",0,0);

		
		WebElement password=driver.findElement(By.id("password"));
		//password.sendKeys("@Nan@1234567");
		click(password);
		String pd = XLS_Read.particularData("Zoho",0,1);	
		
		WebElement radiobutton = driver.findElement(By.xpath("//*[@class='sign_agree']/span[@id='signup-termservice']"));

		radiobutton.click();
		
		Thread.sleep(2000);
		
		WebElement login = driver.findElement(By.id("signupbtn"));
		login.click();
		
		TakesScreenshot ts = (TakesScreenshot) driver;
		File s = ts.getScreenshotAs(OutputType.FILE);
		File d = new File("C:\\Users\\Dinesh\\eclipse-workspace\\Zoho\\screenshot\\zoho.png");
		FileUtils.copyFile(s, d);
		// FileHandler.copy(s, d);
		
		

	}

}
