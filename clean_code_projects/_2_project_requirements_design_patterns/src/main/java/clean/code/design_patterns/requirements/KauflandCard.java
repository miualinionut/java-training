package clean.code.design_patterns.requirements;

// 4 members of a family go shopping to Kaufland
// they have 4 different Kaufland Cards, so they would accumulate points unefficiently
// Singleton design pattern prevents them from opening more than one, so they would all accumulate points on that one

public class KauflandCard {
    private static KauflandCard instance = null;
    private static int points = 0;

    private static String full_name;
    private static String creation_time;

    private KauflandCard() {}

    public static KauflandCard getCard(String full_name, String creation_time) {
        if (instance == null) {
            instance = new KauflandCard();
            KauflandCard.full_name = full_name;
            KauflandCard.creation_time = creation_time;
        }
        return instance;
    }

    public static void addPoints(int points) {
        KauflandCard.points += points;
        System.out.println(points + " points have been added on your card.");
    }

    public static void usePoints(int points) {
        KauflandCard.points -= points;
        System.out.println(points + " have been taken from your card.");
    }

    public static void pointsLeft() {
        System.out.println("There are " + points + " points left on your card.");
    }

    public static void description () {
        System.out.println("This card belongs to: " + KauflandCard.full_name);
        System.out.println("The date when this card was created is: " + KauflandCard.creation_time);
        KauflandCard.pointsLeft();
    }
}
