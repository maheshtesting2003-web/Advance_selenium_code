package Testng;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class PracticeAssertionTest {
    @Test
    public void demoSoftAssert() {
        SoftAssert softAssert = new SoftAssert();

        softAssert.assertEquals("dinga", "dingi");   // fail 1
        softAssert.assertNotEquals("dinga", "dinga"); // fail 2

        softAssert.assertAll();  // sabhi failures ek saath collect ho ke report hote hain
    }
}