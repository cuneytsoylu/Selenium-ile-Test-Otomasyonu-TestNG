package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class AlotechPage {
    public AlotechPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy (xpath = "//*[@id='data-email']")
    public WebElement email;

    @FindBy (xpath = "//*[@id='password']")
    public WebElement password;

    @FindBy (xpath = "//*[@type='submit']")
    public WebElement loginButton;

    @FindBy (xpath = "//*[@class='LoginLayout_LoginTemplate_Title__2jTDU MuiBox-root css-0']")
    public WebElement failedLogin;
}
