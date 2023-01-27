package j11_상속.practice;

public class CarMain {

	public static void main(String[] args) {
		Car car1 = new Car(12345);
		
		System.out.println(car1.getNum());
		
		Kia kia1 = new Kia(23456);
		
		System.out.println(kia1.getNum());
	}

}
