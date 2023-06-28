package Extentreport;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.ITestResult;
import org.testng.TestListenerAdapter;

public class ExtentReportListeners extends TestListenerAdapter {

    public ExtentReportListeners(){
        super();
    }

    ExtentReports extent;
    ExtentTest test;


    public void onStart(ITestContext testContext) {
        extent = new ExtentReports();

        test = extent.createTest(testContext.getName(), "Test Suite Execution");
    }

    public void onTestStart(ITestResult result) {
        // Create a test node in the report for each test method
        test = extent.createTest(result.getMethod().getMethodName(), result.getMethod().getDescription());
    }

    public void onTestSuccess(ITestResult result) {
        test.log(Status.PASS, "Test Passed");
    }

    public void onFinish(ITestContext testContext) {
        // Flush the report to save the changes
        extent.flush();

    }
}


