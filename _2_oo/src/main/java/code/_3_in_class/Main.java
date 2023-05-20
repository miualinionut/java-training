package code._3_in_class;


public class Main {
    public static void main(String[] args) {
        BoxingFighter student1 = new BoxingFighter("Luci", 100, 15, 25);
        BoxingFighter student2 = new BoxingFighter("Roland", 120, 12, 20);

        while (student1.getHealth() > 0 && student2.getHealth() > 0) {
            student1.attack(student2);
            if (student2.getHealth() <= 0) {
                break;
            }
            student2.defend();

            student2.attack(student1);
            if (student1.getHealth() <= 0) {
                break;
            }
            student1.defend();
        }

        if (student1.getHealth() > 0) {
            System.out.println(student1.getName() + " wins!");
        } else {
            System.out.println(student2.getName() + " wins!");
        }
    }
}
