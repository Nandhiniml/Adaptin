package com.property;

import java.io.IOException;

public class ConfigurationHpZoho {

	public static ConfigurationRdZoho getinstance() throws IOException			{
		
		
		ConfigurationRdZoho cfz=new ConfigurationRdZoho();
		return cfz;
		
		
	}
		private ConfigurationHpZoho() {
			
		}
}
