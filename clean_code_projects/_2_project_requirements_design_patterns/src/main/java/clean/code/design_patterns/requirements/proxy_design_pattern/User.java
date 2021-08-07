package clean.code.design_patterns.requirements.proxy_design_pattern;

public class User {
    private  String name;
    private  int money;
    private boolean isAdmin;

    public User(String name, boolean isAdmin) {
        this.name = name;
        this.isAdmin = isAdmin;
    }

    public void setMoney(int sum){
        money = sum;
    }

    public String getName() {
        return name;
    }

    public int getMoney() {
        return money;
    }

    public boolean getIsAdmin(){ return isAdmin; }

    public void addMoney(int sum){
        money = money+sum;
    }
}
