package clean.code.design_patterns.requirements;

public class Bill {
    static String currency = "RON";
    int value;

    public Bill(int value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value + currency;
    }

}
