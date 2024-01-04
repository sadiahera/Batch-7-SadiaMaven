package com.Upright.testRunner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import jdk.internal.javac.PreviewFeature;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = {"C:\\Users\\Owner\\IdeaProjects\\sadiaBatch7\\src\\test\\java\\com\\Upright\\Feature\\Profile.Feature"},glue ={"com.Upright.stepDef"})

  //plugin = {"pretty","html:target/cucumber-reports/Cucumber.html"},

    // plugin ={"pretty", "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"}
//  monochrome = true;
  //publish = true;

public class Runner {


}
