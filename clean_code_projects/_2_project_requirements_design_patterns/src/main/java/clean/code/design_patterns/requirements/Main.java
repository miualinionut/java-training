package clean.code.design_patterns.requirements;

class Main {
    public static void main(String[] args) {
        Printer printerSamsung;
        printerSamsung = Printer.createInstanceOfPrinter(); // singura instanta a printerului
       
        printerSamsung.print();
        
        Printer printerHP;
        printerHP = Printer.createInstanceOfPrinter(); //folosim aceeasi instanta creata anterior, 
                                                        //functionalitatea de printare este ocupata cat timp folosim unul din printere

        printerHP.print();

        Car Car1 = new Car.CarBuilder("Mercedes-Benz", "E-class").yearOfFabrication(2005).fuelType("Petrol").bodyType("Sedan").build();
        System.out.println(Car1);

        Car Car2 = new Car.CarBuilder("Subaru", "Outback").yearOfFabrication(2022).fuelType("Petrol").build();
        System.out.println(Car2);

        Car Car3 = new Car.CarBuilder("Dacia", "Duster").build();
        System.out.println(Car3);
    }
 }

 