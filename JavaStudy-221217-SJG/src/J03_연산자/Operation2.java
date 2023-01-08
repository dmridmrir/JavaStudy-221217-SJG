package J03_연산자;

public class Operation2 {

	public static void main(String[] args) {
//		관계연산자
		
		System.out.println(10 > 5);
		
		boolean result = 10 > 5;
		System.out.println(result);
		
		
		boolean result2 = 10 == 5;
		System.out.println(result2);
		
		boolean result3 = 10 != 5;
		System.out.println(result3);
		
		boolean result4 = 10 < 5;
		System.out.println(result4);
		
//		boleam 끼리 연산x
//		System.out.println(result + result2);
//		System.out.println("" + result + result2);
		
		/*
		 *  논리연산 : boolean 끼리 연산
		 *  and 연산 &&
		 *  - true, true = true
		 *  - true, false = false
		 *  -false, false = false
		 *  -회원가입시 영문 기호 숫자 조합 확인 등등
		 *  
		 *  or 연산 ||
		 *  - true, true = true
		 *  -true, false = true
		 *  -false. false = false
		 *  not 연산 !
		 *  -true = false
		 *  -false = true
		 */
		
		System.out.println(!true);
		System.out.println(2000 % 4 == 0 && 2000 % 100 != 0);
		System.out.println(2000 % 4 == 0 && 2000 % 100 != 0 && 2000 % 5 ==0);

	}

}
