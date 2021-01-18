package clean.code.design_patterns.requirements.CombinedDesignPatterns;

public class VeggiePizza implements Items {

    //Required param.
    private String Name;
    private int Calories;
    private double Price;
    private int Size;
    private boolean Packaging;
    private int Weight;
    //Optional param.
    private boolean Sousage;
    private boolean RedPeppers;
    private boolean BabySpinach;
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

    private VeggiePizza(Builder bld) {
        this.Name = bld.Name;
        this.Calories = bld.Calories;
        this.Price = bld.Price;
        this.Size = bld.Size;
        this.Packaging = bld.Packaging;
        this.Sousage = bld.Sausage;
        this.RedPeppers = bld.RedPeppers;
        this.BabySpinach = bld.BabySpinach;
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
        // Optional
        private boolean Sausage;
        private boolean RedPeppers;
        private boolean BabySpinach;
        private boolean Onions;
        private boolean Mushrooms;
        private boolean Tomatoes;
        private boolean BlackOlives;
        private String Cheese;
        private int Weight;

        public Builder setSousage(boolean Sausage) {
            this.Sausage = Sausage;
            return this;
        }

        public Builder setRedPeppers(boolean RedPeppers) {
            this.RedPeppers = RedPeppers;
            return this;
        }

        public Builder setBabySpinach(boolean BabySpinach) {
            this.BabySpinach = BabySpinach;
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

        public Builder(String name, int calories, double price, int size,int weight, boolean packaging) {
            this.Name = name;
            this.Calories = calories;
            this.Price = price;
            this.Size = size;
            this.Weight = weight;
            this.Packaging = packaging;

        }

        public VeggiePizza build() {

            return new VeggiePizza(this);
        }
    }

}
