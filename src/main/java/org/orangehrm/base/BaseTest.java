package org.orangehrm.base;

import org.openqa.selenium.WebDriver;
import org.orangehrm.factory.DriverFactory;
import org.orangehrm.utils.ConfigReader;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import java.util.Properties;

public class BaseTest {
    protected DriverFactory driverFactory;
    protected  ConfigReader cr;
    protected WebDriver driver;
    protected  Properties prop;

    
    @BeforeClass
    public void setUp(){
        cr=new ConfigReader();
        prop=cr.getPropObj();
        driverFactory=new DriverFactory();
        driver=driverFactory.initDriver(prop.getProperty("browserName"));
        driver.get(prop.getProperty("url"));
    }
    
    public WebDriver getDriver(){
        return driver;
    }
    
    @AfterClass
    public void tearDown(){
        driver.quit();
    }
}
