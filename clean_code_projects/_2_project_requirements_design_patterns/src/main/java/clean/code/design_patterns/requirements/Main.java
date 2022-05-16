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
    }
 }