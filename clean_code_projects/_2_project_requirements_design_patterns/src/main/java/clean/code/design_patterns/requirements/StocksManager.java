package clean.code.design_patterns.requirements;

import java.util.ArrayList;

public class StocksManager implements Subject {

    private ArrayList<Observer> stockOwners;
    private ArrayList<Company> companies = new ArrayList<>();


    public StocksManager(ArrayList<Company> companies) {
        this.stockOwners = new ArrayList<>();
        this.companies = companies;
    }

    @Override
    public void register(Observer newStockOwner) {
        stockOwners.add(newStockOwner);
    }

    @Override
    public void unregister(Observer removedStockOwner) {
        int stockOwnerIndex = stockOwners.indexOf(removedStockOwner) + 1;
        System.out.println("Observer " + stockOwnerIndex + " was removed");
        stockOwners.remove(stockOwnerIndex);
    }

    @Override
    public void notifyObserver() {

        for(Observer observer : stockOwners) {
            observer.update(companies);
        }
    }

    public void setPrice(String abreviation) {
        for(Company company : companies) {
            if(company.getAbreviation().equals(abreviation)) {
                company.setPrice(company.priceUpdate());
            }
        }
        notifyObserver();
    }

}
