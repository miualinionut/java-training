package ProiectCatalog;

public class Main {

    public static void main(String[] args) {
            Bootstrapper bootstrapper = new Bootstrapper();
            CatalogApplication catalogApplication = bootstrapper.buildApplication();
            catalogApplication.run();
    }
}
