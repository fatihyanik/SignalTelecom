package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;
import pages.EbayTestPage;
import utilities.ConfigReader;
import utilities.Driver;

import java.util.Set;

public class EbayTestStepDefinition {

    EbayTestPage ebayTestPage = new EbayTestPage();
    WebDriverWait wait=new WebDriverWait(Driver.getDriver(),10);

    @Given("User is signal-telecom homepage")
    public void user_is_signal_telecom_homepage() {
        Driver.getDriver().get(ConfigReader.getProperty("signal_telecom_url"));
      //  Driver.getDriver().get(ConfigReader.getProperty("global_trader_url"));
    }

    @Given("the user click on the button of eBay Page")
    public void the_user_click_on_the_button_of_eBay_Page() throws InterruptedException {
        Actions options = new Actions(Driver.getDriver());
        options.sendKeys(Keys.PAGE_DOWN).perform();
        options.sendKeys(Keys.PAGE_DOWN).perform();
        options.sendKeys(Keys.PAGE_DOWN).perform();
        Thread.sleep(2000);
        ebayTestPage.ebayImageButton.click();
    }

    @Given("the user selects the newly opened Signal Telecom's eBay Page")
    public void the_user_selects_the_newly_opened_Signal_Telecom_s_eBay_Page() throws InterruptedException {

        String windowSignalTelecom=Driver.getDriver().getWindowHandle();
        Set<String> allWindowsHandle = Driver.getDriver().getWindowHandles();

        for (String eachWindow:allWindowsHandle) {
            if (!eachWindow.equals(windowSignalTelecom)) {
                Driver.getDriver().switchTo().window(eachWindow);
            }
        }
        Thread.sleep(2000);

    }

    @Given("the user search in eBay Store for {string}")
    public void the_user_search_in_eBay_Store_for(String searchText) {
        ebayTestPage.ebaySearchBox.sendKeys(searchText);
        ebayTestPage.ebaySearchButton.click();

    }

    @Then("verify  the product is same")
    public void verify_the_product_is_same() {

       // WebElement findProduct=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//h3[@class='s-item__title'])[6]")));
        Assert.assertTrue(ebayTestPage.titleOfProduct.getText().contains("GRANDSTREAM GXW4104"));

    }

    @Then("verify whether the price of product is {string}")
    public void verify_whether_the_price_of_product_is_$190(String price) {
        Assert.assertEquals(ebayTestPage.priceOfProduct.getText(), price);

    }


}
