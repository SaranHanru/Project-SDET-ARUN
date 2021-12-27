package com.crm.vtiger.genericFileUtility;

import java.io.IOException;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class ListenerImp extends BaseClass implements ITestListener {

	
	public void onTestStart(ITestResult result) {
		
		//String fileLocation = "E:\\Screenshot"+result.getName()+" "+ju.getSystemDate(); ;
		//String fileExtension = ".png" ;
		System.out.println("test started");
		try {
			wb.takeScreenshot(BaseClass.statdriver, ".//screenshot//"+result.getName()+" "+ju.getSystemDate(), ".png");
		} catch (IOException e) {
			e.printStackTrace();
		}	
	}

	
	public void onTestSuccess(ITestResult result) {
	}

	public void onTestFailure(ITestResult result) {
	}

	public void onTestSkipped(ITestResult result) {
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
	}

	public void onTestFailedWithTimeout(ITestResult result) {
	}

	public void onStart(ITestContext context) {
	}

	public void onFinish(ITestContext context) {
	}

}
