package j19_익명클래스.람다식;

public class strTestMain2 {

	public static void main(String[] args) {
		strTest2 test2 = new strTest2() {
			
			@Override
			public String test2(String str) {
				return str + "님";
			}
		};
		
		System.out.println(test2.test2("서정근"));
		

		strTest2 test3 = (str) -> {
			return str + "님";
		};
		
		System.out.println(test3.test2("서정근"));
	}

}
