package code._1_study._3_class_types.encapsulation;

public class EncapsulationExample {
    public static void main(String[] args) {
        Student s01 = new Student(100,18,"Popescu");
        Student s02 = new Student(100,19,"Ionescu");

    }
}

class Student {
    int cash;
    int varsta;
    String nume;

    public Student(int cash, int varsta, String nume) {
        this.cash = cash;
        this.varsta = varsta;
        this.nume = nume;
    }

    void paysForLunch(int sum, String itemBought) {
        if (this.cash >= sum) {
            System.out.println("paysForLunch() = " + this.nume + " has bought " + itemBought + "in amount of" + sum);
            this.cash = this.cash - sum;
        } else {
            System.out.println(this.nume + " cannot pay for " + itemBought + "of value" + sum);
        }
    }

    public int getCash(){
        return cash;
    }
}