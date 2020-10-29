package stepdefinitions;

import io.cucumber.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import pages.ShopPage;
import utilities.ConfigReader;
import utilities.Driver;

import java.util.ArrayList;
import java.util.List;


public class ProductsHighToLowOrderInShop {
    ShopPage shopPage = new ShopPage();

    @Given("the user is on the shop page")
    public void the_user_is_on_the_shop_page() {
        Driver.getDriver().get(ConfigReader.getProperty("shop_url"));
    }

    @Given("the user select {string} from dd menu")
    public void the_user_select_from_dd_menu(String string) {
        Select options = new Select(shopPage.ddMenu);
        options.selectByVisibleText(string);

    }

    @Then("verify the first product_costet {string}")
    public void verify_the_first_product_costet(String maxPrice) {
        Assert.assertTrue(shopPage.priceOfFirstProduct.getText().equals(maxPrice));
    }

    @Then("verify the product list in high to low order")
    public void verify_the_product_list_in_high_to_low_order() {
        List<Integer> intList = new ArrayList<>();
        for(WebElement w : shopPage.products){
            Integer el = Integer.valueOf( w.getText().substring(1));
            intList.add(el);
        }
//        intList.remove(0);
//        for(int i=0;i<intList.size();i=i+2){
//            intList.remove(i);
//        }

        System.out.println(intList);
    }





}
