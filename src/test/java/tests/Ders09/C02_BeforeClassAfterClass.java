package tests.Ders09;

import org.testng.annotations.Test;
import utilities.TestBaseBeforeClassAfterClass;

public class C02_BeforeClassAfterClass extends TestBaseBeforeClassAfterClass {
    @Test
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
