package j09_클래스.생성자;

public class Car {
	String company;
	String model;
	String color;
	
	public Car() {
	}

	public Car(String company, String model, String color) {
		this.company = company;
		this.model = model;
		this.color = color;
	}
	void showInfo() {
		System.out.println(company);
		System.out.println(model);
		System.out.println(color);
	}
}
