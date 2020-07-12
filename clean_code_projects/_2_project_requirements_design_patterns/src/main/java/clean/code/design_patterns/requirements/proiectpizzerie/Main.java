package clean.code.design_patterns.requirements.proiectpizzerie;

import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        PizzaStore pizzerie = PizzaStore.getInstanta();

        Scanner sc = new Scanner(System.in);

        System.out.println("Bine ati venit la Pizzeria PizzaMeaPreferata");
        System.out.println("Va rugam alegeti-va din lista de mai jos Pizza pe care o doriti, tastand o cifra de la 1 la 4: ");
        System.out.println("1.Pizza Quatro Formagi" + "\n"+ "2.Pizza Peperoni" + "\n" + "3.Pizza Vegetariana" + "\n" + "4.Creeaza propria pizza");
        int pizzaAleasa = sc.nextInt();

        System.out.println("Va rugam alegeti marimea pentru pizza. Marimi disponibile (Mica/Medie/Mare)");
        String marimeaAleasa = sc.next();

        while(!marimeaAleasa.toLowerCase().equals("mica") &&
                !marimeaAleasa.toLowerCase().equals("medie") &&
                !marimeaAleasa.toLowerCase().equals("mare")){
            System.out.println("Marimea aleasa de dvs nu exista!");
            marimeaAleasa = sc.next();
        }

        Pizza pizza = pizzerie.comanda(pizzaAleasa, marimeaAleasa);
        System.out.println(pizza);

    }
}
