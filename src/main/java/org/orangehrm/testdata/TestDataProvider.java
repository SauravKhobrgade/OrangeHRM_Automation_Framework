package org.orangehrm.testdata;

import org.testng.annotations.DataProvider;

public class TestDataProvider {
    @DataProvider(name = "invalidLoginDate")
    public Object[][] getInvalidData(){
        return new Object[][]{
                {"Admin12","admin"}
        };
    }
}
