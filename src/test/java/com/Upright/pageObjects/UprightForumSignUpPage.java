package com.Upright.pageObjects;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.asserts.SoftAssert;

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

       // WebElement RegistrationText= driver.findElement(By.xpath("//a[text()= 'Registration"));
       //String uprightRegistrationText = RegistrationText.getText();

       // SoftAssert obj= new SoftAssert();
       // obj.assertEquals(uprightRegistrationText, "REGISTRATION");

        //INSERTING USERNAME
        //WebElement userName = driver.findElement(By.name("your-username"));
        WebElement userName = driver.findElement(By.xpath("//input[@ name ='your-username']"));
        userName.sendKeys("Sadia123");
        Thread.sleep(10000);

        //INSERTING FIRSTNAME
        // WebElement firstName = driver.findElement(By.name("your-first-name"));
        WebElement firstName = driver.findElement(By.xpath("//input[@ name ='your-first-name']"));
        firstName.sendKeys("Sadia");
        Thread.sleep(10000);

        //INSERTING LASTNAME
        //WebElement lastName = driver.findElement(By.name("your-last-name"));
        WebElement lastName = driver.findElement(By.xpath("//input[@ name ='your-last-name']"));
        lastName.sendKeys("Hera");
        Thread.sleep(10000);

        //INSERTING EMAIL
       // WebElement email = driver.findElement(By.name("your-email"));
        WebElement email = driver.findElement(By.xpath("//input[@ name ='your-email']"));
        email.sendKeys("Sadiahera95@gmail.com");
        Thread.sleep(10000);

        //INSERTING PASSWORD
       // WebElement password = driver.findElement(By.name("your-password"));
        WebElement password = driver.findElement(By.xpath("//input[@ name ='your-password']"));
        password.sendKeys("dhakaS1320$");
        Thread.sleep(10000);

        //INSERTING CONFIRM PASSWORD
      // WebElement confirmpassword = driver.findElement(By.name("your-confirm-password"));
        WebElement confirmpassword = driver.findElement(By.xpath("//input[@ name ='your-confirm-password']"));
        confirmpassword.sendKeys("dhakaS1320$");
        Thread.sleep(10000);

        //INSERTING ACCOUNT TYPE
       // WebElement element = driver.findElement(By.id("your-account-type"));
        WebElement element = driver.findElement(By.xpath("//select[@name = 'your-role']"));
        Select select = new Select(element);
        select.selectByVisibleText("Student");
        Thread.sleep(10000);

        //INSERTING SELECT COUNTRY
       // WebElement element1= driver.findElement(By.id("your-country"));
        WebElement element1= driver.findElement(By.xpath("//select[@name = 'your-country']"));
        Select select1= new Select(element1);
        select1.selectByVisibleText("United States");
        Thread.sleep(10000);

        // Clicking on registration button
       // WebElement register = driver.findElement(By.xpath("/html/body/section/div/div/div/div/div/form/div[9]/button"));
        WebElement register = driver.findElement(By.xpath("//button[@type = 'submit']"));
        register.click();
        Thread.sleep(3000);
     // Select dropdown= new Select(element);
      // dropdown.selectByVisibleText("Teacher");
      // Thread.sleep(50000);
     //  dropdown.selectByIndex(2);

       // driver.quit();
        // click on button and we get a alert box

       // obj.assertAll();
      //  Thread.sleep(3000);



    }

    /*
    How did you handle alert?
    I have to switch to alert. then i was different  methods like gettext,accept,dismiss,sendkeys
     */

    @Test
    public void handlingAlert() throws InterruptedException{
        Thread.sleep(3000);


        String alertText = driver.switchTo().alert().getText();
        System.out.println(alertText);
       Assert.assertEquals(alertText, "Username is already exist");

       // if(alertText.equalsIgnoreCase("Username is already exist")){
        //    System.out.println("Attempting to create a duplicate account");
      //  }
        driver.switchTo().alert().accept();//it will click ok or yes
      //  driver.switchTo().alert().dismiss();// it will click No or ignore
      //  driver.switchTo().alert().sendKeys("hello");

       // System.out.println(alertText);

    }

}