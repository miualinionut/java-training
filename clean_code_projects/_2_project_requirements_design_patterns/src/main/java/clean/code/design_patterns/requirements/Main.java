package clean.code.design_patterns.requirements;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList <Company> companies = new ArrayList<>();
        Company IBM = new GrowingCompany("IBM", "IBMP", 197.0F);
        Company Apple = new GrowingCompany("Apple", "AAPL", 677.60F);
        Company Google = new ShrinkingCompany("Google", "Goog", 676.40F);
        companies.add(IBM);
        companies.add(Apple);
        companies.add(Google);

        StocksManager publisher = new StocksManager(companies);
        StockOwner subscriber = new StockOwner(publisher);
        StockOwner subscriber2 = new StockOwner(publisher);
        StockOwner subscriber3 = new StockOwner(publisher);
        publisher.setPrice("Goog");
        publisher.setPrice("AAPL");
//        publisher.setPrice("AAPL", 678.80F);
//        publisher.setPrice("IBMP", 197.3F);
    }
}
