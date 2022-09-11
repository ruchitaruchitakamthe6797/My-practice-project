package BaseClasses;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import UtilityClasses.UtilityClassUsingProperty;

public class BaseClassUSingProperty {
	
	protected static WebDriver driver;

	public void baseClassProperty() throws IOException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Public\\Downloads\\flutter\\selenium\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get(UtilityClassUsingProperty.readDataUsingProperty("URL"));
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(0));

		
	}
	public void ScrenShot(String tcname) throws IOException {
		 File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);	
		 File dest = new File("C:\\Users\\Public\\Downloads\\flutter\\flutter_auto\\screenshot\\"+tcname+".png");
		 FileHandler.copy(src, dest);
		 driver.manage().timeouts().implicitlyWait(Duration.ofMillis(200));
		
	}
}
