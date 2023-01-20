package clean.code.design_patterns.requirements;

public class Tesla implements Car{
    @Override
    public String getBrandName() {
        return "Tesla";
    }

    @Override
    public String getModel() {
        return "Model X";
    }

    @Override
    public String getFuelType() {
        return "Electric";
    }

    @Override
    public int getPrice() {
        return 100000;
    }

    @Override
    public int getRelaseYear() {
        return 2020;
    }
}
