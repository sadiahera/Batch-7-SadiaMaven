package com.Upright.stepDef.Cucumber;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Profile {
    WebDriver driver;
    String myTitle;
    String myURL;


    @Given("the profile link is loaded in the browser")
    public void the_profile_link_is_loaded_in_the_browser() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Owner\\OneDrive\\Documents\\chromedriver.exe");

        driver = new ChromeDriver(); //open the chrome browser
        driver.get("http://sadiahera.click");
    }


   @When ("user take capture the title")
    public void user_take_capture_the_title(){
        myTitle = driver.getTitle();

   }

    @Then("the title should be Sadia's Profile")
    public void the_title_should_be_Sadias_Profile(){
      //  if(myTitle.equalsIgnoreCase("Sadia Profile")){
           // System.out.println("The title is as per A/C");
      //  }
       // else{
       //     System.out.println("The title is not as per A/C");
      //  }

        Assert.assertEquals(myTitle, "Sadia's Profile");



    }
   @ When ("user capture the url")
    public void user_capture_the_url(){
       myURL = driver.getCurrentUrl();
       System.out.println("the Url capture by the Selenium is" + myURL);


   }

    @Then ("the url should be with http and the name")
    public void the_url_should_be_with_http_and_the_name(){
        Assert.assertEquals(myURL,"http://sadiahera.click/" );


    }

    @When ("user can write in the input box")
    public void user_can_write_in_the_input_box(){

    }

   @Then ("the input box should be expected")
    public void the_input_box_should_be_expected(){

   }

}
