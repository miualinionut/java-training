package View.ViewsMaterii;

import Business.UseCases.IUseCase;
import Business.Views.IViewsMaterii.IViewMaterii;

import java.util.List;
import java.util.Scanner;

public class ViewMaterii implements IViewMaterii {

    private final List<IUseCase> useCases;
    public ViewMaterii(List<IUseCase> useCases){
        this.useCases = useCases;
    }

    @Override
    public void displayUseCases() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            printUseCases();
            System.out.println("Please select use case");
            String input = scanner.nextLine();
            if (input.contains("0")){
                break;
            }
            IUseCase useCase = chooseUseCase(input);
            if (useCase != null)
                useCase.execute();
        }
    }

    void printUseCases() {
        for (IUseCase useCase :
                useCases) {
            System.out.println(useCase.getName()+ " " + useCase.getDescription());
        }
        System.out.println("0. Back to main menu");
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
