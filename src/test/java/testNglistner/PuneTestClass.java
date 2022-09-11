package testNglistner;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class PuneTestClass {
  @Test
  public void Katraj() {
	  Reporter.log("Katraj City",true);
  }
  @Test
  public void Hadpsar() {
	  Reporter.log("Hadpsar City",true);
  }
}
