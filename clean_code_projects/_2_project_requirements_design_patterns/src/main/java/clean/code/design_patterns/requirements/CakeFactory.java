package clean.code.design_patterns.requirements;

public class CakeFactory {
    public static void main(String[] args) {

    }

    public Cake getCake(String cakeType){
        if(cakeType == null){
            return null;
        }
        if(cakeType.equalsIgnoreCase("ChocolateCake")){
            return new ChocolateCake();

        } else if(cakeType.equalsIgnoreCase("VanillaCake")){
            return new VanillaCake();

        } else if(cakeType.equalsIgnoreCase("StrawberryCake")){
            return new StrawberryCake();
        }

        return null;
    }

}
