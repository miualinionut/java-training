package clean.code.design_patterns.requirements;

public class Main {

    public static void main(String[] args) {

        Account account1 = new Account.AccountBuilder("Bogdan", "Nita", "123")
                .setAddress(new Address.AddressBuilder()
                        .setCity("Cluj")
                        .build())
                .build();
        Bank bt = new Bank("bt", "ron", "RO");

        IBANGenerator IBAN = IBANGenerator.getInstance();

        System.out.println(IBAN.generateIban(account1, bt));
    }
}
