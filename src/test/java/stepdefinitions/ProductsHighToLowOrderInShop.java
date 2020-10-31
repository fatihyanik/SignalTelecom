package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import pages.ShopPage;
import utilities.ConfigReader;
import utilities.Driver;

import java.util.ArrayList;
import java.util.Collections;
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
        List<Integer> intListAll = new ArrayList<>();
        List<Integer> intListReal = new ArrayList<>();
        List<Integer> intListRealOrdered = new ArrayList<>();

        String strEl;
        Integer el;

        for(WebElement w : shopPage.products){
            strEl = w.getText().substring(1,w.getText().length()-3).replace(",","");
            el = Integer.valueOf( strEl);
            intListAll.add(el);
        }

        for(int i=2;i<intListAll.size();i=i+2){
            intListReal.add(intListAll.get(i));
            intListRealOrdered.add(intListAll.get(i));
        }
        //comment
        Collections.sort(intListRealOrdered,Collections.reverseOrder());
        Assert.assertEquals(intListReal,intListRealOrdered);
    }





}
