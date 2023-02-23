package j20_예외처리;

public class ExceptionPractice {

	public static void main(String[] args) {
		int[] a = {1,2,3,4,5};
		
		for(int i = 0; i < 5; i++) {
			try {
				System.out.println(a[i]);
				throw new NullPointerException();
				
			}catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("z");				
			}catch (Exception e) {
			System.out.println("오류발생");
			}
		}
	}

}
