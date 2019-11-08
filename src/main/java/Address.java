enum Address {

    WADOWICKA("WADOWICKA"),
    PYCHOWICKA("PYCHOWICKA");

    private String address;

    Address(String address)
    {
        this.address = address;
    }

    @Override
    public String toString() {
        return address;
    }
}
