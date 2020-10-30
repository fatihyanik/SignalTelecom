package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class EbayTestPage {

    public EbayTestPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(id = "image_419897064")
    public WebElement ebayImageButton;

    @FindBy(id="gh-ac")
    public WebElement ebaySearchBox;

    @FindBy(id="gh-btn")
    public WebElement ebaySearchButton;

    @FindBy(xpath = "//h1[@class='str-billboard__title']")
    public WebElement newWindow;

    @FindBy(xpath = "//a[@class='vip']")
    public WebElement titleOfProduct;

    @FindBy(xpath="//li[@class='lvprice prc']")
    public WebElement priceOfProduct;




}
