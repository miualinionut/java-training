package code._4_student_effort.Challenge3;

public class Test {

    public static int getTheWinner(Player p1, Player p2){
        if(p1.getAttack().compareTo("paper") == 0 && p2.getAttack().compareTo("rock")==0)
        {
            System.out.println("Castigatorul este: " + p1.getNume());
            return 1;
        }
        if(p1.getAttack().compareTo("scissors") == 0 && p2.getAttack().compareTo("rock")==0)
        {
            System.out.println("Castigatorul este: " + p2.getNume());
            return 1;
        }
        if(p1.getAttack().compareTo("scissors") == 0 && p2.getAttack().compareTo("paper")==0)
        {
            System.out.println("Castigatorul este: " + p1.getNume());
            return 1;
        }
        if(p1.getAttack().compareTo(p2.getAttack()) == 0){
            System.out.println("Egalitate!");
            return 1;
        }
        return 0;
    }

    public static void main(String[] args) {
        Player p1 = new Player("Player 1");
        Player p2 = new Player("Player 2");

        p1.start();
        p2.start();

        try {
            p1.join();
            p2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("s-a terminat jocul");
        int success = getTheWinner(p1,p2);
        if(success == 0) getTheWinner(p2,p1);

    }

}
