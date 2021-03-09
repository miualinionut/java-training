package code._4_student_effort._builder_pattern;

public class BuilderTest {
	
	public static void main(String[] args) {
		
		ToyCarBuilder hotwheelsBuilder = new HotwheelsBuilder();
		
		ToyCarEngineer toyCarEngineer = new ToyCarEngineer(hotwheelsBuilder);
		
		toyCarEngineer.makeToyCar();
		
		ToyCar car1 = toyCarEngineer.getToyCar();
		
		System.out.println(car1);
		
	}
	
}