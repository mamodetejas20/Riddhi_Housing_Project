package org.Utilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConFig {
public String getTestData(String key) {
		
		try {
			FileInputStream fis = new FileInputStream("D:\\acceleration\\Workspace\\Riddhi_Housing_Society\\PropertiesFile\\Config.properties");
			Properties prop = new Properties();
			prop.load(fis);
			return prop.getProperty(key);
		} catch (IOException e) {
			e.printStackTrace();
		}
		return null;
				
		}


	}

