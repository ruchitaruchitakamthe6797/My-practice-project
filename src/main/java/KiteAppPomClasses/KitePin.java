package KiteAppPomClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KitePin {

	@FindBy(id ="pin") private WebElement Pin;
	@FindBy(xpath = "//button[@type='submit']") private WebElement Continue;
	
	//Constructr
	public KitePin(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	//Methods
	
	public void SendPin(String pinnumber) {
//		Pin.sendKeys("982278");
		Pin.sendKeys(pinnumber);
	}
	
	public void ClickOnContinue() {
		Continue.click();
	}
	
}
