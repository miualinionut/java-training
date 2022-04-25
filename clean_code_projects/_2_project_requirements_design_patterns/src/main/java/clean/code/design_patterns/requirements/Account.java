package clean.code.design_patterns.requirements;

public class Account {

    private final String firstName;
    private final String lastName;
    private final String mobilePhone;
    private final String phone;
    private final String email;
    private final Address address;

    private Account(AccountBuilder accountBuilder){
        this.firstName = accountBuilder.firstName;
        this.lastName = accountBuilder.lastName;
        this.mobilePhone = accountBuilder.mobilePhone;
        this.phone = accountBuilder.phone;
        this.email = accountBuilder.email;
        this.address = accountBuilder.address;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getMobilePhone() {
        return mobilePhone;
    }

    public String getPhone() {
        return phone;
    }

    public String getEmail() {
        return email;
    }

    public Address getAddress() {
        return address;
    }

    @Override
    public String toString() {
        return "Account{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", mobilePhone='" + mobilePhone + '\'' +
                ", phone='" + phone + '\'' +
                ", email='" + email + '\'' +
                ", address=" + address +
                '}';
    }

    public static class AccountBuilder {
        private final String firstName;
        private final String lastName;
        private final String mobilePhone;
        private String phone;
        private String email;
        private Address address;

        public AccountBuilder(String firstName, String lastName, String mobilePhone) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.mobilePhone = mobilePhone;
        }

        public AccountBuilder setPhone(String phone){
            this.phone = phone;
            return this;
        }

        public AccountBuilder setEmail(String email){
            this.email = email;
            return this;
        }

        public AccountBuilder setAddress(Address address){
            this.address = address;
            return this;
        }

        public Account build(){
            return new Account(this);
        }
    }
}
