package clean.code.design_patterns.requirements;

public class Nissan implements Car{
    @Override
    public String getBrandName() {
        return "Nissan";
    }

    @Override
    public String getModel() {
        return "Skyline GTR R34";
    }

    @Override
    public String getFuelType() {
        return "Petrol";
    }

    @Override
    public int getPrice() {
        return 57000;
    }

    @Override
    public int getRelaseYear() {
        return 1997;
    }
}
