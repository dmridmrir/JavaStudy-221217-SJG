package j15_static.singletone;

import lombok.Builder;

public class Kia2 {
	private static Kia2 instance;
	
	private Car2[] carArray = new Car2[5];
	private int autocode;
	
	private Kia2() {
		autocode = 20230000;
	}
	
	public static Kia2 getinstance() {
		if(instance == null) {
			System.out.println("생성");
			instance = new Kia2();
		}
		return instance;
	}
	
	public Car2 produceCar2(String model) {
		int carNum2 = ++autocode;
		String company = getClass().getSimpleName();
		
		Car2 car2 = Car2
				.builder()
				.model(model)
				.company(company)
				.carNum(carNum2)
				.build();
		if(addCar(car2)) {
			return car2;
		}
		return null;
	}
	private boolean addCar(Car2 car2) {
		for(int i = 0; i < carArray.length; i ++) {
			if(carArray[i] == null) {
				carArray[i] = car2;
				return true;
			}
		}
		System.out.println("공간x");
		return false;
	}
}
