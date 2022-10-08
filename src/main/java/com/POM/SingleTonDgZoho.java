package com.POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class SingleTonDgZoho {

public static  WebDriver driver;
	
	public SingleTonDgZoho(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

public LoginPage getLogin_Page() {
	
	LoginPage lp=new LoginPage(driver);
	
	return lp ;
	
}

}
