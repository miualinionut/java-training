package clean.code.design_patterns.requirements;

public class Customer {
    private final String fullName;
    private final int age;
    private final int cnp;
    private final int rentDays;

    public Customer(String fullName,int age,int cnp,int rentDays){
        this.fullName=fullName;
        this.age=age;
        this.cnp=cnp;
        this.rentDays=rentDays;
    }

    public String getFullName() {
        return fullName;
    }

    public int getAge() {
        return age;
    }

    public int getCnp() {
        return cnp;
    }

    public int getRentDays() {
        return rentDays;
    }

    @Override
    public String toString(){
        return "Customer details: "+ "name='" +
fullName+"', age=" +age+", cnp=" +cnp+", rentDays="+rentDays;
    }
}
