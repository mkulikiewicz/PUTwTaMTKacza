import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import static org.testng.Assert.assertEquals;

@Test
public class Example1Test {

    private SoftAssert soft = new SoftAssert();

    @DataProvider()
    public Object[][] getCorrectString() {
        return new Object[][]
                {
                        {"Ind%^ia", "ai^%dnI"},
                        {"UKqwe1234", "4321ewqKU"},
                        {"ExampleText", "txeTelpmaxE"}
                };

    }

    @Test(dataProvider = "getCorrectString")
    public void testReversWithCorrectString(String toRevers, String afterRevers) {
        String returnRevers = Example1.reverse(toRevers);

        assertEquals(returnRevers, afterRevers);
    }

    public void testReversWithEmptyString() {
        String emptyString = "";

        String returnRevers = Example1.reverse(emptyString);

        assertEquals(returnRevers, "");
    }

    @Test(expectedExceptions = NullPointerException.class)
    public void testReversWithNullString() {
        String returnRevers = Example1.reverse(null);
    }
}

