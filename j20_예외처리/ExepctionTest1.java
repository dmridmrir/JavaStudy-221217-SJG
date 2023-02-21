package j20_예외처리;

public class ExepctionTest1 {

	public static void main(String[] args) {
		
		int[] numArray = {1,2,3,4,5};
		
		for(int i = 0; i < 6; i ++) {
			try {
				System.out.println(numArray[i]);
				
				throw new NullPointerException();
//				오류를 주면 try구문 실행 안됨
//				System.out.println("반복 종료");
			}  catch (ArrayIndexOutOfBoundsException e) {
				System.out.println("out of index");
			}  catch (Exception e) {
				System.out.println("예외가 발생했습니다");
			}	finally {
				System.out.println("오류 예외 발생 유무에 상관없이 무조건 실행");
			}
		}
		
		System.out.println("프로그램 종료");
	}

}
