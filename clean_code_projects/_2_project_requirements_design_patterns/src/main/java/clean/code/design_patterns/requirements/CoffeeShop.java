public class CoffeeShop {
    private boolean milk;
    private boolean flavour;
    private String typeOfFlavour;
    private String typeOfCup;

    //Singelton Design pattern
    public boolean getMilk(){
        return this.milk;
    }

    public String getTypeOfFlavour(){
        return this.typeOfFlavour;
    }

    public boolean getFlavour(){
        return this.flavour;
    }

    public String getTypeOfCup(){
        return this.typeOfCup;
    }
    private CoffeeShop(BuilderCoffeeShop builder){
        this.milk = builder.milk;
        this.flavour = builder.flavour;
        this.typeOfCup = builder.typeOfCup;
        this.typeOfFlavour = builder.typeOfFlavour;
    }

    public static class BuilderCoffeeShop{
        private boolean milk;
        private boolean flavour;
        private String typeOfFlavour;
        private String typeOfCup;

        //builder design patern
        public BuilderCoffeeShop(String cup){
            this.typeOfCup = cup;
        }

        public BuilderCoffeeShop setFlavour(boolean flavour, String typeOfflavour){
            this.flavour = flavour;
            if( flavour == true) setTypeOfFlavour(typeOfFlavour);
            return this;
        }

        public BuilderCoffeeShop setTypeOfFlavour(String flavour){
            this.typeOfFlavour = flavour;
            return this;
        }

        public BuilderCoffeeShop setMilk(boolean milk){
            this.milk = milk;
            return this;
        }

        public CoffeeShop build(){
            return new CoffeeShop(this);
        }

    }
}
