package clean.code.design_patterns.requirements.Builder.src.PIZZA.Builder_Pizza;

import java.io.*;
import java.util.Objects;
import java.util.Scanner;

public class MENIUALEGERI {
    private static float pret = 12;

    private static String GetOptiune() {
        String optiune;
        Scanner scan = new Scanner(System.in);
        optiune = scan.next();
        return optiune;}

    public static void meniu(){
        System.out.println("Bun venit pe aplicatia de la pizzeria Builder Man! ");
        System.out.println(" ");
        Pizza.Builder pizza = new Pizza.Builder();
        System.out.println("Va rugam alegeti-va ingredientele pentru pizza! ");
        System.out.println(" ");
        System.out.println("Blatul este obligatoriu, se adauga automat.Cost: 10 lei.");
        pizza.ingredient1("blat ");
        System.out.println(" ");
        System.out.println("Sosul este obligatoriu, se adauga automat;Cost: 2 lei; Alegeti un sos din cele de mai jos:");
        String optiune;

        while (true){
            System.out.println("Tastati :");
            System.out.println("1. Pentru sos de usturoi");
            System.out.println("2. Pentru sos de rosii");
            System.out.println("3. Pentru sos picant");

            optiune = GetOptiune();

            if(Objects.equals(optiune, "1")){
                pizza.ingredient2("Sos de usturoi ");
                break;
            }
            else if(Objects.equals(optiune, "2")){

                pizza.ingredient2("Sos de rosii ");
                break;}

            else if(Objects.equals(optiune, "3")){
                pizza.ingredient2("Sos picant ");
                break;}

            else System.out.println("Alegere gresita, va rugam reincercati!");
        }

        System.out.println("Daca doriti sunca, tastati 1. Daca nu doriti, tastati orice altceva. Cost: 5 lei");
        System.out.println("Pretul pana acum este de " + pret);
        optiune = GetOptiune();
        if(Objects.equals(optiune, "1")){
            pizza.ingredient3("sunca ");
            pret = pret + 5;}

        System.out.println("Daca doriti salam, tastati 1. Daca nu doriti, tastati orice altceva. Cost: 3 lei ");
        System.out.println("Pretul pana acum este de " + pret);
        optiune = GetOptiune();
        if(Objects.equals(optiune, "1")){
            pizza.ingredient4("salam ");
            pret = pret + 5;}

        System.out.println("Daca doriti bacon, tastati 1. Daca nu doriti, tastati orice altceva. Cost: 7 lei");
        System.out.println("Pretul pana acum este de " + pret);
        optiune = GetOptiune();
        if(Objects.equals(optiune, "1")){
            pizza.ingredient5("bacon ");
            pret += 7;}

        System.out.println("Daca doriti carne de pui, tastati 1. Daca nu doriti, tastati orice altceva. Cost: 5 lei ");
        System.out.println("Pretul pana acum este de " + pret);
        optiune = GetOptiune();
        if(Objects.equals(optiune, "1")){
            pizza.ingredient6("carne de pui ");
            pret += 5;}

        System.out.println("Daca doriti carnati, tastati 1. Daca nu doriti, tastati orice altceva. Cost: 5 lei ");
        System.out.println("Pretul pana acum este de " + pret);
        optiune = GetOptiune();
        if(Objects.equals(optiune, "1")){
            pizza.ingredient7("carnati ");
            pret += 5;}

        System.out.println("Daca doriti creveti, tastati 1. Daca nu doriti, tastati orice altceva. Cost: 15 lei ");
        System.out.println("Pretul pana acum este de " + pret);
        optiune = GetOptiune();
        if(Objects.equals(optiune, "1")){
            pizza.ingredient8("creveti ");
            pret += 15;}

        System.out.println("Daca doriti ton, tastati 1. Daca nu doriti, tastati orice altceva. Cost: 5 lei ");
        System.out.println("Pretul pana acum este de " + pret);
        optiune = GetOptiune();
        if(Objects.equals(optiune, "1")){
            pizza.ingredient9("ton ");
            pret += 5;}

        System.out.println("Daca doriti cascaval, tastati 1. Daca nu doriti, tastati orice altceva. Cost: 5 lei");
        System.out.println("Pretul pana acum este de " + pret);
        optiune = GetOptiune();
        if(Objects.equals(optiune, "1")){
            pizza.ingredient10("cascaval ");
            pret += 5; }

        System.out.println("Daca doriti mozzarela, tastati 1. Daca nu doriti, tastati orice altceva. Cost: 5 lei ");
        System.out.println("Pretul pana acum este de " + pret);
        optiune = GetOptiune();
        if(Objects.equals(optiune, "1")){
            pizza.ingredient11("mozzarela ");
            pret += 5; }

        System.out.println("Daca doriti branza, tastati 1. Daca nu doriti, tastati orice altceva. Cost: 5 lei ");
        System.out.println("Pretul pana acum este de " + pret);
        optiune = GetOptiune();
        if(Objects.equals(optiune, "1")){
            pizza.ingredient12("branza ");
            pret += 5; }

        System.out.println("Daca doriti parmezan, tastati 1. Daca nu doriti, tastati orice altceva. Cost: 3 lei ");
        System.out.println("Pretul pana acum este de " + pret);
        optiune = GetOptiune();
        if(Objects.equals(optiune, "1")){
            pizza.ingredient13("parmezan ");
            pret += 3;}

        System.out.println("Daca doriti ciuperci, tastati 1. Daca nu doriti, tastati orice altceva. Cost: 3 lei ");
        System.out.println("Pretul pana acum este de " + pret);
        optiune = GetOptiune();
        if(Objects.equals(optiune, "1")){
            pizza.ingredient14("ciuperci ");
            pret += 3;}

        System.out.println("Daca doriti porumb, tastati 1. Daca nu doriti, tastati orice altceva. Cost: 3 lei ");
        System.out.println("Pretul pana acum este de " + pret);
        optiune = GetOptiune();
        if(Objects.equals(optiune, "1")){
            pizza.ingredient15("porumb ");
            pret += 3;}

        System.out.println("Daca doriti ardei, tastati 1. Daca nu doriti, tastati orice altceva. Cost: 3 lei ");
        System.out.println("Pretul pana acum este de " + pret);
        optiune = GetOptiune();
        if(Objects.equals(optiune, "1")){
            pizza.ingredient16("ardei ");
            pret += 3;}

        System.out.println("Daca doriti masline, tastati 1. Daca nu doriti, tastati orice altceva. Cost: 3 lei ");
        System.out.println("Pretul pana acum este de " + pret);
        optiune = GetOptiune();
        if(Objects.equals(optiune, "1")){
            pizza.ingredient17("masline ");
            pret += 3;}

        System.out.println("Daca doriti ceapa, tastati 1. Daca nu doriti, tastati orice altceva. Cost: 3 lei ");
        System.out.println("Pretul pana acum este de " + pret);
        optiune = GetOptiune();
        if(Objects.equals(optiune, "1")){
            pizza.ingredient18("ceapa ");
            pret += 3;}

        System.out.println("Daca doriti usturoi, tastati 1. Daca nu doriti, tastati orice altceva. Cost: 4.5 lei ");
        System.out.println("Pretul pana acum este de " + pret);
        optiune = GetOptiune();
        if(Objects.equals(optiune, "1")){
            pizza.ingredient19("usturoi ");
            pret += 4.5;}


        System.out.println("Daca doriti oregano, tastati 1. Daca nu doriti, tastati orice altceva. Cost: 3 lei ");
        System.out.println("Pretul pana acum este de " + pret);
        optiune = GetOptiune();
        if(Objects.equals(optiune, "1")){
            pizza.ingredient20("oregano ");
            pret += 5;}

        System.out.println("Daca doriti busuioc, tastati 1. Daca nu doriti, tastati orice altceva. Cost: 2.5 lei ");
        System.out.println("Pretul pana acum este de " + pret);
        optiune = GetOptiune();
        if(Objects.equals(optiune, "1")){
            pizza.ingredient21("busuioc ");
            pret += 2.5;}

        pizza.pret_final(pret);

        Pizza realPizza = pizza.build();
        String formatter = realPizza.getFormatter();
        System.out.println("Pizza creata este: " + pizza);

        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter("Pizza.txt"));
            writer.write(formatter);
            writer.close();


        } catch (IOException e) {
            e.printStackTrace();
        }
    }}