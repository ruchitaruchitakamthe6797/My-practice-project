package testNglistner;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(testNglistner.Listner.class)

public class TestClassListner {

  @Test
  public void Test1() {
	  Reporter.log("Tc 1");
  }
  @Test
  public void Test2() {
	  Assert.fail();
	  Reporter.log("Tc 2");
  }
  @Test(dependsOnMethods = {"Test2"})
  public void Test3() {
	  Reporter.log("Tc 3");
  }
}
