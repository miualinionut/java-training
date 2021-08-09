package ProiectCatalog;


import Business.UseCases.IUseCase;

import java.util.List;
import java.util.Scanner;

public class CatalogApplication {

    private List<IUseCase> useCases;

    public CatalogApplication(List<IUseCase> useCases) {
        this.useCases = useCases;
    }

    void printUseCases() {
        for (IUseCase useCase :
                useCases) {
            System.out.println(useCase.getName() + " " + useCase.getDescription());
        }
    }

    void run() {
            Scanner scanner = new Scanner(System.in);
            while (true) {
                printUseCases();
                System.out.println("Please select use case");
                String input = scanner.nextLine();
                IUseCase useCase = chooseUseCase(input);
                if (useCase != null)
                    useCase.execute();
            }
    }

    private IUseCase chooseUseCase(String input) {
        for (IUseCase useCase :
                useCases) {
            if (useCase.getName().contains(input)) {
                return useCase;
            }
        }
        return null;
    }
}









