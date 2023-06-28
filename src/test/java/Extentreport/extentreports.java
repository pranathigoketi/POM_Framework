package Extentreport;

import Basetest.Baseclass;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class extentreports extends Baseclass {

    //public static void main(String args[]){

    ExtentReports extentReports;
    ExtentTest test;

    public extentreports(WebDriver driver) {
        super();
    }


    public void initiate() {

        ExtentReports extentReports = new ExtentReports();
        ExtentSparkReporter spark = new ExtentSparkReporter("C:\\Users\\PranathiGoketi-Kairo\\Documents\\POM_Framework\\report.html");
        extentReports.attachReporter(spark);


        ExtentTest test1 = extentReports.createTest("Login To The Browser");
        test1.log(Status.INFO, "Launching Of Login Page");
        test1.log(Status.PASS, "Test passed");

        test = extentReports.createTest("Username");
        test.log(Status.INFO, "Enter the Username");
        test.log(Status.PASS, "Test passed");

        test = extentReports.createTest("Password");
        test.log(Status.INFO, "Enter the password");
        test.log(Status.PASS, "Test passed");

        test = extentReports.createTest("Eye Icon");
        test.log(Status.INFO, "Clicking on Eyeicon");
        test.log(Status.PASS, " Test passed");

        test = extentReports.createTest("Check Box");
        test.log(Status.INFO, "Hit the Check Box");
        test.log(Status.PASS, "Test passed");

        test = extentReports.createTest("SignIn");
        test.log(Status.INFO, "Click on Signin");
        test.log(Status.PASS, "Test passed");

        test = extentReports.createTest("Dashboard");
        test.log(Status.INFO, "Navigate to Dashboard ");
        test.log(Status.PASS, "Test passed");

        test = extentReports.createTest("New Message");
        test.log(Status.INFO, "To create the new message");
        test.log(Status.PASS, "Test passed");

        test = extentReports.createTest("Compose");
        test.log(Status.INFO, "Compose a message");
        test.log(Status.PASS, "Test passed");

        test = extentReports.createTest("User ID");
        test.log(Status.INFO, "To click on the User ID");
        test.log(Status.PASS, "Test passed");

        test = extentReports.createTest("Subject");
        test.log(Status.INFO, "Enter the subject description");
        test.log(Status.PASS, "Test passed");

        test = extentReports.createTest("Category");
        test.log(Status.INFO, "Select category");
        test.log(Status.PASS, "Test passed");

        test = extentReports.createTest("Template");
        test.log(Status.INFO, "Select Template");
        test.log(Status.PASS, "Test passed");

        test = extentReports.createTest("Editor");
        test.log(Status.INFO, "Enter the description into the editor");
        test.log(Status.PASS, "Test passed");

        test = extentReports.createTest("Save");
        test.log(Status.INFO, "Click on Save button");
        test.log(Status.PASS, "Test passed");












        extentReports.flush();


    }

    private void extentReports(WebDriver driver) {
        this.extentReports(driver);
    }


}
