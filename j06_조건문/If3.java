package j06_조건문;

import java.util.Scanner;

public class If3 {

	public static void main(String[] args) {
		int x = 0;
		int y = 0;
		String result = null;
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("x좌표 입력");
		x = scanner.nextInt();
		System.out.println("y좌표 입력");
		y = scanner.nextInt();
		
		if(x > 0 && y > 0) {
			result = "제1사분면 위의 점";
		}else if(x > 0 && y < 0) {
			result = "제4사분면 위의 점";
		}else if(x < 0 && y < 0) {
			result = "제3사분면 위의 점";
		}else if(x < 0 && y > 0) {
			result = "제2사분면 위의 점";
		}else if(x == 0 || y == 0) {
			result = "사분면 위의 점이 아님";
		}
		
		System.out.println("x : " + x);
		System.out.println("y : " + y);
		System.out.println("결과 : " + result);
	}

}
