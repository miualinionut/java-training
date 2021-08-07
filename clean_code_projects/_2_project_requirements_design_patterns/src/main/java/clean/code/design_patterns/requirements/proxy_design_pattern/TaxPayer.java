package clean.code.design_patterns.requirements.proxy_design_pattern;

public class TaxPayer {
    private  String name;
    private  int money;

    public TaxPayer(String name, int money) {
        this.name = name;
        this.money = money;
    }

    public String getName() {
        return name;
    }

    public int getMoney() {
        return money;
    }

    public void addMoney(int sum){
        money = money+sum;
    }


}
