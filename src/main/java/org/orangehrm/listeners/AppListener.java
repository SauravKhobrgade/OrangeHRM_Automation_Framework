package org.orangehrm.listeners;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class AppListener implements ITestListener {
    @Override
    public void onStart(ITestContext context) {
        System.out.println("**On Start**");
    }
    @Override
    public void onFinish(ITestContext context) {
        System.out.println("**On Finish**");
    }

    @Override
    public void onTestStart(ITestResult result) {
        System.out.println("Test case is going to excute :"+result.getName());
    }

    @Override
    public void onTestSuccess(ITestResult result) {
        System.out.println("START: " + result.getName());
    }

    @Override
    public void onTestFailure(ITestResult result) {
        System.out.println("START: " + result.getName());
    }

    @Override
    public void onTestSkipped(ITestResult result) {
        System.out.println("START: " + result.getName());
    }

}
