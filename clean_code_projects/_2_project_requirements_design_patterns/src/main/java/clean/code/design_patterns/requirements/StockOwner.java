package clean.code.design_patterns.requirements;

import java.util.ArrayList;

public class StockOwner implements Observer{

    private ArrayList<Company> companies =  new ArrayList<>();

    private static int observerIDTotal = 0;

    private int observerID;

    private Subject stockManager;

    public StockOwner(Subject stockManager) {

        this.stockManager = stockManager;
        this.observerID = ++observerIDTotal;
//        System.out.println("New Observer " + this.observerID);

        stockManager.register(this);
    }

    public void update(ArrayList <Company> companies) {
        this.companies = companies;
        System.out.println("Stock owner: " + observerID);
        for(Company company : companies) {
            company.displayCompany();
        }
        System.out.println();
    }
}
