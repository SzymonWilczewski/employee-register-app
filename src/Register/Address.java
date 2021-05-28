package Register;

public class Address {
    private String street;
    private int houseNumber;
    private int flatNumber;
    private String city;

    public Address(String street, int houseNumber, int flatNumber, String city) {
        setStreet(street);
        setHouseNumber(houseNumber);
        setFlatNumber(flatNumber);
        setCity(city);
    }

    public String getStreet() { return street; }

    public int getHouseNumber() { return houseNumber; }

    public int getFlatNumber() { return flatNumber; }

    public String getCity() { return city; }

    public void setStreet(String street) {
        this.street = street;
    }

    public void setHouseNumber(int houseNumber) {
        this.houseNumber = houseNumber;
    }

    public void setFlatNumber(int flatNumber) {
        this.flatNumber = flatNumber;
    }

    public void setCity(String city) {
        this.city = city;
    }
}
