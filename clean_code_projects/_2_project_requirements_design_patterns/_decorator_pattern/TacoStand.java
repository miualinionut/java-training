package code._4_student_effort._decorator_pattern;

public class TacoStand {
    public static void main(String[] args) {
        Taco taco = new Chicken();
        System.out.println(taco.getDescription() + " $" + taco.cost());

        Taco taco2 = new Pork();
        taco2 = new Cilantro(taco2); // decorating!
        taco2 = new Onion(taco2);   // decorating!
        taco2 = new Avocado(taco2); // decorating!
        System.out.println(taco2.getDescription() + " $" + taco2.cost());

        Taco taco3 = new Veggie();
        taco3 = new Onion(taco3);   // decorating!
        taco3 = new Potato(taco3);  // decorating!
        taco3 = new Avocado(taco3); // decorating!
        taco3 = new Avocado(taco3); // decorating with extra avocado!
        System.out.println(taco3.getDescription() + " $" + taco3.cost());
    }

}
