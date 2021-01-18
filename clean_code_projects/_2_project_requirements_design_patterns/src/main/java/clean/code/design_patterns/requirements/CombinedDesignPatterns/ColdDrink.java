package clean.code.design_patterns.requirements.CombinedDesignPatterns;



public class ColdDrink implements ItemsDrink{
    private String Name;
    private double Price;
    private int Weight;


    @Override
    public String getName() {
        return Name;
    }


    @Override
    public double getPrice() {
        return Price;
    }


    @Override
    public int getWeight() {
        return Weight;
    }

    private ColdDrink(Builder bld) {
        this.Name = bld.Name;
        this.Price = bld.Price;
        this.Weight = bld.Weight;
    }
    public static class Builder {
        private String Name;
        private double Price;
        private int Weight;




        public Builder(String name, double price,int weight) {
            this.Name = name;
            this.Price = price;
            this.Weight = weight;

        }

        public ColdDrink build() {

            return new ColdDrink(this);
        }
    }

}

