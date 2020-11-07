package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class BannersPage {

    public BannersPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//ol[@class='flickity-page-dots']/li[2]")
    public WebElement banner2;


    @FindBy(xpath = "//ol[@class='flickity-page-dots']/li[3]")
    public WebElement banner3;

    @FindBy(xpath = "//ol[@class='flickity-page-dots']/li[4]")
    public WebElement banner4;

    @FindBy(xpath = "//ol[@class='flickity-page-dots']/li[5]")
    public WebElement banner5;

    @FindBy(xpath = "(//a/span[text()='LEARN MORE'])[1]")
    public WebElement learnMoreBanner2;

    @FindBy(xpath = "(//a/span[text()='LEARN MORE'])[2]")
    public WebElement learnMoreBanner3;

    @FindBy(xpath = "(//a/span[text()='LEARN MORE'])[3]")
    public WebElement learnMoreBanner4;

    @FindBy(xpath = "(//a[@target='_self'])[4]")
    public WebElement learnMoreBanner5;

    @FindBy(tagName = "h2")
    public WebElement openedPageOfBanner2;

    @FindBy(tagName = "h2")
    public WebElement openedPageOfBanner3;

    @FindBy(tagName = "h2")
    public WebElement openedPageOfBanner4;

    @FindBy(tagName = "h1")
    public WebElement openedPageOfBanner5;









}
