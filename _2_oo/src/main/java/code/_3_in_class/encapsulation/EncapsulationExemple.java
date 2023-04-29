package code._3_in_class.encapsulation;

public class EncapsulationExemple {
    public static void main(String[] args) {


        Student s01= new Student(new Portofel(100), 18, "Popescu");
        Student s02 = new Student(new Portofel(100), 19, "Ionescu");
        System.out.println(s01.toString());
        System.out.println(s02.toString());
        String itemBought = "pizza";
        int sum =101;
    }
}

class Student{// regula de implementat: studentul nu trebuie sa ajunga niciodata sa aiba datorii => cash trebuie sa fie >=0
    //1 metode (behavior)
    //2 atribute (state)

    private Portofel portofel;
    private int varsta;

    private String nume;



    public int getVarsta() {
        return varsta;
    }

    public String getNume() {
        return nume;
    }



    public void setVarsta(int varsta) {
        this.varsta = varsta;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public Student(Portofel portofel, int varsta, String nume){

        this.portofel=portofel;
        this.varsta=varsta;
        this.nume=nume;
    }

    void paysForLunch(int sum, String itemBought){//behavior

        if(this.portofel.getCash() >= sum) {
            System.out.println(this.nume + "has bought" + itemBought + " in amount of " + sum);
            //this.portofel.getPortofel() = this.portofel.getCash() - sum;
        }
        else{
            System.out.println(this.nume + "cannot pay for " + itemBought + " of value " + sum);
        }
    }

    public String toString(){


        return "Student{" + "cash=" + portofel.getCash() + ", varsta="+  varsta +", nume ="+ nume +"}";
    }


    public int getPortofel() {

        return portofel.getCash();
    }
}
class Portofel{
    private int cash;
    public Portofel(int cash)
    {
        this.cash=cash;
    }

    public int getCash() {
        return cash;
    }

    public void setCash() {
        if(cash>=0) {
            this.cash = cash;
        }
        else {
            System.out.println("nue putem seta valori negative");
        }
    }
    @Override
    public String toString() {
        return "Student{" +
                "portofel=" + cash +
                '}';
    }

    public int getPortofel() {
        return cash;
    }
}
