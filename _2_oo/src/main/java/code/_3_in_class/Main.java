package code._3_in_class;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int animalAlesDeUtilizator = in.nextInt();
        AnimaleZburatoare animal = null;
        if (animalAlesDeUtilizator == 1) {
            animal = new Soim();
        } else if (animalAlesDeUtilizator == 2) {
            animal = new Gasca();
        }
        animal.zboara();
    }
}