package code._4_student_effort.Maze;

public class ObstacleFactory {
    public Obstacle createObstacle(String obstacleType) {
        if (obstacleType == null) {
            return null;
        }
        if (obstacleType.equalsIgnoreCase("PIT")) {
            return new Pit();
        } else if (obstacleType.equalsIgnoreCase("WALL")) {
            return new Wall();
        }
        return null;
    }
}
