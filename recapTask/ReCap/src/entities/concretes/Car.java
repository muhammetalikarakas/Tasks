package entities.concretes;

public class Car {
	private int id;
	private int modelYear;
	private double dailyPrice;
	private String description;
	
	public Car() {
		super();
	}

	public Car(int id, int modelYear, double dailyPrice, String description) {
		super();
		this.id = id;
		this.modelYear = modelYear;
		this.dailyPrice = dailyPrice;
		this.description = description;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getModelYear() {
		return modelYear;
	}

	public void setModelYear(int modelYear) {
		this.modelYear = modelYear;
	}

	public double getDailyPrice() {
		return dailyPrice;
	}

	public void setDailyPrice(double dailyPrice) {
		this.dailyPrice = dailyPrice;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	
	
}
