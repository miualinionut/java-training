package clean.code.design_patterns.requirements.loop;

public class Main {

    public static void main(String[] args) {
        System.out.println("simple cli app that helps keeping track of your tasks. available commands:");
        System.out.println("exit  - exits the application");
        System.out.println("add   - adds a new task to your task list");
        System.out.println("print - prints the task list");

        // Singleton Lazy Implementation
        ApplicationLoop.getInstance();
    }
}
