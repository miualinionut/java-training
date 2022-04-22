package clean.code.design_patterns.requirements;

public class ATM {
    private int atmMoney = 0;
    static Bill[] atmStorageMoney = {new Bill(5), new Bill(15),new Bill(20), new Bill(25), new Bill(100), new Bill(500)};

    public ATM (){
        for (Bill bill : atmStorageMoney) {
            atmMoney += 10 * bill.value;
        }
    }
    public int withdraw(int amount){
        if (atmStorageMoney.length > 0){
            atmMoney =atmMoney - amount;
            System.out.println("You have withdrawn " + amount + Bill.currency + " from the ATM");
        }else {
            System.out.println("ATM doesn't have enough money");
        }
        return atmMoney;
    }
    public int deposit (double amount){
        atmMoney += amount;
        System.out.println("You have added " + amount + Bill.currency + " to the ATM machine");
        return atmMoney;
    }
    public int getAtmMoney(){
        return atmMoney;
    }

}
