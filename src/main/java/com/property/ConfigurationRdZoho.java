package com.property;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfigurationRdZoho {

	private Properties p;

	public ConfigurationRdZoho() throws IOException {
		File f= new File("C:\\Users\\Dinesh\\eclipse-workspace\\Zoho\\src\\main\\java\\com\\property\\Zoho.properties");
	FileInputStream fi= new FileInputStream (f);
	p=new Properties();
	
	p.load(fi);
	
		
	}
public String getbrowser() {
	String browser = p.getProperty("browser");
	return browser;
}
	public String geturl() {
		String url = p.getProperty("url");
		return url;
	}
	
	public String getusername() {
		String username = p.getProperty("username");
		return username;
	}
	public String getpass() {
		String passwrd = p.getProperty("password");
		return passwrd;
	}
}
