package clean.code.design_patterns.requirements;

// Am creat o clasă FactoryCreator care utilizeaza Singleton Pattern astfel incat clasa FactoryCreator, ce parseaza informatia din clasele Bank sau Loan sa poata exista ca o singura instanta.
class FactoryCreator {
    private static final FactoryCreator instance = new FactoryCreator();

    private FactoryCreator() {
    }

    public static FactoryCreator getInstance() {
        return instance;
    }

    public static AbstractFactory getFactory(String choice) {
        if (choice.equalsIgnoreCase("Bank")) {
            return new BankFactory();
        } else if (choice.equalsIgnoreCase("Loan")) {
            return new LoanFactory();
        }
        return null;
    }
}