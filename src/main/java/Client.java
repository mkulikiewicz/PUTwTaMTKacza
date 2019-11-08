import java.util.ArrayList;
import java.util.List;

class Client {
    private List<Address> addressList = new ArrayList<>();

    List<Address> getAddresses() {
        return addressList;
    }

    void addAddress(Address address) {
        addressList.add(address);
    }
}
