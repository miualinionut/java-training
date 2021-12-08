package clean.code.design_patterns.requirements.Builder.src.PIZZA.Template.UI;



import clean.code.design_patterns.requirements.Builder.src.PIZZA.Template.services.AbstractSite;
import clean.code.design_patterns.requirements.Builder.src.PIZZA.Template.services.SiteBasic;
import clean.code.design_patterns.requirements.Builder.src.PIZZA.Template.services.SiteCustom;

import java.util.Objects;
import java.util.Scanner;

public class Console {
    public static void Menu(){
        while (true) {
            System.out.println("Meniu Program Generare Site Info Motor Diesel ");
            System.out.println("1. Generare site basic (info: wikipedia)");
            System.out.println("2. Generare site custom");

            String optiune;
            Scanner scan = new Scanner(System.in);
            System.out.print("Ce optiune alegeti? ");
            optiune = scan.next();

            AbstractSite site = getSite(optiune);
            if (site != null) {
                site.CreateSite();
                break;
            } else {
                System.out.println("Optiune gresita!");
            }
        }
    }

    // Factory
    static AbstractSite getSite(String optiune) {
        if (Objects.equals(optiune, "1")) {
            return new SiteBasic();
        } else if (Objects.equals(optiune, "2")) {
            return new SiteCustom();
        }
        return null;
    }
}
