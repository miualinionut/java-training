package clean.code.design_patterns.requirements;

/* Builder pattern */
public class Tea implements Drink {
    private String name; // required parameter
    private String size; // required parameter
    private String type; // required parameter
    private Double price; // required parameter
    private boolean lemon;
    private boolean honey;
    private boolean milk;
    private boolean ginger;
    private String jellyTopping;
    private String fruityFlavour;

    private Tea(Builder builder) {
        this.name = builder.name;
        this.size = builder.size;
        this.type = builder.type;
        this.price = builder.price;
        this.lemon = builder.lemon;
        this.honey = builder.honey;
        this.milk = builder.milk;
        this.ginger = builder.ginger;
        this.jellyTopping = builder.jellyTopping;
        this.fruityFlavour = builder.fruityFlavour;
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
        private String type; // required parameter
        private Double price; // required parameter
        private boolean lemon;
        private boolean honey;
        private boolean milk;
        private boolean ginger;
        private String jellyTopping;
        private String fruityFlavour;

        public Builder(String name, String size, String type, Double price) {
            this.name = name;
            this.size = size;
            this.type = type;
            this.price = price;
        }

        public Builder setLemon(boolean lemon) {
            this.lemon = lemon;
            return this;
        }

        public Builder setHoney(boolean honey) {
            this.honey = honey;
            return this;
        }

        public Builder setMilk(boolean milk) {
            this.milk = milk;
            return this;
        }

        public Builder setGinger(boolean ginger) {
            this.ginger = ginger;
            return this;
        }

        public Builder setJellyTopping(String jellyTopping) {
            this.jellyTopping = jellyTopping;
            return this;
        }

        public Builder setFruityFlavour(String fruityFlavour) {
            this.fruityFlavour = fruityFlavour;
            return this;
        }

        public Tea build() {
            return new Tea(this);
        }
    }
}
