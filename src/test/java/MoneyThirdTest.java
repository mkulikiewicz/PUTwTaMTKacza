import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertSame;

public class MoneyThirdTest {


    @DataProvider
    private static final Object[][] getInvalidAmount() {
        return new Integer[][]{{-12387}, {-5}, {-1}};
    }

    @DataProvider
    private static final Object[][] getInvalidCurrency() {
        return new String[][]{{""}, {null}};
    }

    private final static int VALID_AMOUNT = 5;
    private final static String VALID_CURRENCY = "USD";


    @Test(expectedExceptions = Exception.class)
    public void shouldThrowExceptions() throws Exception {
        // some implementation here which is expected
        //to throw an exception Of ExceptionClass
        throw new Exception();
    }

    @Test(dataProvider = "getInvalidAmount",
            expectedExceptions = IllegalArgumentException.class)
    public void shouldThrowIAEForInvalidAmount(int invalidAmount) {
        Money money = new Money(invalidAmount, VALID_CURRENCY);
    }

    @Test(dataProvider = "getInvalidCurrency", expectedExceptions = IllegalArgumentException.class)
    public void shouldThrowIAEForInvalidCurrency(String invalidCurrency) {
        Money money = new Money(VALID_AMOUNT, invalidCurrency);
    }

}