package com.Upright.stepDef;

import com.Upright.pageObjects.Sadias_Page;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import testNG_Basic.BaseClass;

public class SadiaTest {

   Sadias_Page obj;
    @When("user get the input box")
    public void user_get_the_input_box() {
        obj = new Sadias_Page(BaseClass.getDriver());

    }

    @Then("the user should be able to type the tool name")
    public void the_user_should_be_able_to_type_the_tool_name(){
        obj.Projectmanagementool();

    }
}
