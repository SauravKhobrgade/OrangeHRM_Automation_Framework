package org.orangehrm.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.orangehrm.utils.WaitUtil;

public class DashboardPage {
    WebDriver driver;
    WaitUtil wait;
    //1.WebElement
    @FindBy(xpath = "//h6[text()='Dashboard']")
    private WebElement dashboardText;
    @FindBy(css = ".oxd-text.oxd-text--h6.oxd-topbar-header-breadcrumb-module")
    private WebElement PIMHeader;
    //2.Constructor
    public  DashboardPage(WebDriver driver){
         this.driver=driver;
        PageFactory.initElements(driver,this);
        wait=new WaitUtil(driver);

    }

    //3. Page Action methods
    public boolean isDashboardTextIsDisplayed(){
        wait.waitForVisibilityOfElement(dashboardText);
         return dashboardText.isDisplayed();
    }
    public void clickOnPIMBtn(){
         PIMHeader.click();

    }


}
