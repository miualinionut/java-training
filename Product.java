public abstract class Product {
    private String name;
    private float price;

    public Product(String name, float price) {
        this.name = name;
        this.price = price;
    }

    public Product() {
        this.name = new String();
        this.price = -1;
    }

    public String toString() {
        return this.name + " " + this.price;
    }

    public abstract void getPriceReduced();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }
}
