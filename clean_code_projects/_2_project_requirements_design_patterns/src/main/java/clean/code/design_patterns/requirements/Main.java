package clean.code.design_patterns.requirements;

import javax.sound.midi.Soundbank;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Main {
    static ATM atm1 = new ATM();
    static Receipt receipt1 = new Receipt();
    private static CreditCard checkCreditNumber(String creditCardNumber, List<CreditCard> creditCards) {
        for (CreditCard cards : creditCards) {
            if (cards.getCardNumber().equals(creditCardNumber)) {
                return cards;
            }
        }
        return null;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CreditCard card1 = new CreditCard.Builder("Credit","7685")
                .setBalance(10000)
                .setCardNumber("4321 3124 1234 5431")
                .printReceipt("YES")
                .build();
        CreditCard card2 = new CreditCard.Builder("Debit", "5342")
                .setBalance(600)
                .setCardNumber("6855 6456 3452 4235")
                .printReceipt("NO")
                .build();
        ArrayList<CreditCard> creditCardList = new ArrayList<>();
        creditCardList.add(card1);
        creditCardList.add(card2);

        while (true) {
            System.out.println("Please enter your card number: ");
            String cardNumber = scanner.nextLine();
            if (cardNumber.matches("[0-9]{4}\s[0-9]{4}\s[0-9]{4}\s[0-9]{4}")) {
                CreditCard cards = checkCreditNumber(cardNumber, creditCardList);
                if (cards == null) {
                    System.out.println("The credit card number does not exist, please try again");
                } else {
                    System.out.println("The card number is correct! Please enter your PIN: ");
                }
                int pinTries = 0;
                boolean check = false;
                while (pinTries < 3) {
                    String cardPin = scanner.nextLine();
                    if (cardPin.equals(cards.getPin())) {
                        check = true;
                        break;
                    } else {
                        System.out.println("Wrong pin, please try again");
                        pinTries++;
                    }
                }
                if (check) {
                    while (true) {
                        System.out.println("""

                                Hello! Please choose one of the following

                                0 -> Exit
                                1 -> Show Balance
                                2 -> To withdrawal
                                3 -> To deposit
                                4 -> To print a receipt
                                                                """);
                        String choice = scanner.nextLine();
                        switch (choice) {
                            case "0" -> {
                                System.out.println("Thank you!");
                                System.exit(0);
                            }
                            case "1" -> {
                                System.out.println("Your current balance is: " + cards.getBalance() + Bill.currency);
                            }
                            case "2" -> {
                                System.out.println("Please enter the amount you wish to withdraw: ");
                                try {

                                    int amount = scanner.nextInt();
                                    scanner.nextLine();
                                    if (amount % 10 != 0) {
                                        System.out.println("Please enter a valid amount");
                                    } else if (amount > cards.getBalance()) {
                                        System.out.println("Insufficient Funds");
                                    } else {
                                        if (atm1.getAtmMoney() > amount) {
                                            cards.withdrawFromCard(amount);
                                            atm1.withdraw(amount);
                                            System.out.println("Withdrawal successful!");
                                        } else {
                                            System.out.println("Insufficient funds");
                                        }
                                    }
                                }catch(InputMismatchException e){
                                    System.out.println("Please enter a valid number");
                                    scanner.nextLine();
                                }
                            }
                            case "3"->{
                                System.out.println("Please enter the amount you wish to deposit");
                                int amount = scanner.nextInt();
                                scanner.nextLine();
                                if (amount%10!=0){
                                    System.out.println("Please enter a valid amount");
                                }else{
                                    cards.depositToCard(amount);
                                    atm1.deposit(amount);
                                    System.out.println("Deposit successful");
                                }
                            }
                            case "4" ->{
                                String lastFourDigits= "";
                                if (cards.getReceipt().equals("YES")){
                                     if (cards.getCardNumber().length()>4){
                                          lastFourDigits = cards.getCardNumber().substring(cards.getCardNumber().length()-4);
                                     } else {
                                         lastFourDigits = cards.getCardNumber();
                                     }
                                    System.out.println("....................");
                                    System.out.println("   ATM TRANSACTION");
                                    System.out.println("....................");
                                    System.out.println("CARD NUMBER          "+"XXXXXXXXXXX" +lastFourDigits);
                                    Receipt.getDate();
                                    System.out.println("TYPE OF CARD            "+cards.getTypeOfCard());
                                    System.out.println("ATM MONEY REMAINING     "+atm1.getAtmMoney());
                                    System.out.println("NUMBER OF WITHDRAWS     "+atm1.getWithdrawCount());
                                    System.out.println("NUMBER OF DEPOSITS      "+atm1.getDepositCount());
                                    System.out.println("....................");

                                }else {
                                    System.out.println("You did not wish to get a receipt");
                                }
                            }
                            default -> System.out.println("Not a valid option, please try again!");

                        }
                    }
                }else {
                    System.out.println("Sorry too many tries");
                    creditCardList.remove(cards);
                }
            }else {
                System.out.println("Not a valid card, please try again!");
            }
        }
    }
}
