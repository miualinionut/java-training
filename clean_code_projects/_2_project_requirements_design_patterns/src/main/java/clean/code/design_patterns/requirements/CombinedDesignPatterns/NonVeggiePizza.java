package clean.code.design_patterns.requirements.CombinedDesignPatterns;

public class NonVeggiePizza implements Items {
    //Required param.
    private String Name;
    private int Calories;
    private double Price;
    private int Size;
    private boolean Packaging;
    private int Weight;
    //Optional param.
    private boolean Sousage;
    private boolean Pepperoni;
    private boolean SalamChorizo;
    private boolean Bacon;
    private boolean Onions;
    private boolean Mushrooms;
    private boolean Tomatoes;
    private boolean BlackOlives;
    private String Cheese; //feta, provolone, mozzarella


    @Override
    public String getName() {
        return Name;
    }

    @Override
    public int getCalories() {
        return Calories;
    }

    @Override
    public double getPrice() {
        return Price;
    }

    @Override
    public int getSize() {
        return Size;
    }

    @Override
    public int getWeight() {
        return Weight;
    }

    private NonVeggiePizza(Builder bld) {
        this.Name = bld.Name;
        this.Calories = bld.Calories;
        this.Price = bld.Price;
        this.Size = bld.Size;
        this.Packaging = bld.Packaging;
        this.Sousage = bld.Sausage;
        this.Pepperoni = bld.Pepperoni;
        this.SalamChorizo = bld.SalamChorizo;
        this.Bacon = bld.Bacon;
        this.Onions = bld.Onions;
        this.Mushrooms = bld.Mushrooms;
        this.Tomatoes = bld.Tomatoes;
        this.BlackOlives = bld.BlackOlives;
        this.Cheese = bld.Cheese;
        this.Weight = bld.Weight;
    }
    public static class Builder {
        // Required
        private String Name;
        private int Calories;
        private double Price;
        private int Size;
        private boolean Packaging;
        private int Weight;
        // Optional
        private boolean Sausage;
        private boolean Pepperoni;
        private boolean SalamChorizo;
        private boolean Bacon;
        private boolean Onions;
        private boolean Mushrooms;
        private boolean Tomatoes;
        private boolean BlackOlives;
        private String Cheese;


        public Builder setSousage(boolean Sausage) {
            this.Sausage = Sausage;
            return this;
        }

        public Builder setPepperoni(boolean Pepperoni) {
            this.Pepperoni = Pepperoni;
            return this;
        }

        public Builder setSalamChorizo(boolean SalamChorizo) {
            this.SalamChorizo = SalamChorizo;
            return this;
        }

        public Builder setBacon(boolean Bacon) {
            this.Bacon = Bacon;
            return this;
        }

        public Builder setOnions(boolean Onions) {
            this.Onions = Onions;
            return this;
        }

        public Builder setMushrooms(boolean Mushrooms) {
            this.Mushrooms = Mushrooms;
            return this;
        }

        public Builder setTomatoes(boolean Tomatoes) {
            this.Tomatoes = Tomatoes;
            return this;
        }

        public Builder setBlackOlives(boolean BlackOlives) {
            this.BlackOlives = BlackOlives;
            return this;
        }

        public Builder setCheese(String Cheese) {
            this.Cheese = Cheese;
            return this;
        }

        public Builder(String name, int calories, double price, int size, int weight ,boolean packaging) {
            this.Name = name;
            this.Calories = calories;
            this.Price = price;
            this.Size = size;
            this.Packaging = packaging;
            this.Weight = weight;
        }

        public NonVeggiePizza build() {

            return new NonVeggiePizza(this);
        }
    }

}
