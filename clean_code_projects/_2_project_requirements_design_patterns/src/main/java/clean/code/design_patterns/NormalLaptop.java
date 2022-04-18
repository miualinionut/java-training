package clean.code.design_patterns;


public class NormalLaptop implements Laptop {

    @Override
    public void runTests() {
        System.out.println("Running tests on a NormalLaptop...");
    }
}