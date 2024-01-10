package com.Upright.pageObjects;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.concurrent.TimeUnit;

public class UprightForumSignUpPage {

    WebDriver driver;

    @Test
    public void browser() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver",
                "C:\\Users\\Owner\\OneDrive\\Documents\\chromedriver.exe");

        driver = new ChromeDriver(); //open the chrome browser
        driver.get("https://uprightforum.tech/registration");
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(10,TimeUnit.SECONDS);
        driver.manage().window().maximize();
        Thread.sleep(10000);

        WebElement userName = driver.findElement(By.name("your-username"));
        userName.sendKeys("Sadia123");
        Thread.sleep(10000);

        WebElement firstName = driver.findElement(By.name("your-first-name"));
        firstName.sendKeys("Sadia");
        Thread.sleep(10000);

        WebElement lastName = driver.findElement(By.name("your-last-name"));
        lastName.sendKeys("Hera");
        Thread.sleep(10000);

        WebElement email = driver.findElement(By.name("your-email"));
        email.sendKeys("Sadiahera95@gmail.com");
        Thread.sleep(10000);

        WebElement password = driver.findElement(By.name("your-password"));
        password.sendKeys("dhakaS1320$");
        Thread.sleep(10000);

       WebElement confirmpassword = driver.findElement(By.name("your-confirm-password"));
        confirmpassword.sendKeys("dhakaS1320$");
        Thread.sleep(10000);

        WebElement element = driver.findElement(By.id("your-account-type"));
        Select select = new Select(element);
        select.selectByVisibleText("Student");
        Thread.sleep(10000);

        WebElement element1= driver.findElement(By.id("your-country"));
        Select select1= new Select(element1);
        select1.selectByVisibleText("United States");
        Thread.sleep(10000);

        WebElement register = driver.findElement(By.xpath("/html/body/section/div/div/div/div/div/form/div[9]/button"));
        register.click();
     // Select dropdown= new Select(element);
      // dropdown.selectByVisibleText("Teacher");
      // Thread.sleep(50000);
     //  dropdown.selectByIndex(2);

       // driver.quit();



    }
}