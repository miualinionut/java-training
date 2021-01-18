package clean.code.design_patterns.requirements.CombinedDesignPatterns;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class orderBuilder {
    public itemOrders PizzaAndDrink() throws IOException {

        itemOrders itemsOrder = new itemOrders();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println(" Enter the choice of Pizza ");
        System.out.println("============================");
        System.out.println("        1. Veggie Pizza       ");
        System.out.println("        2. Salami Pizza   ");
        System.out.println("        3. Exit            ");
        System.out.println("============================");

        int pizzaandcolddrinkchoice = Integer.parseInt(br.readLine());
        switch (pizzaandcolddrinkchoice) {
            case 1: {
                System.out.println("You ordered Veggie Pizza");
                System.out.println("Enter the Veggie pizza size");
                System.out.println("1.Small = 300g | 2.Medium = 500g | 3.Large = 800g");
                System.out.println("------------------------------------");
                System.out.println("    1. Small Veggie Pizza ");
                System.out.println("    2. Medium Veggie Pizza ");
                System.out.println("    3. Large Veggie Pizza ");
                System.out.println("------------------------------------");
                int cheezepizzasize = Integer.parseInt(br.readLine());
                switch (cheezepizzasize) {
                    case 1:
                        itemsOrder.addItems(new ItemFactory().PizzaType("PizzaVeggieSmall"));
                        break;
                    case 2:
                        itemsOrder.addItems(new ItemFactory().PizzaType("PizzaVeggieMedium"));
                        break;
                    case 3:
                        itemsOrder.addItems(new ItemFactory().PizzaType("PizzaVeggieLarge"));
                        break;

                }
            }
            break;

            case 2: {
                System.out.println("You ordered Salami Pizza - Non veggie pizza");
                System.out.println("\n");
                System.out.println("Enter Salami Pizza size");
                System.out.println("1.Small = 400g | 2.Medium = 600g - 700g | 3.Large = 900g - 1000g");
                System.out.println("------------------------------------");
                System.out.println("    1. Small Salami Pizza ");
                System.out.println("    2. Medium Salami  Pizza ");
                System.out.println("    3. Large Salami  Pizza ");
                System.out.println("------------------------------------");


                int nonvegpizzasize = Integer.parseInt(br.readLine());

                switch (nonvegpizzasize) {

                    case 1:
                        itemsOrder.addItems(new ItemFactory().PizzaType("PizzaSalamiSmall"));
                        break;

                    case 2:
                        itemsOrder.addItems(new ItemFactory().PizzaType("PizzaSalamiMedium"));
                        break;

                    case 3:
                        itemsOrder.addItems(new ItemFactory().PizzaType("PizzaSalamiLarge"));
                        break;
                }

            }
            break;
            default: {
                break;

            }

        }

        System.out.println(" Enter the choice of ColdDrink ");
        System.out.println("============================");
        System.out.println("        1. Pepsi            ");
        System.out.println("        2. Coke             ");
        System.out.println("        3. Exit             ");
        System.out.println("============================");
        int coldDrink = Integer.parseInt(br.readLine());
        switch (coldDrink) {
            case 1: {
                System.out.println("You ordered Pepsi ");
                System.out.println("Enter the  Pepsi Size ");
                System.out.println("------------------------");
                System.out.println("    1. Small Pepsi ");
                System.out.println("    2. Large Pepsi ");
                System.out.println("------------------------");
                int pepsisize = Integer.parseInt(br.readLine());
                switch (pepsisize) {
                    case 1:
                        itemsOrder.addItemsForDrink(new ItemFactoryDrink().DrinkType("SmallPepsi"));
                        break;

                    case 2:
                        itemsOrder.addItemsForDrink(new ItemFactoryDrink().DrinkType("LargePepsi"));
                        break;
                }
            }
            break;
            case 2: {
                System.out.println("You ordered Coke");
                System.out.println("Enter the Coke Size");
                System.out.println("------------------------");
                System.out.println("    1. Small Coke ");
                System.out.println("    2. Large Coke  ");
                System.out.println("------------------------");

                int cokesize = Integer.parseInt(br.readLine());
                switch (cokesize) {
                    case 1:
                        itemsOrder.addItemsForDrink(new ItemFactoryDrink().DrinkType("SmallCoke"));
                        break;

                    case 2:
                        itemsOrder.addItemsForDrink(new ItemFactoryDrink().DrinkType("LargeCoke"));
                        break;

                }

            }
            break;
            default: {
                break;

            }

        }
        return itemsOrder;
    }

}