package clean.code.design_patterns.requirements;

public class GrowingCompany extends Company {
    public Trend trend;
    public GrowingCompany(String name, String abreviation, float stockPrice) {
        super(name, abreviation, stockPrice);
        trend = new Growing();
    }

    public float priceUpdate() {
        return this.getStockPrice() + trend.loss_function();
    }
}
