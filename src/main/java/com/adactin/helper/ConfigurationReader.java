package com.adactin.helper;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfigurationReader {
	
	  public static Properties pro;
	  public ConfigurationReader() throws Exception {
                 try {
					File f= new File(System.getProperty("user.dir")+"\\src\\test\\resource\\com\\cucumber\\properties\\Configuration.properties");
					 FileInputStream fis=new FileInputStream(f);
					 pro=new Properties();
					 pro.load(fis);
				} catch (Exception e) {
					e.printStackTrace();
					throw new Exception("File Not Found/Not Loaded Properly");
				}
	  }

	  public  String getBrowserName() throws Exception {
                  String browserName = pro.getProperty("BrowserName");
                  if(browserName==null){
                	  throw new Exception("BrowserName Property Is Not Found In The Configuration.properties File");                	  
                  }
                  return browserName;
                  
	}
	  
	  public String getUrl() throws Exception {
            String url = pro.getProperty("Url");
            if (url==null) {
            	throw new Exception("Url Property Is Not Found In The Configuration.property File");
			}
            return url;
	}
}
