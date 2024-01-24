package com.Upright.Utility;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.io.FileHandler;

import java.io.File;
import java.io.IOException;

public class CommonUtility {

    WebDriver driver;
    public void screenshot() throws IOException {
        TakesScreenshot ss =  (TakesScreenshot) driver;
        File memoryLocation = ss.getScreenshotAs(OutputType.FILE);
        FileHandler.copy(memoryLocation,new File("C:\\Users\\Owner\\IdeaProjects\\sadiaBatch7\\src\\test\\ScreenShotFolder/ss.png"));

            }
        }


