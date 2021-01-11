package clean.code.design_patterns.requirements;

public class Client {
    private int id;
    private double money;

    public Client(int id, double money) {
        this.id = id;
        this.money = money;
        System.out.println("The client " + id + " has entered the pub");
    }

    public int getId() {
        return id;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    public void buyDrink(double price) {
        this.money -= price;
    }
}
