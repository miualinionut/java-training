package clean.code.design_patterns.requirements;

public class Cars {
        private final String mark;
        private final String model;
        private final int year;
        private final int km;
        private final int power;
        private final int rent;

public Cars(String mark, String model, int year, int km,int power, int rent){
            this.mark=mark;
            this.model=model;
            this.year=year;
            this.km=km;
            this.power=power;
            this.rent=rent;
        }

    public String getMark() {
        return mark;
    }

    public String getModel() {
        return model;
    }
    public int getYear(){
    return year;
}

    public int getKm() {
        return km;
    }

    public int getPower() {
        return power;
    }

    public int getRent() {
        return rent;
    }

    @Override
    public String toString(){
    return "Cars: " +
            "mark='" +mark + "', model='" +model +
            "', year=" + year + ",km="+ km+", power="+
            power+", rent="+rent;
    }
}

