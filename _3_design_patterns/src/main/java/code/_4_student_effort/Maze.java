package code._4_student_effort;

public class Maze {
    // Private static instance of the maze
    private static Maze instance = null;
    // Private constructor to prevent creating new instances
    private Maze() {
    }
    // Static method to get the instance of the maze
    public static Maze getInstance() {
        if (instance == null) {
            instance = new Maze();
        }
        return instance;
    }
    // Method to navigate through the maze
    public void navigate() {
        System.out.println("Navigating through the maze...");
    }
}
