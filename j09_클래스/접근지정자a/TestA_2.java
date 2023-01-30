package j09_클래스.접근지정자a;

public class TestA_2 {
	int ta2;
	
	public void testA2() {
		System.out.println("Testa-2 메서드 호출");
		TestA testA = new TestA();
		testA.ta1 = "테스트 A-2에서 값 주입";
		testA.testA1();
		System.out.println(testA.ta1);
	}
}
