package clean.code.design_patterns.requirements;

class Printer {
    private static Printer printer;
 
    private Printer() {      
    }
 
    public static Printer createInstanceOfPrinter() {
 
       if(printer == null) {
          printer = new Printer(); // creez obiectul
       }
 
        return printer; // returnez obiectul
    }
 
    public void print() {
        System.out.println("Connection to the printer established. File is printing.");
        System.out.println("Wait...");
        try {
        for(int i = 0; i <= 10; i++){
            System.out.println(i*10 + "% completed...");
            Thread.sleep(1000);
        }
        }catch(InterruptedException e) {
        }
        System.out.println("Done");

    }
 }
 
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