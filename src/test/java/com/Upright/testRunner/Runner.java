package com.Upright.testRunner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = {"C:\\Users\\Owner\\IdeaProjects\\sadiaBatch7\\src\\test\\java\\com\\Upright\\features\\Profile.feature"},
        glue ={"com.Upright.stepDef"},
 plugin = { "pretty", "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:" },

 publish =true)





// plugin ={"pretty", "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"}
//  monochrome = true;
  //publish = true;

public class Runner {


}
