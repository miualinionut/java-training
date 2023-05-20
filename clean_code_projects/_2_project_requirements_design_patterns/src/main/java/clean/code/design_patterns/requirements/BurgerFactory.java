package clean.code.design_patterns.requirements;

public class BurgerFactory {
    private boolean salad;
    private boolean sauce;
    private String typeOfSauce;
    private String typeOfMeat;

    //Singelton Design pattern
    public boolean getSalad(){
        return this.salad;
    }

    public String getTypeOfSauce(){
        return this.typeOfSauce;
    }

    public boolean getSauce(){
        return this.sauce;
    }

    public String getTypeOfMeat(){
        return this.typeOfMeat;
    }
    private BurgerFactory(BuilderBurgerFactory builder){
        this.salad = builder.salad;
        this.sauce = builder.sauce;
        this.typeOfMeat = builder.typeOfMeat;
        this.typeOfSauce = builder.typeOfSauce;
    }

    public static class BuilderBurgerFactory{
        private boolean salad;
        private boolean sauce;
        private String typeOfSauce;
        private String typeOfMeat;

        //builder design patern
        public BuilderBurgerFactory(String meat){
            this.typeOfMeat = meat;
        }

        public BuilderBurgerFactory setSauce(boolean sauce, String typeOfSauce){
            this.sauce = sauce;
            if( sauce == true) setTypeOfSauce(typeOfSauce);
            return this;
        }

        public BuilderBurgerFactory setTypeOfSauce(String sauce){
            this.typeOfSauce = sauce;
            return this;
        }

        public BuilderBurgerFactory setSalad(boolean salad){
            this.salad = salad;
            return this;
        }

        public BurgerFactory build(){
            return new BurgerFactory(this);
        }

    }
}
