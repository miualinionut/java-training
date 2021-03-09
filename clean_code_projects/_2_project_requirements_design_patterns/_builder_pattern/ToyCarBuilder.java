package code._4_student_effort._builder_pattern;

public interface ToyCarBuilder {
	
	public void buildCarEngine();
	public void buildCarWheels();
	public ToyCar getToyCar();

}