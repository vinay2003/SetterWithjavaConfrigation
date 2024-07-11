package spring.setterwithjavaconfrigation;

public class Address {
    private String street;
    private String city;
    private String state;
    private String zip;

    public void setStreet(String street) {
        this.street = street;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setState(String state) {
        this.state = state;
    }

    public void setZip(String zip) {
        this.zip = zip;
    }

    public String toString() {
        return street + " " + city + " " + state + " " + zip;
    }

}
