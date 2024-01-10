package com.Upright.pageObjects;

import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Sadias_Page {
    /*
    There are two types of exception
    1.Implicitly wait:it will wait a certain period(second) before throwing an exception during runtime
    applicable to all over the script wherever the class is extended.

    2.explicitly wait:it will wait a certain period(second) before throwing an exception during runtime
    is applicable to only a certain elements.

    --There are 2 types os xpath
    1.Absolute xpath-- it starts from the root node..from html
    2.Relative xpath--
     */

    WebDriver driver;
@Test
    public void browser() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver",
                "C:\\Users\\Owner\\OneDrive\\Documents\\chromedriver.exe");

        driver = new ChromeDriver(); //open the chrome browser
        driver.get("http://sadiahera.click/");
        Thread.sleep(50000);

    driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
    driver.manage().timeouts().pageLoadTimeout(10,TimeUnit.SECONDS);


        //Inserting Project management tool
        driver.findElement(By.id("Project management tool")).sendKeys("JIRA");
        //Inserting Documentation tool
        driver.findElement(By.xpath("/html/body/doctype/u1/li[2]/input")).sendKeys("Conflunce");
        //Inserting Object oriented Programming Language
        driver.findElement(By.id("Object oriented Programming Language")).sendKeys("Java");
        //Inserting Automation testing tool
        driver.findElement(By.xpath("/html/body/doctype/u1/li[4]/input")).sendKeys("Selenium");
        //Inserting API testing tool
        driver.findElement(By.id("API testing tool")).sendKeys("Postman");
        //Inserting Backend tool
        driver.findElement(By.id("Backend tool")).sendKeys("MySQL");
        //Inserting Mobile automation testing tool
        driver.findElement(By.id("Mobile automation testing tool")).sendKeys("Appium");

   // WebElement doctool =  driver.findElement(By.id("Backend tool"));
   // doctool.sendKeys("MySQL");


      // driver.findElement(By.name("hobby")).sendKeys("Gardening");
    //Inserting favorite hobby

      //  driver.findElement(By.xpath("/html/body/form[1]/lable[2]/input")).click();

      //  driver.findElement(By.xpath("/html/body/form[2]/lable[2]/input")).click();
    // Inserting my Gender
       driver.findElement(By.id("Male")).sendKeys("Gender");

        driver.findElement(By.linkText("Facebook")).click();

        Thread.sleep(10000);

    driver.findElement(By.linkText("linked")).click();

    Thread.sleep(10000);

        /*driver.close(); //driver.close will close only current window / tab
    even through it open another window/tab. and also it won't clear the background process. */


   /* driver.quit(); it will close all the tab/windows open by selenium that means it will
        close the session and also it will clear the background process.*/




    }




}
