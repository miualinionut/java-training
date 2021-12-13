package clean.code.design_patterns.requirements;
import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        CharacterBuilder cb = new CharacterBuilder("Steve");
        Character character = cb
                .setHead(3,2)
                .setArm(2 ,4)
                .setBody(4, 4)
                .setLeg(2, 3)
                .createCharacter();

        int mazeDim = 15;
        int startingRow = 13;
        int startingCol = 2;
        int [][] maze = {
                {1, 1, 1, 1, 1, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1},
                {1, 1, 1, 1, 1, 1, 1, 0, 1, 1, 0, 1, 1, 1, 1},
                {1, 1, 1, 1, 1, 1, 1, 0, 1, 0, 0, 0, 1, 1, 1},
                {1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1},
                {1, 1, 1, 0, 1, 0, 1, 0, 1, 1, 1, 0, 0, 0, 1},
                {1, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 1, 0, 0, 1},
                {1, 0, 0, 0, 0, 0, 1, 1, 0, 1, 0, 1, 0, 0, 1},
                {1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 0, 1},
                {1, 0, 0, 0, 0, 1, 0, 1, 1, 0, 1, 0, 1, 0, 1},
                {1, 1, 1, 1, 1, 1, 1, 1, 1, 0, 0, 1, 1, 1, 1},
                {1, 1, 1, 1, 1, 0, 1, 1, 1, 1, 0, 0, 0, 1, 1},
                {1, 1, 1, 0, 1, 1, 1, 1, 1, 0, 1, 0, 1, 1, 1},
                {1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1},
                {1, 1, 0, 1, 0, 1, 1, 1, 0, 1, 0, 1, 1, 0, 1},
                {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1}
        };

        maze[startingRow][startingCol] = 7;

        Maze m = new Maze(maze, mazeDim);

        int hintDir = 0;
        String hint = "";
        String commands;
        Scanner listener = new Scanner(System.in);

        int row = startingRow, col = startingCol;
        MazeSolver ms = new MazeSolver(m, row, col);
        while (true) {
            clc();
            if (row > 0 && row < mazeDim - 1 && col > 0 && col < mazeDim - 1) {
                System.out.println("[w, a, s, d - movement]");
                System.out.println("[q - exit]");
                System.out.println("[h - hint]");
                System.out.println(hint);
                hint = "";
                m.show();
                System.out.println();
                commands = listener.nextLine();
                switch (commands) {
                    case "w":
                        if (maze[row - 1][col] != 1) {
                            maze[row][col] = 0;
                            row--;
                            maze[row][col] = 7;
                            hintDir = 0;
                        }
                        break;

                    case "a":
                        if (maze[row][col - 1] != 1) {
                            maze[row][col] = 0;
                            col--;
                            maze[row][col] = 7;
                            hintDir = 1;
                        }
                        break;

                    case "s":
                        if (maze[row + 1][col] != 1) {
                            maze[row][col] = 0;
                            row++;
                            maze[row][col] = 7;
                            hintDir = 2;
                        }
                        break;

                    case "d":
                        if (maze[row][col + 1] != 1) {
                            maze[row][col] = 0;
                            col++;
                            maze[row][col] = 7;
                            hintDir = 3;
                        }
                        break;

                    case "h":
                        ms.reset(row, col, hintDir);
                         do {
                            ms.nextState();
                        } while (ms.getFoundPath() != 1);
                        if (ms.getDir() < 3) {
                            hintDir = ms.getDir() + 1;
                        } else hintDir = 0;
                        switch (hintDir) {
                            case 0:
                                hint = "{ --> }";
                                break;
                            case 1:
                                hint = "{ /\\ }";
                                break;
                            case 2:
                                hint = "{ <-- }";
                                break;
                            case 3:
                                hint = "{ \\/ }";
                                break;
                        }
                        break;
                }
            } else {
                System.out.println("Congrats! You found the exit!\n\n");
                m.show();
                System.out.println();
                commands = listener.nextLine();
            }
            if (commands.equals("q")) break;
        }

    }

    public static void clc() {
        for (int i = 0; i < 20; i++) {
            System.out.println();
        }
    }
}
