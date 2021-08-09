package clean.code.design_patterns.requirements.prototype;

public class Main {
    public static void main(String[] args) {

        GameBoard board1 = new GameBoard();
        System.out.println("----------BOARD 1----------");
        board1.print();
        System.out.println();


        GameBoard board2 = (GameBoard) board1.clone();
        System.out.println("----------BOARD 2----------");
        board2.print();

    }
}
