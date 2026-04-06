package org.orangehrm.utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {
     Properties prop;
    
    public ConfigReader(){
        try {
            FileInputStream fis = new FileInputStream("D:\\OrangeHRM_Automation\\src\\test\\resources\\Config.properties");
            prop = new Properties();
            prop.load(fis);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    
    public  Properties getPropObj(){
        return prop;
    }
    
    public String getProperty(String key){
        return prop.getProperty(key);
    }
}
