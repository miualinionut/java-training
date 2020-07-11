//builder design pattern

package clean.code.design_patterns.requirements.builder;

public class Pizza {
    private Size size;
    private boolean onions;
    private boolean olives;
    private boolean corn;
    private boolean mushrooms;
    private boolean pineapple;
    private boolean ham;
    private boolean pepperoni;

    public Size getSize() {
        return size;
    }

    public boolean hasOnions() {
        return onions;
    }

    public boolean hasOlives() {
        return olives;
    }

    public boolean hasCorn() {
        return corn;
    }

    public boolean hasMushrooms() {
        return mushrooms;
    }

    public boolean hasPineapple() {
        return pineapple;
    }

    public boolean hasHam() {
        return ham;
    }

    public boolean hasPepperoni() {
        return pepperoni;
    }

    private Pizza(Builder builder){
        this.size = builder.size;
        this.onions = builder.onions;
        this.olives = builder.olives;
        this.corn = builder.corn;
        this.mushrooms = builder.mushrooms;
        this.pineapple = builder.pineapple;
        this.ham = builder.ham;
        this.pepperoni = builder.pepperoni;
    }

    public static class Builder{
        private Size size;
        private boolean onions;
        private boolean olives;
        private boolean corn;
        private boolean mushrooms;
        private boolean pineapple;
        private boolean ham;
        private boolean pepperoni;

        public Builder(Size size) {
            this.size = size;
        }

        public Builder Onions(boolean onions) {
            this.onions = onions;
            return this;
        }

        public Builder Olives(boolean olives) {
            this.olives = olives;
            return this;
        }

        public Builder Corn(boolean corn) {
            this.corn = corn;
            return this;
        }

        public Builder Mushrooms(boolean mushrooms) {
            this.mushrooms = mushrooms;
            return this;
        }

        public Builder Pineapple(boolean pineapple) {
            this.pineapple = pineapple;
            return this;
        }

        public Builder Ham(boolean ham) {
            this.ham = ham;
            return this;
        }

        public Builder Pepperoni(boolean pepperoni) {
            this.pepperoni = pepperoni;
            return this;
        }

        public Pizza build(){
            return new Pizza(this);
        }
    }

    @Override
    public String toString() {
        return "Pizza{" +
                "size=" + size +
                ", onions=" + onions +
                ", olives=" + olives +
                ", corn=" + corn +
                ", mushrooms=" + mushrooms +
                ", pineapple=" + pineapple +
                ", ham=" + ham +
                ", pepperoni=" + pepperoni +
                '}';
    }

    public static void main(String[] args) {
        Pizza pizza1 = new Pizza.Builder(Size.Medium).Ham(true).Mushrooms(true).Olives(true).build();
        Pizza pizza2 = new Pizza.Builder(Size.Small).Pepperoni(true).Olives(true).Onions(true).build();
        System.out.println(pizza1);
        System.out.println(pizza2);
    }
}
