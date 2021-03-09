package code._4_student_effort._builder_pattern;
public class ToyCar implements ToyCarBlueprints{
	
	private String wheels;
	private String engine;

	@Override
	public void setWheels(String wheelType) {
		
		this.wheels = wheelType;
		
	}

	@Override
	public void setEngine(String engineType) {

		this.engine = engineType;
		
	}
	
	public String getWheels() {
		
		return this.wheels;
		
	}
	
	public String getEngine() {
		
		return this.engine;
		
	}

}