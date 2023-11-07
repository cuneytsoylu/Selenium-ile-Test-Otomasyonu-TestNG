package tests.Ders11;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import pages.BrcPage;
import utilities.ConfigReader;
import utilities.Driver;

public class C05_DataProvider {
    @DataProvider
    public static Object[][] loginTest() {
        return new Object[][]{{"user@gmail.com","12345"},{"user1@gmail.com","12345"},{"user2@gmail.com","12345"}};
    }

    @Test(dataProvider = "loginTest")
    public void test(String mail,String password) {
        BrcPage brcPage=new BrcPage();
        //https://www.bluerentalcars.com/ adresine git
        Driver.getDriver().get(ConfigReader.getProperty("BrcUrl"));
        //login butonuna bas
        brcPage.loginButton.click();
        //Data provider ile 3 farklı userEmail ve 3 farklı password girelim
        brcPage.email.sendKeys(mail);
        brcPage.password.sendKeys(password);
        //login butonuna tiklayin
        brcPage.login.click();
        //Degerleri girildiginde sayfaya basarili sekilde girilemedigini test et
        Assert.assertTrue(brcPage.login.isDisplayed());
    }
}
