package org.orangehrm.utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {
    Properties prop;
    public  Properties getPropObj() {
        try{
            FileInputStream fis=new FileInputStream("D:\\OrangeHRM_Automation\\src\\test\\resources\\Config.properties");

            prop=new Properties();
            prop.load(fis);
            return prop;
        }catch(Exception e){
            e.printStackTrace();
            return null;
        }
    }
}
