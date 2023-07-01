package org.Utilities;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.Status;

public class ListenerClass extends ExtentManager implements ITestListener  {

	@Override
	public void onFinish(ITestContext context) {
		extent.flush();
		
	}

	@Override
	public void onStart(ITestContext context) {
		extent =ExtentManager.SetupExtent();
	
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		
		
	}

	@Override
	public void onTestFailedWithTimeout(ITestResult result) {

		
	}

	@Override
	public void onTestFailure(ITestResult result) {
		test.log(Status.FAIL, "Test Case :"+result.getMethod().getMethodName()+" is Failed");	
		test.log(Status.FAIL, result.getThrowable());
		test.addScreenCaptureFromPath(BaseUtility.screenShot(BaseUtility.driver,"ScreenShot1"));
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		
	}

	@Override
	public void onTestStart(ITestResult result) {
		test=extent.createTest(result.getMethod().getMethodName());
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		test.log(Status.PASS, "Test Case :"+result.getMethod().getMethodName()+" is Passed");
		
	}


}