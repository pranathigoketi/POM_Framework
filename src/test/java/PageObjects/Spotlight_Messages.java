package PageObjects;

import Basetest.Baseclass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Spotlight_Messages  {

   public  WebDriver driver;

    public Spotlight_Messages(WebDriver driver) {
      this.driver = driver;
        PageFactory.initElements(driver,this);     //Constructor created
                                                        //in java initialization takes place from right hand hence we are
                                                        //initializing this for the entire project
    }


    @FindBy(xpath = "//*[@id=\"frmLogin_txtUserName\"]")
    public WebElement username;
    public void setUsername()
    {
        username.sendKeys("SuperadminUser");
    }

    @FindBy(xpath = "//*[@id=\"frmLogin_txtPassword\"]")
    WebElement password;
    public void setPassword(){
        password.sendKeys("Password@1234");
    }

    @FindBy(xpath = "//*[@id=\"frmLogin_lblEyecross\"]")
    WebElement eyeicon;

    public void setEyeicon(){
        eyeicon.click();
    }

    @FindBy(xpath = "//*[@id=\"frmLogin_imgLoginRememberMe\"]")
    WebElement checkbox;

    public void setCheckbox(){
        checkbox.click();
    }

    @FindBy(xpath = "//*[@id=\"frmLogin_btnLogin\"]")
    WebElement signin;

    public void setSignin(){
        signin.click();
    }

    @FindBy(xpath = "//div[text()='Messages']")
    WebElement navigate;

    public void setNavigate(){
        navigate.click();
    }

    @FindBy(xpath = "//*[@id=\"frmCSR_mainHeader_btnDropdownList\"]")
    WebElement newmessage;

    public void setNewmessage(){
        newmessage.click();
    }

    @FindBy(xpath = "//*[@id=\"frmCSR_Message_txtTo\"]")
    WebElement compose;

    public void setCompose(){
        compose.sendKeys("Aswiniroy@7");
    }

    @FindBy(xpath = "//*[@id=\"flxsegCustomerGroup_flxUserName\"]")
    WebElement userid;

    public void setUserid(){
        userid.click();
    }

    @FindBy(xpath = "//*[@id=\"frmCSR_Message_txtSubject\"]")
    WebElement subject;

    public void setSubject(){
        subject.sendKeys("Credit Card Blockage");
    }

    @FindBy(xpath = "//*[@id=\"frmCSR_Message_lstbocCategory\"]")
    WebElement category;

    public void setCategory(){
        Select select = new Select((category));
        select.selectByVisibleText("Credit Cards");
    }

    @FindBy(xpath = "//*[@id=\"frmCSR_Message_lstboxMail\"]")
    WebElement template;

    public void setTemplate(){
        Select select = new Select((template));
        select.selectByVisibleText("Minnwest(Test)");
    }

    public void seteditor() {
        driver.switchTo().frame("rtxMessage");
        WebElement message = this.driver.findElement(By.xpath("//div[text()='This is dummy template hghghg']"));
        message.clear();
        message.sendKeys(new CharSequence[]{"Hola, I am facing blocking issue for my card"});
        this.driver.switchTo().defaultContent();
    }

    @FindBy(xpath = "//*[@id=\"frmCSR_Message_btnsave\"]")
    WebElement save;

    public void setSave(){
        save.click();
    }

}
