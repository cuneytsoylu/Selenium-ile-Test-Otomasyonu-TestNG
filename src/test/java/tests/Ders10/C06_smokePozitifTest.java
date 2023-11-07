package tests.Ders10;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.BrcPage;
import utilities.ConfigReader;
import utilities.Driver;

public class C06_smokePozitifTest {
    @Test(groups = "grup1")
    public void pozitifTest() throws InterruptedException {
        BrcPage brcPage=new BrcPage();
        //https://www.bluerentalcars.com/ adresine git  login butonuna bas
        Driver.getDriver().get(ConfigReader.getProperty("BrcUrl"));
        // Email ,password ,login butonlarini locate et
        brcPage.loginButton.click();
        Thread.sleep(1000);
        brcPage.email.sendKeys(ConfigReader.getProperty("brcUser"));
        brcPage.password.sendKeys(ConfigReader.getProperty("brcPass"));
        brcPage.login.click();
        //Degerleri girildiginde sayfaya basarili sekilde girilebildigini test et
        Assert.assertTrue(brcPage.loginsuccessfully.isDisplayed());


    }
}
