package clean.code.design_patterns.requirements;

public class Main {

    public static void main(String[] args) {

        Car c1 = new Car.Builder("Audi")
                .setModel("A6")
                .setFuel("Diesel")
                .setEngine("3.0")
                .setPower("245CP")
                .setYear("2012")
                .setType("Sedan")
                .setRegnumber("BC99MET")
                .build();

        Car c2 = new Car.Builder("Audi")
                .setModel("A4")
                .setFuel("Petrol")
                .setEngine("2.0")
                .setPower("256CP")
                .setYear("2017")
                .setType("Break")
                .setRegnumber("B968GNZ")
                .build();

        c1.printb();
        c2.printm();
    }


}
