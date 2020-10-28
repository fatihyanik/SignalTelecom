package pages;

import io.cucumber.java.en.Given;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class ExamplePage {
    public  ExamplePage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }




}
