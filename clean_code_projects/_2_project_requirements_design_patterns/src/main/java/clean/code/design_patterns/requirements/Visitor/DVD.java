package clean.code.design_patterns.requirements.Visitor;

public class DVD implements Element {

    private String title;
    private String type;
    private float price;
    private static final float discount = 5;

    public DVD(String title, String type, float price) {
        this.title = title;
        this.type = type;
        this.price = price;
    }

    public float getRealPrice(){
        if(this.price >= 100){
            return this.price - (discount/100)*this.price;
        }
        else return this.price;
    }

    public String getTitle() {
        return title;
    }

    public String getType() {
        return type;
    }

    public static float getDiscount() {
        return discount;
    }

    @Override
    public void accept(Visitor visitor) {
       visitor.visit(this);
    }
}
