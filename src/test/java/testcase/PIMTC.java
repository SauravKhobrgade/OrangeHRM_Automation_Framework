package testcase;

import org.orangehrm.base.BaseTest;
import org.orangehrm.pages.DashboardPage;
import org.orangehrm.pages.LoginPage;
import org.orangehrm.pages.PIMPage;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class PIMTC extends BaseTest {
    @Test
    public void verifyPIMUrl() {
        LoginPage loginPage=new LoginPage(getDriver());
        loginPage.enterUserName(prop.getProperty("username"));
        loginPage.enterPassword(prop.getProperty("password"));
        loginPage.clickOnLoginbtn();
        DashboardPage dashboardPage=new DashboardPage(getDriver());
        dashboardPage.clickOnPIMBtn();
        PIMPage pimPage = new PIMPage(getDriver());
        String expUrl = "https://opensource-demo.orangehrmlive.com/web/index.php/pim/viewEmployeeList";
        Assert.assertTrue(pimPage.isPIMPageIsDisplayed());
        String actUrl = pimPage.getPimPageURL();
        Assert.assertEquals(actUrl, expUrl, "PIM page URL is not displayed as Expected");
    }
    @Test
    public void verifyPIMTitle() {
        String expTitle = "OrangeHRM";
        PIMPage pimPage = new PIMPage(getDriver());
        Assert.assertEquals(pimPage.getPimPageTitle(), expTitle, "PIM Page Title is not displaye  as Expected");

    }
    @Test
    public void verifyPIMpageDisplayed() {
        PIMPage pimPage = new PIMPage(getDriver());
        Assert.assertTrue(pimPage.isPIMHeaderIsDisplayed());
    }
}
