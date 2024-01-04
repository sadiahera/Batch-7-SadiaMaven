package com.Upright.stepDef;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Profile {
    WebDriver driver;
    String myTitle;

    @Given ("the profile link is loaded in the browser")
    public void the_profile_link_is_loaded_in_the_browser(){
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Owner\\OneDrive\\Documents\\chromedriver.exe");

        driver = new ChromeDriver(); //open the chrome browser
        driver.get("http://sadiahera.click");

    }

   @When ("user take capture the title")
    public void user_take_capture_the_title(){
        myTitle = driver.getTitle();

   }

    @Then("the title should be something meaningful")
    public void the_title_should_be_something_meaningful(){
        if(myTitle.equalsIgnoreCase("Sadia's Profile")){
            System.out.println("The title is meaningful");
        }
        else{
            System.out.println("The title is not meaningful");
        }



    }
   @ When ("user capture the url")
    public void user_capture_the_url(){

   }

    @Then ("the url should be as expected")
    public void the_url_should_be_as_expected(){

    }

    @When ("user can write in the input box")
    public void user_can_write_in_the_input_box(){

    }

   @Then ("the input box should be expected")
    public void the_input_box_should_be_expected(){
        
   }

}
