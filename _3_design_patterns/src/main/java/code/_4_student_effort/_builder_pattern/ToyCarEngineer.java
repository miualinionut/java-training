package code._4_student_effort._builder_pattern;

public class ToyCarEngineer {
	
	private ToyCarBuilder carBuilder;
	
	public ToyCarEngineer(ToyCarBuilder customToyCarBuilder) {
		
		this.carBuilder = customToyCarBuilder;
		
	}
	
	public ToyCar getToyCar() {
		
		return this.carBuilder.getToyCar();
		
	}
	
	public void makeToyCar() {
		
		this.carBuilder.buildCarEngine();
		this.carBuilder.buildCarWheels();
		
	}

}