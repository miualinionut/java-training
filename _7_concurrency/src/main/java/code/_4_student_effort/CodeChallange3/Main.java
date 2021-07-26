package code._4_student_effort.CodeChallange3;

public class Main {
    public static void main(String[] args) throws InterruptedException{
        Player p1 = new Player();
        Player p2 = new Player();

        //start
        p1.start();
        p2.start();

        //wait for then to finish
        p1.join();
        p2.join();

        System.out.print(p1.getChoice() + " vs " + p2.getChoice() + " -> ");
        if(p1.getChoice().equals(p2.getChoice())){
            System.out.print("Draw");
        } else if(p1.getChoice().equals("Rock") && p2.getChoice().equals("Paper") ||
                  p1.getChoice().equals("Paper") && p2.getChoice().equals("Scissors") ||
                  p1.getChoice().equals("Scissors") && p2.getChoice().equals("Rock")){
            System.out.print("Player2 wins");
        } else{
            System.out.print("Player1 wins");
        }
    }
}
