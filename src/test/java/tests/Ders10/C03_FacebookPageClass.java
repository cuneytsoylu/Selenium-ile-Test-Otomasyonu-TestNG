package tests.Ders10;

import com.github.javafaker.Faker;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.FacebookPage;
import utilities.ConfigReader;
import utilities.Driver;

public class C03_FacebookPageClass {
Faker faker;
    @Test()
    public void test() throws InterruptedException {
        FacebookPage facebookPage=new FacebookPage();
        //https://www.facebook.com/ adresine gidin
        Driver.getDriver().get(ConfigReader.getProperty("facebookURL"));
//POM’a uygun olarak email, sifre kutularini ve giris yap
//butonunu locate edin
faker=new Faker();
//Faker class’ini kullanarak email ve sifre degerlerini
//yazdirip, giris butonuna basin
    facebookPage.email.sendKeys(faker.internet().emailAddress());
    facebookPage.password.sendKeys(faker.internet().password());
    facebookPage.loginButton.click();

//Basarili giris yapilamadigini test edin
        Thread.sleep(2000);
        Assert.assertTrue(facebookPage.failedLogin.isDisplayed());
        Driver.closeDriver();

    }
}
