package com.POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	public static WebDriver driver;


	@FindBy(xpath="//*[text()='Sign Up Now']")
	private WebElement signup;
	

	public WebElement getsignup() {
	
	return signup;
	 }

	@FindBy(id="emailfield")
	private WebElement username;
	
	public WebElement getUsername() {
		return username;
		
	}

	@FindBy(id="password")
	private WebElement pwd;
	
	public WebElement getPassword() {
		return pwd;
		
	}	
	
	
	@FindBy(id = "signup-termservice")
	private WebElement radiobutton;

	public WebElement getradiobutton() {
		return radiobutton;
	}

	@FindBy(id = "signupbtn")
	private WebElement sign;

	public WebElement getsign() {
		return sign;
	}
	

	public LoginPage (WebDriver driver1) {
		this.driver=driver1;
		PageFactory.initElements(driver, this);
	}



}
