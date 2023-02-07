package j15_static.singletone;

/*/
 * 싱글톤(singleton)
 * 유일한 객체를 만들어 공유하는 생성패턴
 * -생성자는 접근지정자가 private
 * -자기 자신의 유일한 객체를 담을 수 있는 instance라는 변수명을 가진 static 변수가 필요
 * -instance 변수를 리턴(공유)해줄 'getinstance' static 매서드 필요
 */

public class Kia {
	
//	private Kia() {
//		
//	}
	private static Kia instance; 
//	instance = 유무 확인
	
	private Car[] carArray;
	private int autocode;
	
	private Kia() {
		carArray = new Car[10];
		autocode = 20230000;
	}
	
	public static Kia getInstance() {
		if(instance == null) {
			System.out.println("생성");
			instance = new Kia();
		}
		return instance;
	}
	
	public Car produceCar(String model) {
		int carNumber =  ++autocode;
		String company = getClass().getSimpleName();
		
//		Car car = new Car(carNumber, company, model);
//		@builder 사용시 아래와 같이 작성
//		시작은 builder 끝은 build 변수 순서 상관x 작성안해도됨
		Car car = Car.builder()
				.model(model)
				.company(company)
				.carNumber(carNumber)
				.build();
		
		if(addCar(car)) {
			return car;
		}
		
		return null;
	}
	
	private boolean addCar(Car car) {
		for(int i = 0; i < carArray.length; i ++) {
			if(carArray[i] == null) {
				carArray[i] = car;
				System.out.println("배열에 차량 추가 완료");
				return true;
			}
		}
		System.out.println("배열에 공간이 없음");
		return false;
	}
}
