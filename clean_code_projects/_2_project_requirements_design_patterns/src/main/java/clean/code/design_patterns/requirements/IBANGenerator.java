package clean.code.design_patterns.requirements;


public class IBANGenerator {

    private static IBANGenerator instance;

    public static IBANGenerator getInstance(){
        if(instance == null) {
            instance = new IBANGenerator();
        }
        return instance;
    }

    public String generateIban(Account account, Bank bank) {

        long hash = 0;
        for (int i = 0; i < account.getLastName().length(); i++) {
            hash += 'A' - account.getLastName().charAt(i);
        }
        if (hash < 0) {
            hash *= -1;
        }
        return  bank.getCountryCode() + "123" + account.getLastName().toUpperCase() + hash + bank.getCurrency().toUpperCase();
    }

}
