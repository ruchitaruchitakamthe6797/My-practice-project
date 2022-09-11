package KiteAppPomClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KiteLoginPage {

//initialize elements
	
	@FindBy(id= "userid") private WebElement UN;
	@FindBy(id = "password") private WebElement Pass;
	@FindBy(xpath ="//button[@type='submit']") private WebElement SendOtp;
	
	//Constructor
	
	public KiteLoginPage(WebDriver driver){
		PageFactory.initElements(driver, this);
	}
	
//	methods

	public void SendUserName(String userid) {
//		UN.sendKeys("ELR321");
		UN.sendKeys(userid);
	}
	
	public void SendPassword(String password) {
//		Pass.sendKeys("Dhana1111");
		Pass.sendKeys(password);
	}
	
	public void ClickOnSendOtp() {
		SendOtp.click();
	}

}
