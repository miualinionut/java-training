package clean.code.design_patterns;

public class Client {
    private static String[] args;

    public static void main(String[] args) {
        Client.args = args;
        LaptopFactory laptopFactory = new LaptopFactory();

        // Get object of type GamingLaptop and run tests.
        Laptop myLaptop = laptopFactory.createLaptop("GamingLaptop");

        myLaptop.runTests();
    }
}
