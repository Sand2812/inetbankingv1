package com.inetbanking.utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class ReadConfig {

	Properties pro;
	public ReadConfig() {
		File src=new File("./Configuration/config.properties");
		try {
			FileInputStream fis=new FileInputStream(src);
			pro=new Properties();
			pro.load(fis);
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("Exception is" +e.getMessage());
		}
	}
	public String getApplicationURL() {
		String url=pro.getProperty("baseURL");
		return url;
	}
	public String getUserName() {
		String usname=pro.getProperty("username");
		return usname;
	}
	public String getPassword() {
		String pwd=pro.getProperty("password");
		return pwd;
	}
	public String getChromePath() {
		String chrmepath=pro.getProperty("chromepath");
		return chrmepath;
	}
	public String getFirefoxPath() {
		String fiefoxpath=pro.getProperty("firefoxpath");
		return fiefoxpath;
	}
	
}

