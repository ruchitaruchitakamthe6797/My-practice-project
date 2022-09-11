package testNglistner;

import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

import BaseClasses.BaseClassUSingProperty;


public class Listner implements ITestListener {

	BaseClassUSingProperty b=new BaseClassUSingProperty();
	//onTetPass
	//onTestFailed
	//onTestSkipped
	//onTestSuccess
	
	public void onTestFailure(ITestResult result) {
		Reporter.log("TC failed , Take screenshot",true);
//		ITestListener.super.onTestFailure(result);
//		try {
//			b.ScrenShot(result.getName());
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
	}
	public void onTestSkipped(ITestResult result) {
		Reporter.log("TC Skipped , Please check dependendat TC",true);
//		ITestListener.super.onTestSkipped(result);
//		try {
//			b.ScrenShot(result.getName());
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
	}
	@Override
	public void onTestSuccess(ITestResult result) {
		Reporter.log("TC Success",true);
//		ITestListener.super.onTestSuccess(result);
//		try {
//			b.ScrenShot(result.getName());
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
	}
	@Override
	public void onTestStart(ITestResult result) {
		Reporter.log("TC Start",true);
		ITestListener.super.onTestStart(result);
	}
	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		Reporter.log("TC failed But Within Success Percentage, Take screenshot",true);
		ITestListener.super.onTestFailedButWithinSuccessPercentage(result);
	}
	@Override
	public void onTestFailedWithTimeout(ITestResult result) {
		Reporter.log("TC failed With Timeout, Take screenshot",true);
		ITestListener.super.onTestFailedWithTimeout(result);
	}
}
