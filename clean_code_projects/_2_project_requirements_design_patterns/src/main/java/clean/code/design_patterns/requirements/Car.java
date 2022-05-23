package main.java.clean.code.design_patterns.requirements;

public class Car
{
	private final String carBrand; // required
	private final String carModel; // required
	private final int yearOfFabrication; // optional
	private final String fuelType; // optional
	private final String bodyType; // optional

	private Car(CarBuilder builder) {
		this.carBrand = builder.carBrand;
		this.carModel = builder.carModel;
		this.yearOfFabrication = builder.yearOfFabrication;
		this.fuelType = builder.fuelType;
		this.bodyType = builder.bodyType;
	}

	public String getcarBrand() {
		return carBrand;
	}
	public String getcarModel() {
		return carModel;
	}
	public int getyearOfFabrication() {
		return yearOfFabrication;
	}
	public String getfuelType() {
		return fuelType;
	}
	public String getbodyType() {
		return bodyType;
	}

	@Override
	public String toString() {
		return "Car: " + this.carBrand + ", " + this.carModel + ", " + this.yearOfFabrication + ", " + this.fuelType + ", "+this.bodyType;
	}

	public static class CarBuilder
	{
		private final String carBrand;
		private final String carModel;
		private int yearOfFabrication;
		private String fuelType;
		private String bodyType;

		public CarBuilder(String carBrand, String carModel) {
			this.carBrand = carBrand;
			this.carModel = carModel;
		}
		public CarBuilder yearOfFabrication(int yearOfFabrication) {
			this.yearOfFabrication = yearOfFabrication;
			return this;
		}
		public CarBuilder fuelType(String fuelType) {
			this.fuelType = fuelType;
			return this;
		}
		public CarBuilder bodyType(String bodyType) {
			this.bodyType = bodyType;
			return this;
		}
		//Return the finally consrcuted Car object
		public Car build() {
			Car Car =  new Car(this);
			validateCarObject(Car);
			return Car;
		}
		/*private void validateCarObject(Car Car) {
			
		}*/
	}
}