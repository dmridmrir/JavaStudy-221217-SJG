package j19_익명클래스;

public class Main {

	public static void main(String[] args) {
//		추상클래스는 생성 못함
		AbstractTest abstractTestImpl = new AbstractTestImpl();
		abstractTestImpl.showData("Json");
		abstractTestImpl.add(10, 20);
		
		AbstractTest abstractTest2 = new AbstractTest() {

			@Override
			public void showData(String data) {
				System.out.println("여기에서만 사용 가능한 사용가능 ");
			}

			@Override
			public void add(int num1, int num2) {
				System.out.println("한번만 사용가능");
			}
			
		};
//		세미콜론 붙여야 함
		
		abstractTest2.add(3, 4);
	}

}
