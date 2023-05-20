package clean.code.design_patterns.requirements;

public class ShrinkingCompany extends Company{
    public Trend trend;
    public ShrinkingCompany(String name, String abreviation, float stockPrice) {
        super(name, abreviation, stockPrice);
        trend = new Shrinking();
    }

    public float priceUpdate() {
        return this.getStockPrice() + trend.loss_function();
    }
}
