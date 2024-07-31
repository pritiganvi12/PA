package DataDrivingTesting;

import java.io.File;
import java.io.FileInputStream;

import java.io.IOException;
import java.util.Properties;

public class ToFetchingDtaFromPropertiesFile {
	public static void main(String[] args) throws IOException {
	File f=new File("C:\\Users\\Karishma\\eclipse-workspace\\Automation\\Test Data\\Demo WebShop.properties");     //(1st create folder go to project automation>>rightcli>>)
	FileInputStream fis=new FileInputStream(f);
	Properties pop=new Properties();
	pop.load(fis);
  String url=pop.getProperty("url");
  System.out.println(url);
  System.out.println(pop.getProperty("email"));
  System.out.println(pop.getProperty("password"));
  
	
}
}
