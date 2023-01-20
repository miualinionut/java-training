package clean.code.design_patterns.requirements;

public class CarFactory {
    public static Car getCar(String brand) {
        if(brand.toLowerCase().equals("bmw")) {
            return new BMW();
        }
        if(brand.toLowerCase().equals("toyota")) {
            return new Toyota();
        }
        if(brand.toLowerCase().equals("nissan")) {
            return new Nissan();
        }
        if(brand.toLowerCase().equals("tesla")) {
            return new Tesla();
        }

        return null;
    }
}
