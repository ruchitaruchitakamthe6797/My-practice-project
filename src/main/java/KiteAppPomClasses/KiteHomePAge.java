package KiteAppPomClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KiteHomePAge {
	

	//Initialize data member
	@FindBy(xpath = "//span[@class='user-id']") private WebElement userID;
	@FindBy(xpath = "//a[@target='_self']") private WebElement logoutButton;
	
	//Constructor
	public KiteHomePAge(WebDriver driver){
		PageFactory.initElements(driver, this);
	}
	
	//Methods
	
	public String getUserId() {
		String actualUserId = userID.getText();
		return actualUserId;
	}
	public void ValidateUserID(String expecteduserid) {
		String actualUserId = userID.getText();
//		String expectedUserId = "ELR321";
		String expectedUserId = expecteduserid;
		if(actualUserId.equals(expectedUserId)) {
			System.out.println("User id matching");
		}
		else {
			System.out.println("User id is not  matching");
		}
	}
	public void ClickOnLogoutButton() throws InterruptedException {
		userID.click();
		Thread.sleep(200);
		logoutButton.click();
	}
	
}
