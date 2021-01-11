package clean.code.design_patterns.requirements;

/* Builder pattern */
public class Smoothie implements Drink {
    private String name; // required parameter
    private String size; // required parameter
    private String milk; // required parameter
    private Double price; // required parameter
    private boolean banana;
    private boolean strawberries;
    private boolean pineapple;
    private boolean babySpinach;
    private boolean orange;

    private Smoothie(Builder builder) {
        this.name = builder.name;
        this.size = builder.size;
        this.milk = builder.milk;
        this.price = builder.price;
        this.banana = builder.banana;
        this.strawberries = builder.strawberries;
        this.pineapple = builder.pineapple;
        this.babySpinach = builder.babySpinach;
        this.orange = builder.orange;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getSize() {
        return size;
    }

    @Override
    public Double getPrice() {
        return price;
    }

    public static class Builder {
        private String name; // required parameter
        private String size; // required parameter
        private String milk; // required parameter
        private Double price; // required parameter
        private boolean banana;
        private boolean strawberries;
        private boolean pineapple;
        private boolean babySpinach;
        private boolean orange;

        public Builder(String name, String size, String milk, Double price) {
            this.name = name;
            this.size = size;
            this.milk = milk;
            this.price = price;
        }

        public Builder setBanana(boolean banana) {
            this.banana = banana;
            return this;
        }

        public Builder setStrawberries(boolean strawberries) {
            this.strawberries = strawberries;
            return this;
        }

        public Builder setPineapple(boolean pineapple) {
            this.pineapple = pineapple;
            return this;
        }

        public Builder setBabySpinach(boolean babySpinach) {
            this.babySpinach = babySpinach;
            return this;
        }

        public Builder setOrange(boolean orange) {
            this.orange = orange;
            return this;
        }

        public Smoothie build() {
            return new Smoothie(this);
        }
    }
}
