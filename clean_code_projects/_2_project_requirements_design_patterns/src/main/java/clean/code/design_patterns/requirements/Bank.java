package clean.code.design_patterns.requirements;

public class Bank {
    private String name;
    private String currency;
    private String countryCode;

    public Bank(String name, String currency, String countryCode) {
        this.name = name;
        this.currency = currency;
        this.countryCode = countryCode;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public String getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }
}
