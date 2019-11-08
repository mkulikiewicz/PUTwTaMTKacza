import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

@Test
public class ClientTest {
    private Address addressA = Address.PYCHOWICKA;
    private Address addressB = Address.WADOWICKA;
    private Client client;
    @BeforeMethod
    private void setUP()
    {
        client = new Client();
    }

    public void afterCreationShouldHaveNoAddress() {

        assertEquals(client.getAddresses().size(), 0);
    }


    public void shouldAllowToAddAddress() {
        client.addAddress(addressA);

        assertEquals(client.getAddresses().size(), 1);

        assertTrue(client.getAddresses().contains(addressA));
    }


    public void shouldAllowToAddManyAddresses() {
        client.addAddress(addressA);
        client.addAddress(addressB);

        assertEquals(client.getAddresses().size(), 2);
        assertTrue(client.getAddresses().contains(addressA));
        assertTrue(client.getAddresses().contains(addressB));
    }
}

