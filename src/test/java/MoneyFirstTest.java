import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertSame;

public class MoneyFirstTest {

    @DataProvider
    private static final Object[][] getMoney() {
        return new Object[][]{
                {14, "ZŁ"},
                {20, "EUR"}
        };
    }

    @Test(dataProvider = "getMoney")
    private void testConstructorShouldSetAmountAndCurrency(int amount, String currency) {
        //Given
        Money money = new Money(amount, currency);

        //Then
        assertSame(money.getAmount(), amount);
        assertEquals(money.getCurrency(), currency);
    }
}
