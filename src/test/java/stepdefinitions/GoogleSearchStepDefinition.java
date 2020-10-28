package stepdefinitions;

import io.cucumber.java.en.Given;
import org.openqa.selenium.Keys;
import pages.GooglePage;
import utilities.Driver;

public class GoogleSearchStepDefinition {

    GooglePage googlePage = new GooglePage();

    @Given("User is on the google page")
    public void user_is_on_the_google_page() {
        Driver.getDriver().get("https://google.com");
    }

    @Given("User writes signal-telecom on google search box")
    public void user_writes_signal_telecom_on_google_search_box() {
        googlePage.searchbox.sendKeys("signal-telecom"+ Keys.ENTER);
    }

}
