package clean.code.design_patterns.requirements;

// Builder Design Pattern
public class Burger {

    // Required
    private String buns;
    private String meat;

    // Optional
    private String vegetables;
    private String sauce;
    private String egg;
    private String cheese;

    private Burger (String buns, String meat, String vegetables,
                    String sauce, String egg, String cheese) {
        this.buns = buns;
        this.meat = meat;
        this.vegetables = vegetables;
        this.sauce = sauce;
        this.egg = egg;
        this.cheese = cheese;
    }

    public static class Builder {
        // Required
        private String buns;
        private String meat;

        // Optional
        private String vegetables;
        private String sauce;
        private String egg;
        private String cheese;

        public Builder buns(String buns) {
            this.buns = buns;
            return this;
        }

        public Builder meat(String meat) {
            this.meat = meat;
            return this;
        }

        public Builder vegetables(String vegetables) {
            this.vegetables = vegetables;
            return this;
        }

        public Builder sauce(String sauce) {
            this.sauce = sauce;
            return this;
        }

        public Builder egg(String egg) {
            this.egg = egg;
            return this;
        }

        public Builder cheese(String cheese) {
            this.cheese = cheese;
            return this;
        }

        public Burger build() {
            return new Burger(buns, meat, vegetables, sauce, egg, cheese);
        }
    }
}
