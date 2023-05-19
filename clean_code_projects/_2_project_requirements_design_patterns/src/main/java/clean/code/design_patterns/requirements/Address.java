package clean.code.design_patterns.requirements;

public class Address {
    private String street;
    private int number;
    private String city;

    public Address(String street, int number, String city) {
        this.street = street;
        this.number = number;
        this.city = city;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Address- ");
        sb.append("Number: ").append(number);
        sb.append(" Street: ").append(street);
        sb.append(" City: ").append(city);
        return sb.toString();
    }
}
