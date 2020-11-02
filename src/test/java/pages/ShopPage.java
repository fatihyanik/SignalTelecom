package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

public class ShopPage {

    public ShopPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(name = "orderby")
    public WebElement ddMenu;

    @FindBy(xpath = "(//span[@class='woocommerce-Price-amount amount'])[3]")
    public WebElement priceOfFirstProduct;

    @FindBys({@FindBy( xpath ="//span[@class='woocommerce-Price-amount amount']")})
    public List<WebElement> products;

}
