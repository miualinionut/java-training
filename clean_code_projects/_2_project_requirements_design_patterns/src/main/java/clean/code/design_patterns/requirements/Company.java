package clean.code.design_patterns.requirements;

public class Company {

    private String name;
    private String abreviation;
    private float stockPrice;
    public Trend trend;
    public Company(String name, String abreviation, float stockPrice) {
        this.name = name;
        this.abreviation = abreviation;
        this.stockPrice = stockPrice;
    }

    public String getName() { return this.name; }
    public float getStockPrice() { return this.stockPrice; }
    public String getAbreviation() { return this.abreviation; }
    public void setPrice(float stockPrice) { this.stockPrice = stockPrice; }
    public void displayCompany() {
        System.out.println(this.abreviation + " " + this.stockPrice);
    }

    public void setTrend(Trend newTrend) {
        trend = newTrend;
    }

    public float priceUpdate() {
        return stockPrice + trend.loss_function();
    }

}
