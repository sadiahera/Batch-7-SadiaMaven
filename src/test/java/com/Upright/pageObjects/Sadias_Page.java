package com.Upright.pageObjects;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sadias_Page {

    WebDriver driver;
@Test
    public void browser() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver",
                "C:\\Users\\Owner\\OneDrive\\Documents\\chromedriver.exe");

        driver = new ChromeDriver(); //open the chrome browser
        driver.get("http://sadiahera.click");
        Thread.sleep(50000);
        driver.findElement(By.id("Project management tool")).sendKeys("JIRA");
        driver.findElement(By.name("Documentation tool")).sendKeys("Conflunce");
        driver.findElement(By.id("Object oriented Programming Language")).sendKeys("Java");
        driver.findElement(By.name("Automation Testing tool")).sendKeys("Selenium");
        driver.findElement(By.id("API testing tool")).sendKeys("Postman");
        driver.findElement(By.id("Backend tool")).sendKeys("MySQL");
        driver.findElement(By.name("Mobile automation testing tool")).sendKeys("Appium");


       // driver.findElement(By.name("hobby")).sendKeys("Gardening");

        driver.findElement(By.xpath("/html/body/form[2]/lable[2]/input")).click();

      //  driver.findElement(By.xpath("/html/body/form[2]/lable[2]/input")).click();
        driver.findElement(By.id("Male")).sendKeys("Gender");




    }




}
