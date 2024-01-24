package com.Upright.stepDef;

import com.Upright.Utility.BaseClass;
import com.Upright.Utility.IDException;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {

    @Before
    public void appInit() throws IDException, InterruptedException{
        try {
            BaseClass.setDriver();
        }
        catch (Exception e)  {
            System.out.println(e);
        }


    }
    @After
    public void tearDown() {
        // driver.close() , driver.quit()
        BaseClass.getDriver().quit();
    }

}
