package code._4_student_effort;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {

 /*   public static void main(String[] args) {
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
*/
 public static void main(String[] args) {
     OrderFactory factory = new OrderFactory();
     OrderNotifier notifier = new OrderNotifier();
     KitchenStaff staff = new KitchenStaff();
   //  notifier.addObserver(staff);

     Order foodOrder = factory.createOrder("food");
     Order drinkOrder = factory.createOrder("drink");
     Order dessertOrder = factory.createOrder("dessert");

     notifier.addOrder(foodOrder);
     notifier.addOrder(drinkOrder);
     notifier.addOrder(dessertOrder);
 }

}