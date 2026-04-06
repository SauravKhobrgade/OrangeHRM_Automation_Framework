package org.orangehrm.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.orangehrm.utils.WaitUtil;

public class PIMPage {
    WebDriver driver;
    WaitUtil wait;
    //1.WebElements
    @FindBy(xpath = "//span[text()='PIM']")
    private WebElement PIMBtn;

    @FindBy(css = ".oxd-text.oxd-text--h6.oxd-topbar-header-breadcrumb-module")
    private WebElement PIMHeader;
    @FindBy(xpath = "//a[text()='Add Employee']")
    private WebElement addEmpBtn;



    //2.Constructor
     public PIMPage(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver,this);
        wait=new WaitUtil(driver);
    }
    //3.Page Action Methods
    public void clickOnPIMMenuBtn(){
        wait.waitForVisibilityOfElement(PIMBtn);
         PIMBtn.click();
    }
    public String getPimPageURL(){
         return driver.getCurrentUrl();
    }
    public String getPimPageTitle(){
         return  driver.getTitle();
    }
    public Boolean isPIMHeaderIsDisplayed(){
         wait.waitForVisibilityOfElement(PIMHeader);
         return PIMHeader.isDisplayed();
    }
    public void clickOnAddEmpBtn(){
         wait.waitForVisibilityOfElement(addEmpBtn);
          addEmpBtn.click();
    }
    public Boolean isPIMPageIsDisplayed(){
     wait.waitForVisibilityOfElement(PIMHeader);
     return PIMHeader.isDisplayed();
    }


}
