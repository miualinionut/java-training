package clean.code.design_patterns.requirements;

public class BMW implements Car{
    @Override
    public String getBrandName() {
        return "BMW";
    }

    @Override
    public String getModel() {
        return "X6M";
    }

    @Override
    public String getFuelType() {
        return "Petrol";
    }

    @Override
    public int getPrice() {
        return 20000;
    }

    @Override
    public int getRelaseYear() {
        return 2014;
    }
}
