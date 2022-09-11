package testNglistner;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import BaseClasses.BaseClassUSingProperty;
import KiteAppPomClasses.KiteHomePAge;
import KiteAppPomClasses.KiteLoginPage;
import KiteAppPomClasses.KitePin;
import UtilityClasses.UtilityClassUsingProperty;


@Listeners(testNglistner.Listner.class)
public class ValidateUserUsingProperty extends BaseClassUSingProperty{
	
	KiteHomePAge home;
	KiteLoginPage login;
	KitePin pin;
	
	@BeforeClass
	public void LaunchBroser() throws IOException {
		baseClassProperty();
		login=new KiteLoginPage(driver);
		home=new KiteHomePAge(driver);
		pin =new KitePin(driver);
	}
	
	@BeforeMethod
	public void SendUserDetails() throws IOException {
		login.SendUserName(UtilityClassUsingProperty.readDataUsingProperty("UN"));
		login.SendPassword(UtilityClassUsingProperty.readDataUsingProperty("PWD"));
		UtilityClassUsingProperty.Time(driver, 200);
//		UtilityClass.takeScreenShot(driver);
	}
  @Test
  public void ValidateUserName() {
  }
}
