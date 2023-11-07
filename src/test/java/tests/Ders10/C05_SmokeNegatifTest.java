package tests.Ders10;

import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AlotechPage;
import utilities.ConfigReader;
import utilities.Driver;

public class C05_SmokeNegatifTest {
    AlotechPage aloTech=new AlotechPage();
    Actions actions=new Actions(Driver.getDriver());
    @Test(groups = "grup1")
    public void yanlisKullanici() throws InterruptedException {
// https://demo1.alo-tech.com/ adresine git
        Driver.getDriver().get(ConfigReader.getProperty("aloTechURL"));
//Email,Password,Login elementlerini locate ediniz
        aloTech.email.sendKeys(ConfigReader.getProperty("WrongUser"));
        aloTech.password.sendKeys(ConfigReader.getProperty("Password"));
        Thread.sleep(1000);
        actions.doubleClick(aloTech.loginButton);
        Thread.sleep(1000);
        aloTech.loginButton.click();

//Degerleri girildiginde sayfaya girilemedigini test et
        Assert.assertTrue(aloTech.failedLogin.isDisplayed());

//Sayfayı kapatınız
Driver.closeDriver();
    }

    @Test
    public void yanlisSifre() throws InterruptedException {
        // https://demo1.alo-tech.com/ adresine git
        Driver.getDriver().get(ConfigReader.getProperty("aloTechURL"));
//Email,Password,Login elementlerini locate ediniz
        Thread.sleep(1000);
        aloTech.email.sendKeys(ConfigReader.getProperty("User"));
        aloTech.password.sendKeys(ConfigReader.getProperty("WrongPass"));
        Thread.sleep(1000);
        actions.doubleClick(aloTech.loginButton);
        Thread.sleep(1000);
        aloTech.loginButton.click();

//Degerleri girildiginde sayfaya girilemedigini test et
        Assert.assertTrue(aloTech.failedLogin.isDisplayed());

//Sayfayı kapatınız
        Driver.closeDriver();
    }


    @Test
    public void yanlisKullaniciSifre() throws InterruptedException {
        // https://demo1.alo-tech.com/ adresine git
        Driver.getDriver().get(ConfigReader.getProperty("aloTechURL"));
//Email,Password,Login elementlerini locate ediniz
        Thread.sleep(1000);
        aloTech.email.sendKeys(ConfigReader.getProperty("WrongUser"));
        aloTech.password.sendKeys(ConfigReader.getProperty("WrongPass"));
        Thread.sleep(1000);
        actions.doubleClick(aloTech.loginButton);
        Thread.sleep(1000);
        aloTech.loginButton.click();

//Degerleri girildiginde sayfaya girilemedigini test et
        Assert.assertTrue(aloTech.failedLogin.isDisplayed());

//Sayfayı kapatınız
        Driver.closeDriver();
    }



}
