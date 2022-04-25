package clean.code.design_patterns.requirements;

public class Address {
    private final String county;
    private final String city;
    private final String street;
    private final String number;
    private final String postalCode;
    private final String apartment;

    public Address(AddressBuilder addressBuilder) {
        this.county = addressBuilder.county;
        this.city = addressBuilder.city;
        this.street = addressBuilder.street;
        this.number = addressBuilder.number;
        this.postalCode = addressBuilder.postalCode;
        this.apartment = addressBuilder.apartment;
    }

    public String getCounty() {
        return county;
    }

    public String getCity() {
        return city;
    }

    public String getStreet() {
        return street;
    }

    public String getNumber() {
        return number;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public String getApartment() {
        return apartment;
    }

    @Override
    public String toString() {
        return "Address{" +
                "county='" + county + '\'' +
                ", city='" + city + '\'' +
                ", street='" + street + '\'' +
                ", number='" + number + '\'' +
                ", postalCode='" + postalCode + '\'' +
                ", apartment='" + apartment + '\'' +
                '}';
    }

    public static class AddressBuilder{
        private String county;
        private String city;
        private String street;
        private String number;
        private String postalCode;
        private String apartment;

        public AddressBuilder setCounty(String county) {
            this.county = county;
            return this;
        }

        public AddressBuilder setCity(String city) {
            this.city = city;
            return this;
        }

        public AddressBuilder setStreet(String street) {
            this.street = street;
            return this;
        }

        public AddressBuilder setNumber(String number) {
            this.number = number;
            return this;
        }

        public AddressBuilder setPostalCode(String postalCode) {
            this.postalCode = postalCode;
            return this;
        }

        public AddressBuilder setApartment(String apartment) {
            this.apartment = apartment;
            return this;
        }

        public Address build(){
            return new Address(this);
        }
    }
}
