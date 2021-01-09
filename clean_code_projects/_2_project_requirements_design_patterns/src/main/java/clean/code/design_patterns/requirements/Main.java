package clean.code.design_patterns.requirements;

import java.io.FileNotFoundException;

public class Main {
    public static void main(String[] args) {
        try {
            StandardCond.standardRun();
        }
        catch(FileNotFoundException fileNotFoundException){
            System.out.println("standard condition files could not be found");
            fileNotFoundException.printStackTrace();
        }
    }
}
