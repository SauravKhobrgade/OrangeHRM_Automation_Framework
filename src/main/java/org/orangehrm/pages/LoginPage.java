package org.orangehrm.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import org.orangehrm.utils.WaitUtil;


public class LoginPage {
WebDriver driver;
WaitUtil wait;
    // 1.WebElements
    @FindBy(xpath = "//input[@name='username']")
       private WebElement usernamefield;
    @FindBy(xpath = "//input[@name='password']")
    private WebElement passworfield;
    @FindBy(xpath = "//button[@type='submit']")
    private WebElement clickbutton;

    //2.Constructor
    public LoginPage(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver,this);
        wait=new WaitUtil(driver);
    }
    //3.Page Action methods
    public  void enterUserName(String uName){
     wait.waitForVisibilityOfElement(usernamefield);
        usernamefield.sendKeys(uName);
    }
    public  void enterPassword(String pwd){
        wait.waitForVisibilityOfElement(passworfield);
      passworfield.sendKeys(pwd);
    }
  public void clickOnLoginbtn(){
        clickbutton.click();
  }
  public String getLoginUrl(){
       return driver.getCurrentUrl();
     }
     public String getLoginTitle(){
        return driver.getTitle();
     }

}
