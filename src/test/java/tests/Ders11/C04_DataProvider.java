package tests.Ders11;

import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import pages.AmazonPage;
import utilities.ConfigReader;
import utilities.Driver;

public class C04_DataProvider {


    @DataProvider
    public static Object[][] aranacakKelimer() {
        return new Object[][]{{"java"},{"selenium"},{"samsung"},{"iphone"}};
    }

    @Test(dataProvider = "aranacakKelimer",groups = "grup1")
    public void test(String kelimeler) {
        AmazonPage amazonPage=new AmazonPage();
        //amazona gidelim
        Driver.getDriver().get(ConfigReader.getProperty("amazonURL"));
        //java, selenium, samsung ve iphone icin arama yapalim
        amazonPage.searchBox.sendKeys(kelimeler, Keys.ENTER);

        //sonuclarin aradigimiz kelime icerdigini test edelim
        String actualData=amazonPage.WE.getText();
        Assert.assertTrue(actualData.contains(kelimeler));
    }
}
