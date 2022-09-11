package UtilityClasses;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;


public class UtilityClassUsingProperty {

	public static String readDataUsingProperty(String key) throws IOException {
		Properties prop=new Properties();
		
		FileInputStream myprop=new FileInputStream("C:\\Users\\Dell\\eclipse-workspace\\MavenProject\\myTestData.properties");
		
		prop.load(myprop);
		
		String value = prop.getProperty(key);
		return value;
	}
	
	public static void Time(WebDriver driver,int time) {
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(time));
		 
	}
	public static void Scrolling() {
		
	}



}
