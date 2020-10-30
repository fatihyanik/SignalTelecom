package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class EbayTestPage {

    public EbayTestPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//div[@class='img-inner dark']")
    public WebElement ebayImageButton;

    @FindBy(id="gh-ac")
    public WebElement ebaySearchBox;

    @FindBy(id="gh-btn")
    public WebElement ebaySearchButton;

    @FindBy(xpath = "//html/head/title")
    public WebElement newWindow;

    @FindBy(xpath = "//a[@class='vip']")
    public WebElement titleOfProduct;

//    @FindBy(xpath = "(//h3[@class='s-item__title'])[6]")
//    public WebElement titleOfProduct;

    @FindBy(xpath="//li[@class='lvprice prc']")
    public WebElement priceOfProduct;
//
//    @FindBy(xpath = "(//span[@class='s-item__price'])[6]")
//    public WebElement priceOfProduct;




}
