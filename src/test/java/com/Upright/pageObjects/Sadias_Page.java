package com.Upright.pageObjects;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.asserts.SoftAssert;

import java.awt.*;
import java.util.concurrent.TimeUnit;

public class Sadias_Page {
    public Sadias_Page(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver,this);


    }

    @FindBy(xpath ="//input[@ id = 'Project management tool']" )
            WebElement projectInputBox;
    public void Projectmanagementool(){
        projectInputBox.sendKeys("JIRA");
    }

    /*
    There are two types of exception
    1.Implicitly wait:it will wait a certain period(second) before throwing an exception during runtime
    applicable to all over the script wherever the class is extended.

    2.explicitly wait:it will wait a certain period(second) before throwing an exception during runtime
    is applicable to only a certain elements.

    --There are 2 types os xpath
    1.Absolute xpath-- it starts from the root node..from the  html
    -Because sometimes developer change the dom structure .may be he can add a new webelement in
    between or delete any tag.. that time my absolute xpath won't work.

    2.Relative xpath--It starts from anywhere in the document and starts with // (double slash)

    Syntax- //tagname[@attribute ='value']

    1.Constructor
    2.Page objects
    3.Method according to action

    //Page factory class from Selenium-- this class will remember all the page elements and will
    transfer those to the step def class

     */

    WebDriver driver;
    WebElement travel;
@Test
    public void browser() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver",
                "C:\\Users\\Owner\\OneDrive\\Documents\\chromedriver.exe");

        driver = new ChromeDriver(); //open the chrome browser
        driver.get("http://sadiahera.click/");
        Thread.sleep(50000);
    driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
    driver.manage().timeouts().pageLoadTimeout(10,TimeUnit.SECONDS);

    //Verify that "My Profile" text is there or not
    WebElement profileText = driver.findElement(By.xpath("//h1[text() = ' MY PROFILE ']"));
    String myProfileText = profileText.getText();// get the text from application

    SoftAssert obj = new SoftAssert();
    obj.assertEquals(myProfileText, "MY PROFILE");

    WebElement doctool = driver.findElement(By.xpath("//input[@ id = 'Project management tool']"));
    doctool.sendKeys("JIRA");
    Thread.sleep(10000);

    WebElement doctool1 = driver.findElement(By.xpath("//input[@ id = 'Documentation tool']"));
    doctool1.sendKeys("Conflunce");
    Thread.sleep(10000);

    WebElement doctool2 = driver.findElement(By.xpath("//input[@ id = 'Object oriented Programming Language']"));
    doctool2.sendKeys("Java");
    Thread.sleep(10000);

    WebElement doctool3 = driver.findElement(By.xpath("//input[@ id = 'Automation Testing tool']"));
    doctool3.sendKeys("Selenium");
    Thread.sleep(10000);

    WebElement doctool4 = driver.findElement(By.xpath("//input[@ id = 'API testing tool']"));
    doctool4.sendKeys("Postman");
    Thread.sleep(10000);

    WebElement doctool5= driver.findElement(By.xpath("//input[@ id = 'Backend tool']"));
    doctool5.sendKeys("MySQL");
    Thread.sleep(10000);

    WebElement doctool6= driver.findElement(By.xpath("//input[@ id = 'Mobile automation testing tool']"));
    doctool6.sendKeys("Appium");
    Thread.sleep(10000);



    //Inserting Project management tool
       // driver.findElement(By.id("Project management tool")).sendKeys("JIRA");
        //Inserting Documentation tool
       // driver.findElement(By.xpath("/html/body/doctype/u1/li[2]/input")).sendKeys("Conflunce");
        //Inserting Object oriented Programming Language
       // driver.findElement(By.id("Object oriented Programming Language")).sendKeys("Java");
        //Inserting Automation testing tool
       // driver.findElement(By.xpath("/html/body/doctype/u1/li[4]/input")).sendKeys("Selenium");
        //Inserting API testing tool
        //driver.findElement(By.id("API testing tool")).sendKeys("Postman");
        //Inserting Backend tool
       // driver.findElement(By.id("Backend tool")).sendKeys("MySQL");
        //Inserting Mobile automation testing tool
       // driver.findElement(By.id("Mobile automation testing tool")).sendKeys("Appium");

   // WebElement doctool =  driver.findElement(By.id("Backend tool"));
   // doctool.sendKeys("MySQL");


      // driver.findElement(By.name("hobby")).sendKeys("Gardening");
    //Inserting favorite hobby

      //  driver.findElement(By.xpath("/html/body/form[1]/lable[2]/input")).click();

      //  driver.findElement(By.xpath("/html/body/form[2]/lable[2]/input")).click();
    // Inserting my Gender
    WebElement doctool7= driver.findElement(By.xpath("//input[@ type= 'checkbox']"));
    doctool7.sendKeys("gardening");
    Thread.sleep(10000);

    WebElement doctool8= driver.findElement(By.xpath(" //input[@ type ='radio']"));
    doctool8.sendKeys("Female");
   Thread.sleep(10000);
   
   //driver.findElement(By.id("Male")).sendKeys("Gender");

        driver.findElement(By.linkText("Facebook")).click();

        Thread.sleep(10000);

    driver.findElement(By.linkText("linked")).click();

    Thread.sleep(10000);

    try {
        travel = driver.findElement(By.xpath("//input[@value ='travelling']"));

    }
    catch (Exception e) {
        System.out.println(e);
    }
    finally {
        System.out.println("Finally");
    }

    //List<WebElement> reading = driver.findElement(By.xpath("//input[@name= 'hobby']"));
   // reading.get(0).click();
    //reading.get(1).click();

        /*driver.close(); //driver.close will close only current window / tab
    even through it open another window/tab. and also it won't clear the background process. */


   /* driver.quit(); it will close all the tab/windows open by selenium that means it will
        close the session and also it will clear the background process.*/

    obj.assertAll();




    }




}
