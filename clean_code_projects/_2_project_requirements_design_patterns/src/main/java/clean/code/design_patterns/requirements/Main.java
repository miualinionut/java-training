package clean.code.design_patterns.requirements;

public class Main {

    public static void main(String[] args) {

        Account account1 = new Account.AccountBuilder("Bogdan", "Nita", "123")
                .setAddress(new Address.AddressBuilder()
                        .setCity("Cluj")
                        .build())
                .build();
        Bank bt = new Bank("bt", "ron", "RO");

        Account account2 = new Account.AccountBuilder("Calin", "Pop", "142")
                .setAddress(new Address.AddressBuilder()
                        .setCity("Bucuresti")
                        .setStreet("Florilor")
                        .build())
                .setEmail("calin.pop@gmail.com")
                .build();
        Bank brd = new Bank("BRD", "euro", "RO");

        IBANGenerator IBAN = IBANGenerator.getInstance();
        System.out.println(account1);
        System.out.println(IBAN.generateIban(account1, bt));
        System.out.println(account2);
        System.out.println(IBAN.generateIban(account2, brd));
    }
}
