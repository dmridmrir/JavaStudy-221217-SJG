package j20_예외처리;

public class ExepctionTest2Main {

	public static void main(String[] args) {
		ExceptionTest2 exceptionTest2 = new ExceptionTest2();
		try {
			exceptionTest2.printArray();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
