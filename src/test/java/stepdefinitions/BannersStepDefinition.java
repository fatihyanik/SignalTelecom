package stepdefinitions;

import io.cucumber.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.BannersPage;
import utilities.Driver;

public class BannersStepDefinition {

    BannersPage bannersPage = new BannersPage();
    WebDriverWait wait=new WebDriverWait(Driver.getDriver(),50);
    WebElement selectedBanner;

    @Given("the user select 2th banner")
    public void the_user_select_2th_banner() {
        bannersPage.banner2.click();
    }

    @Given("the user click on LEARN MORE button on 2th banner")
    public void the_user_click_on_LEARN_MORE_button_on_2th_banner() {
        wait.until(ExpectedConditions.visibilityOf(bannersPage.learnMoreBanner2)).click();

    }

    @Then("verify the pages that open match the 2th banner")
    public void verify_the_pages_that_open_match_the_2th_banner() {
        Assert.assertEquals("LIVE BROADCAST SYSTEMS", bannersPage.openedPageOfBanner2.getText());

    }

    @Given("the user select 3th banner")
    public void the_user_select_3th_banner() {
        bannersPage.banner3.click();
    }

    @Given("the user click on LEARN MORE button on 3th banner")
    public void the_user_click_on_LEARN_MORE_button_on_3th_banner() {
        selectedBanner=wait.until(ExpectedConditions.visibilityOf(bannersPage.learnMoreBanner3));
        selectedBanner.click();
    }

    @Then("verify the pages that open match the 3th banner")
    public void verify_the_pages_that_open_match_the_3th_banner() {
        Assert.assertEquals("IPTV SERVICES", bannersPage.openedPageOfBanner3.getText());
    }

    @Given("the user select 4th banner")
    public void the_user_select_4th_banner() {
        bannersPage.banner4.click();
    }

    @Given("the user click on LEARN MORE button on 4th banner")
    public void the_user_click_on_LEARN_MORE_button_on_4th_banner() {
        wait.until(ExpectedConditions.visibilityOf(bannersPage.learnMoreBanner4)).click();

    }

    @Then("verify the pages that open match the 4th banner")
    public void verify_the_pages_that_open_match_the_4th_banner() {
        Assert.assertEquals("LONG DISTANCE CALL SERVICES", bannersPage.openedPageOfBanner4.getText());
    }

    @Given("the user select 5th banner")
    public void the_user_select_5th_banner() {
        bannersPage.banner5.click();
    }

    @Given("the user click on LEARN MORE button on 5th banner")
    public void the_user_click_on_LEARN_MORE_button_on_5th_banner() {

        wait.until(ExpectedConditions.visibilityOf(bannersPage.learnMoreBanner5)).click();

    }

    @Then("verify the pages that open match the 5th banner")
    public void verify_the_pages_that_open_match_the_5th_banner() {
        Assert.assertEquals("TURKNEY TECHNOLOGY CONSULTING", bannersPage.openedPageOfBanner5.getText());
    }

    @Then("the user back to first page")
    public void the_user_back_to_first_page() {
        Driver.getDriver().navigate().back();
    }


}
