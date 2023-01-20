package clean.code.design_patterns.requirements;

public class Toyota implements Car{
    @Override
    public String getBrandName() {
        return "Toyota";
    }

    @Override
    public String getModel() {
        return "Supra MK4";
    }

    @Override
    public String getFuelType() {
        return "Petrol";
    }

    @Override
    public int getPrice() {
        return 45000;
    }

    @Override
    public int getRelaseYear() {
        return 1996;
    }
}
