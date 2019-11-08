import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import static org.testng.Assert.assertEquals;

@Test
public class FahrenheitCelciusConverterTest {

    @DataProvider
    private Object[][] getCelciusToFahrenhairVariable() {
        return new Object[][]
                {
                        {0, 32},
                        {37, 98},
                        {100, 212}
                };
    }

    @DataProvider
    private Object[][] getFahrenhairToCelciusVariable() {
        return new Object[][]
                {
                        {32, 0},
                        {100, 37},
                        {212, 100}
                };
    }

    @Test(dataProvider = "getCelciusToFahrenhairVariable")
    public void shouldConvertCelciusToFahrenheit(int celcius, int fahrenhair) {
        assertEquals(FahrenheitCelciusConverter.toFahrenheit(celcius), fahrenhair);
    }

    @Test(dataProvider = "getFahrenhairToCelciusVariable")
    public void shouldConvertFahrenheitToCelcius(int fahrenhair, int celcius) {
        assertEquals(FahrenheitCelciusConverter.toCelcius(fahrenhair), celcius);

    }
}