package j02_val;

public class Constant {

	public static void main(String[] args) {
		final int MAX_NUM = 100;
		final int MIN_NUM = 0;
//		final + 변수 -> 상수
		
		int num = 10;
		
//		maxNum = 101;
		num = 11;
		System.out.println("최댓값: " + MAX_NUM);
		System.out.println("최솟값: " + MIN_NUM);
		System.out.println("현재값: " + num);

	}

}
