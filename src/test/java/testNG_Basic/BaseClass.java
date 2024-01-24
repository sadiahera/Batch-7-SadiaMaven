package testNG_Basic;

import com.beust.jcommander.Parameter;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class BaseClass {

    WebDriver driver;

    public static WebDriver getDriver() {
        return null;
    }

    @Parameter(names = "myBrowser")
    @Test

    public void launchBrowser(String myBrowser)throws InterruptedException{
        System.setProperty("webdriver.chrome.driver",
                "C:\\Users\\Owner\\OneDrive\\Documents\\chromedriver.exe");
        driver = new ChromeDriver();//open the chrome browser

        System.setProperty("webdriver.gecho.driver",
                "C:/Users/Owner/Downloads/geckodriver-v0.33.0-win64/gechodriver");
        driver = new FirefoxDriver();


        if (myBrowser.equals("chrome")) {
            driver = new ChromeDriver();
        } else if (myBrowser.equals("firefox")) {
            driver = new FirefoxDriver();
        } else {
            System.out.println("Please check your driver");
        }

       // driver = new ChromeDriver();//open the chrome browser
       // driver.get("https://netflix.com");


    }
}

