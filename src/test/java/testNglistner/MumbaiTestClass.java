package testNglistner;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class MumbaiTestClass {
  @Test(dependsOnMethods = {"Washi"})
  public void Thane() {
	  Reporter.log("Thane cit",true);
  }
  
  @Test
  public void Washi() {
	  Assert.fail();
	  Reporter.log("Washi cit",true);
  }
}
