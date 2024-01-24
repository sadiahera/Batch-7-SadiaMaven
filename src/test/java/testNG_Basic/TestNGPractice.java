package testNG_Basic;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNGPractice{
/*
What are the execution order of testing annotation
before class
before method
Test
after method
after class
 */
ChromeDriver driver;
    @BeforeMethod
    public void bm() {
        System.out.println("Before Method");
    }


    @Test //always run first no priority
    public void test1() {
       // System.out.println("Test1");

            System.setProperty("webdriver.chrome.driver",
                    "C:\\Users\\Owner\\OneDrive\\Documents\\chromedriver.exe");
         driver = new ChromeDriver();
         driver.get("https://netflix.com");
         System.out.println(driver.getTitle());
    }

     @Test(priority = 1)// then run priority 1
     public void test2(){
         System.setProperty("webdriver.chrome.driver",
                 "C:\\Users\\Owner\\OneDrive\\Documents\\chromedriver.exe");
         driver = new ChromeDriver();
         driver.get("https://amazon.com");
         System.out.println(driver.getCurrentUrl());
        System.out.println("Test2");
  }

  //  @Test(priority = 2)// then run priority 2
  //  public void test3(){
   //     System.out.println("Test3");
  //  }

@AfterMethod
public void am() {
    System.out.println("After Method");

}

}
