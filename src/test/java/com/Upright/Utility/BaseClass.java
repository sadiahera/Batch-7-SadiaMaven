 package com.Upright.Utility;

 import org.openqa.selenium.WebDriver;
 import org.openqa.selenium.chrome.ChromeDriver;
 import org.openqa.selenium.firefox.FirefoxDriver;

 import java.io.FileInputStream;
 import java.io.IOException;
 import java.util.Properties;

public class BaseClass {
    WebDriver driver;
    String myBrowser;
    //method
//Initialize the browser
//different browser has it own driver.... chrome driver, firefox driver( gecko driver)
// IE driver , opera driver ,safari driver, edge driver
    public void loadProperties()throws IOException {
        FileInputStream obj = new FileInputStream("C:\\Users\\Owner\\IdeaProjects\\sadiaBatch7\\src\\test\\java\\com\\Upright\\Utility\\info.properties");

        Properties prof = new Properties();
        prof.load(obj);
        myBrowser = prof.getProperty("browser");
        System.out.println(myBrowser);





    }

    public void lauchBrowser() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Owner\\OneDrive\\Documents\\chromedriver.exe");
        System.setProperty("webdriver.gecho.driver","C:/Users/Owner/Downloads/geckodriver-v0.33.0-win64/gechodriver");

        if (myBrowser.equals("chrome")){
            driver = new ChromeDriver();
        }
        else if (myBrowser.equals("firefox")) {
            driver = new FirefoxDriver();
        }
        else {
            System.out.println("Please check your driver");
        }

//driver = new ChromeDriver();//open the chrome browser
// driver = new FirefoxDriver();
//driver.get("http://uprightforum.tech");

       driver.navigate().to("https://uprightforum.tech");
       driver.navigate().to("https://amazon.com");
        driver.navigate().to("http://sadiahera.click/");
        Thread.sleep(3000);
// driver.manage().window().maximize();
        driver.navigate().back();
        driver.navigate().forward();
        driver.navigate().refresh();
        String myCurrentURL = driver.getCurrentUrl();
        System.out.println(myCurrentURL);
        String myTitle = driver.getTitle();
        System.out.println(myTitle);


// what are the different between driver.get() vs diver.navigate()
// do research and find out this question answer..
    }

    public static void main(String[] args) throws InterruptedException, IOException {
        BaseClass obj = new BaseClass();
        obj.loadProperties();
        obj.lauchBrowser();
    }





}