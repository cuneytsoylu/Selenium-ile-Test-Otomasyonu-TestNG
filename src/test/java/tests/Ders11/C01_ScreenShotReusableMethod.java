package tests.Ders11;

import org.openqa.selenium.Keys;
import org.testng.annotations.Test;
import pages.AmazonPage;
import utilities.*;

import java.io.IOException;

public class C01_ScreenShotReusableMethod  {
    @Test
    public void testAll() throws IOException {

        //Hepsiburada sayfasına gidiniz
        Driver.getDriver().get("https://www.hepsiburada.com");
        //Ve sayfanın resmini alınız
        ReusableMethods.getScreenshot("tum ekran resmi");
        //Sayfayı kapatınız
        Driver.closeDriver();

    }

    @Test
    public void testWE() throws IOException {
        AmazonPage amazonPage=new AmazonPage();
        //Amazon sayfasına gidiniz
        Driver.getDriver().get(ConfigReader.getProperty("amazonURL"));
        ReusableMethods.waitFor(1);
        //Iphone aratınız
        amazonPage.searchBox.sendKeys("Iphone", Keys.ENTER);
        //Arama sonuc yazısı Webelementinin resmini alınız
        ReusableMethods.getScreenshotWebElement("web elemntin ekran goruntusu",amazonPage.WE)
;    }
}
