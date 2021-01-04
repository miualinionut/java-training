package code._4_student_effort._6_matrix_spiral;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        matrixSpiral();
    }
    enum Direction{ RIGHT, DOWN, LEFT, UP }

    public static void matrixSpiral(){
        List<List<Integer>> squareMatrix = List.of( List.of(1,  5, 6, 10, 3, 8),
                                                    List.of(5,  10, 1, 3, 2, 6),
                                                    List.of(10, 5, 1, 9, 10, 3),
                                                    List.of(1, 10, 10, 3, 5, 7),
                                                    List.of(10,  4, 8, 6, 5, 2),
                                                    List.of(9,  7, 7, 8, 2, 3));
       // List<List<Integer>> squareMatrix = List.of(List.of(1, 2, 3, 4), List.of(12, 13, 14, 5), List.of(11, 16, 15, 6), List.of(10, 9, 8, 7));
        int size = squareMatrix.size();
        int right = 0;
        int down = 0;
        int left = 0;
        int up = 0;
        Direction currentDirection = Direction.RIGHT;

        for(int i = 0; i < size * 2 - 1; i++){
            switch (currentDirection){
                case RIGHT:
                    for(int j = right; j < size - down; j++){
                        System.out.print(squareMatrix.get(right).get(j) + ", ");
                    }
                    currentDirection = Direction.DOWN;
                    right++;
                    break;
                case DOWN:
                    for(int j = down + 1; j < size - left; j++){
                        System.out.print(squareMatrix.get(j).get(size - down - 1) + ", " );
                    }
                    currentDirection = Direction.LEFT;
                    down++;
                    break;
                case LEFT:
                    for(int j = size - down - 1; j >= left; j--){
                        System.out.print(squareMatrix.get(size - left - 1).get(j) + ", ");
                    }
                    currentDirection = Direction.UP;
                    left++;
                    break;
                case UP:
                    for(int j = size - left - 1; j > up; j--){
                        System.out.print(squareMatrix.get(j).get(up) + ", ");
                    }
                    currentDirection = Direction.RIGHT;
                    up++;
                    break;
            }
        }
    }
}
