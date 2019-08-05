package com.adactin.helper;

public class FileReaderManager {
	
	public static FileReaderManager fm=new FileReaderManager();
	
	public static FileReaderManager getInstance() {
                return fm;
	}

	private ConfigurationReader cr;

	public ConfigurationReader getCr() throws Exception {
		if (cr==null) {
			cr=new ConfigurationReader();
		}
		return cr;
	}
	
	
	
	
	
}
