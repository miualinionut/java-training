package clean.code.design_patterns.requirements.Visitor;

public class Boardgame implements Element {

    private String title;
    private int minimAge;
    private float price;
    private boolean isDiscountPeriod;

    public Boardgame(String title, int minimAge, float price) {
        this.title = title;
        this.minimAge = minimAge;
        this.price = price;
        this.isDiscountPeriod = false;
    }

    boolean getIsDiscountPeriod(){
        return isDiscountPeriod;
    }

    public String getTitle() {
        return title;
    }

    public int getMinimAge() {
        return minimAge;
    }

    public float getPrice() {
        return price;
    }

    public void setDiscountPeriod(boolean discountPeriod) {
        isDiscountPeriod = discountPeriod;
    }

    @Override
    public void accept(Visitor visitor) {
       visitor.visit(this);
    }
}
