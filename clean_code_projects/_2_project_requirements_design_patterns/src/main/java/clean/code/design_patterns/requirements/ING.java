package clean.code.design_patterns.requirements;

class ING implements Bank{
    private final String Bank_NAME;
    public ING(){
        Bank_NAME="ING BANK";
    }
    public String getBankName() {

        return Bank_NAME;
    }
}