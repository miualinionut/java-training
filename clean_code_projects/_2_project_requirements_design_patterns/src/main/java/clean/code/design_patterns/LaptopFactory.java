package clean.code.design_patterns;

public class LaptopFactory {

    // Objects are created here
    public Laptop createLaptop(String laptopType){
        if (laptopType == null) {
            return null;
        }

        switch (laptopType.toUpperCase()) {
            case "NormalLaptop":
                return new NormalLaptop();
            case "GamingLaptop":
                GamingLaptop gamingLaptop = new GamingLaptop();
                return gamingLaptop;

            default:
                return null;
        }
    }
}