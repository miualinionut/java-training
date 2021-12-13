package clean.code.design_patterns.requirements;

public class Main {

    public static void main(String[] args) {
        // Character creation
        CharacterBuilder cb = new CharacterBuilder("Johnny");
        Character character = cb
                .setHead(3,2)
                .setArm(2 ,4)
                .setBody(4, 4)
                .setLeg(2, 3)
                .createCharacter();

//        character = cb
//                .setHead(6,4)
//                .setArm(4 ,8)
//                .setBody(8, 8)
//                .setLeg(4, 6)
//                .createCharacter();

//        character = cb
//                .setHead(8,10)
//                .setArm(3 ,7)
//                .setBody(4, 8)
//                .setLeg(4, 6)
//                .createCharacter();

        character.show();

        // Maze solving
        int[][] a = {
                {1, 1, 1, 1, 1, 1},
                {1, 0, 1, 1, 0, 1},
                {1, 0, 1, 1, 0, 1},
                {1, 0, 1, 1, 0, 1},
                {1, 0, 0, 0, 0, 1},
                {1, 1, 1, 1, 0, 1}
        };

        int[][] b = {
                {1, 1, 1, 1, 1, 1},
                {1, 0, 1, 1, 0, 1},
                {1, 0, 1, 1, 0, 1},
                {1, 0, 1, 1, 0, 1},
                {1, 0, 0, 0, 0, 1},
                {1, 1, 1, 1, 0, 1}
        };

        int maze_dim = 6;
        int row = 0, col = 0, rowc = 0, colc = 0, dir = 0, done = 0, state, next_state = 0;

        // Without using state dp
        while (done != 1) {
            state = next_state;

            switch (state) {
                case 0: {                       //InitState
                    row = 1;
                    col = 1;
                    rowc = row;
                    colc = col;
                    dir = 0;
                    a[row][col] = 2;

                    next_state = 1;
                } break;

                case 1: {                       //CheckDirectionState
                    switch (dir) {
                        case 0: {
                            col = col + 1;
                        } break;
                        case 1: {
                            row = row - 1;
                        } break;
                        case 2: {
                            col = col - 1;
                        } break;
                        case 3: {
                            row = row + 1;
                        } break;
                    }

                    next_state = 2;
                } break;

                case 2: {                       //CheckPathState
                    if (a[row][col] == 1) {
                        row = rowc;
                        col = colc;
                        if (dir < 3) dir = dir + 1;
                        else dir = 0;

                        next_state = 1;
                    } else {
                        a[row][col] = 2;
                        rowc = row;
                        colc = col;
                        if (dir > 0) dir = dir - 1;
                        else dir = 3;

                        next_state = 1;

                        if (row == 0 || row == maze_dim - 1 || col == 0 || col == maze_dim - 1) {
                            next_state = 3;
                        }
                    }
                } break;

                case 3: {                       //ExitState
                    done = 1;
                    System.out.println("Old style:");
                    for (int i = 0; i < maze_dim; i++) {
                        for (int j = 0; j < maze_dim; j++) {
                            System.out.print(a[i][j] + " ");
                        }
                        System.out.println();
                    }
                } break;
            }
        }

        System.out.println();

        // After using state dp
        Maze m = new Maze(b, maze_dim);
        MazeSolver ms = new MazeSolver(m, 1, 1);
        done = 0;
        while (done != 1) {
            done = ms.getStatus();
            ms.nextState();
        }
        Maze solution = new Maze(ms.getSolution(), ms.getMazeDim());
        System.out.println("After using state design pattern:");
        solution.show();


        // More complex example using state dp
        int [][] c = {
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

        m = new Maze(c, 15);
        ms = new MazeSolver(m, 13, 2);
        done = 0;
        while (done != 1) {
            done = ms.getStatus();
            ms.nextState();
        }
        solution = new Maze(ms.getSolution(), ms.getMazeDim());
        System.out.println("Complex maze:");
        solution.show();

    }
}
