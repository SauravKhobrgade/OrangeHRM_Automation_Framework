package testcase;

import org.orangehrm.base.BaseTest;
import org.orangehrm.pages.DashboardPage;
import org.orangehrm.pages.LoginPage;
import org.orangehrm.pages.PIMPage;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class DashboardTC extends BaseTest {

    @Test
    public void verifyDashboardPage(){
        LoginPage loginPage=new LoginPage(getDriver());
        loginPage.enterUserName(prop.getProperty("username"));
        loginPage.enterPassword(prop.getProperty("password"));
        loginPage.clickOnLoginbtn();

        DashboardPage dashboardPage=new DashboardPage(getDriver());
        Assert.assertTrue(dashboardPage.isDashboardTextIsDisplayed());

    }

}
