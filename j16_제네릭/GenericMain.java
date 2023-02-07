package j16_제네릭;

public class GenericMain {

	public static void main(String[] args) {
//		GenericTest genericTest = new GenericTest();
//		
//		genericTest.setNum(100);
//		genericTest.setData("200");
//		System.out.println(genericTest.getNum() + genericTest.getData());
		
		GenericTest<Integer, Integer> genericTest2 = new GenericTest<>();
		genericTest2.setNum(100);
		genericTest2.setData(200);
		System.out.println(genericTest2.getNum() + genericTest2.getData());
		
		GenericTest<String, String> genericTest3 = new GenericTest<>();
		genericTest3.setNum("100");
		genericTest3.setData("200");
		System.out.println(genericTest3.getNum() + genericTest3.getData());
	}

}
