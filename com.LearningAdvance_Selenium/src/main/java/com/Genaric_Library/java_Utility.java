package com.Genaric_Library;

import java.util.Date;

public class java_Utility {

	public static String getName()
	{
	String date= new Date().toString().replace(" ", "_").replace(";", "_");
	String name= "Report_"+ date;
	return name;

}}




























