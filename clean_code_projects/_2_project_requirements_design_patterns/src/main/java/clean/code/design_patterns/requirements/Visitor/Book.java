package clean.code.design_patterns.requirements.Visitor;

public class Book implements Element {

    private String title;
    private String author;
    private float price;
    private static final float discount = 2;

    public Book(String title, String author, float price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }
    public float getRealPrice(){
        if(this.author.compareTo("Brian Tracy") == 0){
            return this.price - (discount/100)*this.price;
        }
        else return this.price;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public static float getDiscount() {
        return discount;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
