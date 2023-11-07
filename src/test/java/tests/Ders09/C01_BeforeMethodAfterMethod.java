package tests.Ders09;

import org.testng.annotations.Test;
import utilities.TestBaseBeforeMethodAfterMethod;

public class C01_BeforeMethodAfterMethod extends TestBaseBeforeMethodAfterMethod {

    @Test(groups = "grup1")
    public void testAmazon() {
        driver.get("https://www.amazon.com.tr");
    }
    @Test
    public void testbestbuy() {
        driver.get("https://www.bestbuy.com");
    }
    @Test
    public void testhepsiburada() {
        driver.get("https://www.hepsiburada.com");
    }
}
