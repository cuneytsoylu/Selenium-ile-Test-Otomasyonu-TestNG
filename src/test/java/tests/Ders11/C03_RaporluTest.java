package tests.Ders11;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.BrcPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.TestBaseRapor;

public class C03_RaporluTest extends TestBaseRapor {

    @Test
    public void test() {
        /*
    -https://www.bluerentalcars.com/ adresine git
    -login butonuna bas
    -test data user email: user@gmail.com ,
    -test data password : 1234 dataları girip login e basın
    -login butonuna tiklayin
    -Degerleri girildiginde sayfaya basarili sekilde girilebildigini test et
*/
        BrcPage brcPage=new BrcPage();

        extentTest=extentReports.createTest("login test","giris sayfasini dogrulanmasi");
        Driver.getDriver().get(ConfigReader.getProperty("BrcUrl"));
        extentTest.info("Blue renat acar sitesine gidildi");
        brcPage.loginButton.click();
        extentTest.info("Giris login butonuna basildi");
        brcPage.email.sendKeys(ConfigReader.getProperty("brcUser"));
        extentTest.info("kullanici email adresi girildi");
        brcPage.password.sendKeys(ConfigReader.getProperty("brcPass"));
        extentTest.info("kullanici password  girildi");
        brcPage.login.click();
        extentTest.info("login butonuna basildi");
        Assert.assertTrue(brcPage.loginsuccessfully.isDisplayed());
        extentTest.pass("sayfaya basarili bir sekilde giris yapildi");



    }
}
