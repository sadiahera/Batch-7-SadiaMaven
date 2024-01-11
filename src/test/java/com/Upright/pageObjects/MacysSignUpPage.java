package com.Upright.pageObjects;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.concurrent.TimeUnit;

public class MacysSignUpPage {

    WebDriver driver;

    @Test
    public void browser() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver",
                "C:\\Users\\Owner\\OneDrive\\Documents\\chromedriver.exe");

        driver = new ChromeDriver(); //open the chrome browser
        driver.get("https://www.macys.com/account/createaccount?cm_sp=my_account-_-sign_in-_-create_account");
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        Thread.sleep(10000);


       // WebElement firstName = driver.findElement(By.name("ca-profile-firstname"));
        WebElement firstName = driver.findElement(By.xpath("//input[@ name = 'ca-profile-firstname']"));
        firstName.sendKeys("Sadia");
        Thread.sleep(10000);

       // WebElement lastName = driver.findElement(By.name("ca-profile-lastname"));
        WebElement lastName = driver.findElement(By.xpath("//input[@ name = 'ca-profile-lastname']"));
        lastName.sendKeys("Hera");
        Thread.sleep(10000);

       // WebElement email = driver.findElement(By.name("email"));
        WebElement email = driver.findElement(By.xpath("//input[@ name = 'email']"));
        email.sendKeys("Sadiahera95@gmail.com");
        Thread.sleep(10000);

        WebElement Password = driver.findElement(By.xpath("//input[@ name = 'password']"));
       Password.sendKeys("dhakaS1320$");
        Thread.sleep(10000);

      //  WebElement element = driver.findElement(By.id("ca-profile-birth-month"));
        WebElement element = driver.findElement(By.xpath("//select[@ name = 'ca-profile-birth-month']"));
        Select select = new Select(element);
        select.selectByIndex(9);
        Thread.sleep(10000);


       // WebElement element1 = driver.findElement(By.id("ca-profile-birth-day"));
        WebElement element1 = driver.findElement(By.xpath("//select[@ name = 'ca-profile-birth-day']"));
        Select select1= new Select(element1);
        select1.selectByIndex(20);
        Thread.sleep(10000);

       // WebElement textalert = driver.findElement(By.id("ca-profile-text-message"));
        //textalert.click();
        //Thread.sleep(10000);

       // WebElement phnnotext = driver.findElement(By.id("ca-profile-phone"));
       // phnnotext.sendKeys("347-612-2610");
       // Thread.sleep(10000);

       // WebElement getsecurityAlert = driver.findElement(By.id("ca-profile-security-alert"));
       // getsecurityAlert .click();
       // Thread.sleep(10000);

       // WebElement clickSubmit = driver.findElement(By.id("ca-profile-submit"));

        WebElement clickSubmit = driver.findElement(By.xpath("//button[@ id = 'ca-profile-submit']"));
        clickSubmit.click();
        Thread.sleep(3000);

       // driver.quit();


    }
}
