package clean.code.design_patterns.requirements;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {


    //TODO implement your design patterns in this package
    public static void main(String args[]) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Introduceti numele bancii de unde doriti imprumutul (ING, BRD sau BCR):  ");
        String bankName = br.readLine();

        System.out.print("\n");
        System.out.print("Introduceti tipul de imprumut de care vreti sa dispuneti (ex: home, business sau education): ");

        String loanName = br.readLine();
        AbstractFactory bankFactory = FactoryCreator.getFactory("Bank");
        Bank b = bankFactory.getBank(bankName);

        System.out.print("\n");
        System.out.print("Intoduceti rata dobanzii pentru " + b.getBankName() + ": ");

        double rate = Double.parseDouble(br.readLine());
        System.out.print("\n");
        System.out.print("Introduceti suma pe care doriti sa o imprumutati: ");

        double loanAmount = Double.parseDouble(br.readLine());
        System.out.print("\n");
        System.out.print("Introduceti numarul de ani prin care achitati imprumutul: ");
        int years = Integer.parseInt(br.readLine());

        System.out.print("\n");
        System.out.println("Ati luat imprumutul de la banca : " + b.getBankName());

        AbstractFactory loanFactory = FactoryCreator.getFactory("Loan");
        Loan l = loanFactory.getLoan(loanName);
        l.getInterestRate(rate);
        l.calculateLoanPayment(loanAmount, years);
    }

}
