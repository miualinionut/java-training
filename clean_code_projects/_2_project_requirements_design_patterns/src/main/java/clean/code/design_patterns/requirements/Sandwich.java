package clean.code.design_patterns.requirements;

public class Sandwich {
    private String name;
    private String bread;
    private String meat;
    private String vegetables;
    private String cheese;
    private String sauce;

    public Sandwich(Builder builder) {
        this.name = builder.name;
        this.bread = builder.bread;
        this.meat = builder.meat;
        this.vegetables = builder.vegetables;
        this.cheese = builder.cheese;
        this.sauce = builder.sauce;
    }

    @Override
    public String toString() {
        return "Sandwich {" +
                "name='" + name + '\'' +
                ", bread='" + bread + '\'' +
                ", meat='" + meat + '\'' +
                ", vegetables='" + vegetables + '\'' +
                ", cheese='" + cheese + '\'' +
                ", sauce='" + sauce + '\'' +
                '}';
    }

    static class Builder {
        private String name;
        private String bread;
        private String meat;
        private String vegetables;
        private String cheese;
        private String sauce;

        public Builder(String name) {
            this.name = name;
        }

        public Builder setBread(String bread) {
            this.bread = bread;
            return this;
        }

        public Builder setMeat(String meat) {
            this.meat = meat;
            return this;
        }

        public Builder setVegetables(String vegetable) {
            this.vegetables = vegetable;
            return this;
        }

        public Builder setCheese(String cheese) {
            this.cheese = cheese;
            return this;
        }

        public Builder setSauce(String sauce) {
            this.sauce = sauce;
            return this;
        }

        public Sandwich build() {
            return new Sandwich(this);
        }

    }

}




