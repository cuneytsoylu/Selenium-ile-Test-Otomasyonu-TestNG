package tests.Ders09;

import org.testng.annotations.Test;
import utilities.TestBaseBeforeMethodAfterMethod;

public class C03_Priority extends TestBaseBeforeMethodAfterMethod {
    @Test(priority = -5)
    public void testAmazon() {
        driver.get("https://www.amazon.com.tr");
    }
    @Test// default olarak 0 kabul eder
    public void testbestbuy() {
        driver.get("https://www.bestbuy.com");
    }
    @Test(priority = 1)
    public void testhepsiburada() {
        driver.get("https://www.hepsiburada.com");
    }
}
