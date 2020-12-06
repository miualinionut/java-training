package code._4_student_effort;
import java.util.Arrays;

public class TheRealEstateAgentProxy {
    private Apartment[] apartments = new Apartment[0];

    public void represent(Apartment apartment){
        this.apartments = Arrays.copyOf(this.apartments,this.apartments.length + 1);
        this.apartments[this.apartments.length - 1] = apartment;
    }

    public Apartment rent(Student student){
        Apartment rentApartment = null;
        if(!student.getName().startsWith("P")){
            for(int i=0; i<apartments.length; i++){
                if(this.apartments[i].getMonthlyRentCost() < student.getMoney()){
                    rentApartment = this.apartments[i];
                    System.arraycopy(this.apartments, i+1, this.apartments,i,this.apartments.length - i - 1);
                }
            }
        }
        return rentApartment;
    }

    public static void main(String[] args) {
        Apartment app01 = new Apartment("Crangasi01", 300);
        Apartment app02 = new Apartment("Crangasi01", 600);
        Apartment app03 = new Apartment("Crangasi01", 350);
        Apartment app04 = new Apartment("Crangasi01", 400);
        Apartment app05 = new Apartment("Crangasi01", 200);

        TheRealEstateAgentProxy proxy = new TheRealEstateAgentProxy();
        proxy.represent(app01);
        proxy.represent(app02);
        proxy.represent(app03);
        proxy.represent(app04);
        proxy.represent(app05);

        Student student01 = new Student("Ionescu", 500);
        Student student02 = new Student("Popescu", 330);

        Apartment apartmentForStudent01 = proxy.rent(student01);
        System.out.println(student01 + " rented " + apartmentForStudent01);
        Apartment apartmentForStudent02 = proxy.rent(student02);
        System.out.println(student02 + " rented " + apartmentForStudent02);

    }
}
