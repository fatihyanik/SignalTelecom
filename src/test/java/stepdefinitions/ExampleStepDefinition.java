package stepdefinitions;

import io.cucumber.java.en.Given;
import utilities.Driver;

public class ExampleStepDefinition {

    @Given("user go to {string}")
    public void user_go_to(String string) {
        Driver.getDriver().get(string);
    }

}
