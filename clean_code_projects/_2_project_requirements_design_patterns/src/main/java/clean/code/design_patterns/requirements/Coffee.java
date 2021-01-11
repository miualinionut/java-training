package clean.code.design_patterns.requirements;

/* Builder pattern */
public class Coffee implements Drink {
    private String name; // required parameter
    private String size; // required parameter
    private String coffeeBeans; // required parameter
    private Double price; // required parameter
    private int sugar;
    private boolean foamedMilk;
    private boolean cream;
    private boolean ice;
    private boolean whiskey;
    private String topping;

    private Coffee(Builder builder) {
        this.name = builder.name;
        this.size = builder.size;
        this.price = builder.price;
        this.coffeeBeans = builder.coffeeBeans;
        this.sugar = builder.sugar;
        this.foamedMilk = builder.foamedMilk;
        this.cream = builder.cream;
        this.ice = builder.ice;
        this.whiskey = builder.whiskey;
        this.topping = builder.topping;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public String getSize() {
        return this.size;
    }

    @Override
    public Double getPrice() {
        return price;
    }

    public static class Builder {
        private String name; // required parameter
        private String size; // required parameter
        private String coffeeBeans; // required parameter
        private Double price; // required parameter
        private int sugar;
        private boolean foamedMilk;
        private boolean cream;
        private boolean ice;
        private boolean whiskey;
        private String topping;

        public Builder(String name, String size, String coffeeBeans, Double price) {
            this.name = name;
            this.size = size;
            this.price = price;
            this.coffeeBeans = coffeeBeans;
        }

        public Builder setSugar(int sugar) {
            this.sugar = sugar;
            return this;
        }

        public Builder setFoamedMilk(boolean foamedMilk) {
            this.foamedMilk = foamedMilk;
            return this;
        }

        public Builder setCream(boolean cream) {
            this.cream = cream;
            return this;
        }

        public Builder setIce(boolean ice) {
            this.ice = ice;
            return this;
        }

        public Builder setWhiskey(boolean whiskey) {
            this.whiskey = whiskey;
            return this;
        }

        public Builder setTopping(String topping) {
            this.topping = topping;
            return this;
        }

        public Coffee build() {
            return new Coffee(this);
        }
    }
}

/*
Coffee coffee = new Coffee.Builder(name, size, coffeeBeans).setCeva(..).build();

 */
