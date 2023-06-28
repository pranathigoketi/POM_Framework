package Basetest;

import Extentreport.extentreports;
import PageObjects.Spotlight_Messages;
import com.example.utils.SelectUtils;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;

import java.time.Duration;

import static java.awt.SystemColor.text;

public class Baseclass  {
    public static WebDriver driver;
   public static  extentreports reports=new extentreports(driver);

    public Spotlight_Messages msg = new Spotlight_Messages(driver);

    @BeforeClass
    public void beforetest() {
        WebDriverManager.chromedriver().setup();
       driver = new ChromeDriver();
        driver.get("https://e2.minnwestbank.com/apps/Spotlight/#_frmLogin");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
    }

    @AfterClass
    public void aftertest() {

        driver.quit();
    }
}

