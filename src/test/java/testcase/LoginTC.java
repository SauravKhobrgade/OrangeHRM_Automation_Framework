package testcase;

import org.orangehrm.base.BaseTest;
import org.orangehrm.pages.DashboardPage;
import org.orangehrm.pages.LoginPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTC extends BaseTest {

   /* private ConfigReader cr;
    private Properties prop;
     @BeforeMethod
    public void setupLogin(){
        cr=new ConfigReader();
        prop=cr.getPropObj();
    }*/

    @Test(priority = 0)
    public void verifyLoginUrl(){
        String expURl="https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";
        LoginPage loginPage=new LoginPage(getDriver());
        String actURl=loginPage.getLoginUrl();
        Assert.assertEquals(actURl,expURl,"LoginPage url is not displayed as expected");
    }
    @Test(priority = 1)
    public void verifyLoginTitle(){
        String expTitle="OrangeHRM";
        LoginPage loginPage=new LoginPage(getDriver());
       String actTitle= loginPage.getLoginTitle();
       Assert.assertEquals(actTitle,expTitle,"Login Title is not displayed as expected");

    }
    @Test(priority = 2)
    public void verifyvalidLogin(){
        LoginPage loginPage=new LoginPage(getDriver());
        loginPage.enterUserName(prop.getProperty("username"));
        loginPage.enterPassword(prop.getProperty("password"));
         loginPage.clickOnLoginbtn();
        DashboardPage dashboardPage=new DashboardPage(getDriver());
       Assert.assertTrue( dashboardPage.isDashboardTextIsDisplayed());

    }
    @Test(dataProvider = "invalidLoginDate")
    public void verifyInvalidLogin(){
        LoginPage loginPage=new LoginPage(getDriver());
        loginPage.enterUserName(prop.getProperty("username"));
        loginPage.enterPassword(prop.getProperty("password"));
        loginPage.clickOnLoginbtn();
        DashboardPage dashboardPage=new DashboardPage(getDriver());
        Assert.assertTrue( dashboardPage.isDashboardTextIsDisplayed());
    }
}
