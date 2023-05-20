package code._4_student_effort.Maze;

import code._4_student_effort.Maze.Obstacle;

public class Pit implements Obstacle {
    @Override
    public void avoid() {
        System.out.println("Jumping over the pit!");
    }
}
