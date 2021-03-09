package code._4_student_effort._builder_pattern;

public class HotwheelsBuilder implements ToyCarBuilder {
	
	private ToyCar toycar;
	
	public HotwheelsBuilder() {
		
		this.toycar = new ToyCar();
		
	}

	@Override
	public void buildCarEngine() {

		toycar.setEngine("Boxer");
		
	}

	@Override
	public void buildCarWheels() {

		toycar.setWheels("Chrome Wheels");
		
	}

	@Override
	public ToyCar getToyCar() {

		return this.toycar;
		
	}
	
	
	
}