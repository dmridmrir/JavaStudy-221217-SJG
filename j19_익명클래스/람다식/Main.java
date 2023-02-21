package j19_익명클래스.람다식;

//인터페이스에 추상메서드 1개일떄만 사용가능

public class Main {

	public static void main(String[] args) {
		Math<Integer, Integer> plusMath = new Math<Integer, Integer>() {
			
			@Override
			public double calc(Integer value1, Integer value2) {
				
				return value1 + value2;
			}
		
			
			
		};
		System.out.println(plusMath.calc(10, 20));
		
		Math<Double, Double> plusMath2 = new Math<Double, Double>() {
			
			@Override
			public double calc(Double value1, Double value2) {
				return value1 + value2;
			}
		};
		
		System.out.println(plusMath2.calc(100.5, 200.5));
		
		Math<Double, Double> plusMath3 = (v1, v2) -> v1 +v2;
		System.out.println(plusMath3.calc(10.5, 20.5));
//		
//		Math<Double, Double> plusMath4 = (v1, v2) -> v1 +v2;
//		System.out.println("v1 : " + v1);
//		System.out.println("v2 : " + v2);
//		return v1 + v2;
	}

}
