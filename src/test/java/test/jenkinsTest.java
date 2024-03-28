package test;

import org.testng.annotations.Test;
import utilities.TestBase;

public class jenkinsTest extends TestBase {
    @Test
    public void test(){
        System.out.println("Test calsisiyor");
        driver.get("https://www.google.de/");

    }
}
