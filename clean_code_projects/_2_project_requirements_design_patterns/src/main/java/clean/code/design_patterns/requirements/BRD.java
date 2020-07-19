package clean.code.design_patterns.requirements;
// clasa concreta
class BRD implements Bank {
    private final String Bank_NAME;

    BRD() {
        Bank_NAME = "BRD BANK";
    }

    public String getBankName() {

        return Bank_NAME;
    }
}