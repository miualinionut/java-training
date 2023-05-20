package code._4_student_effort.Maze;

public class Main {

   public static void main(String[] args) {
        // Get the maze instance
        Maze maze = Maze.getInstance();
        // Navigate through the maze
        maze.navigate();
        // Create the obstacle factory
        ObstacleFactory obstacleFactory = new ObstacleFactory();
        // Create and avoid the first obstacle
        Obstacle pit = obstacleFactory.createObstacle("PIT");
        pit.avoid();
        // Create and avoid the second obstacle
        Obstacle wall = obstacleFactory.createObstacle("WALL");
        wall.avoid();
    }
}

