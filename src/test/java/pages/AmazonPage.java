package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.awt.print.PageFormat;

public class AmazonPage {
    public  AmazonPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//*[@id='sp-cc-rejectall-link']")
    public WebElement cookie;

    @FindBy(xpath = "//*[@id='twotabsearchtextbox']")
    public WebElement searchBox;
    @FindBy(xpath = "//*[@class='a-section a-spacing-small a-spacing-top-small']")
    public WebElement WE;

}
