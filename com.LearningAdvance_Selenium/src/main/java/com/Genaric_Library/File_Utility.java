package com.Genaric_Library;

import java.io.FileInputStream;
import java.util.Properties;

public class File_Utility {
	public static String getpropertyvalue(String key) throws Throwable{
	FileInputStream FIS= new FileInputStream("./src/test/resources/data/Common_data.properties");
	Properties prop=new Properties();
	prop.load(FIS);
	return prop.getProperty(key);
}

	}
