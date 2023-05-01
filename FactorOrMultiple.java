package quiz;

import java.util.Scanner;

public class FactorOrMultiple {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int A,B;
		while(true) {
		System.out.println("서로 다른 두 정수 입력");
		A = scanner.nextInt();
		B = scanner.nextInt();
		
		if(A > B) {
			if(A % B == 0) {
				System.out.println(A + " is multiple of " + B);
			}else {
				System.out.println("neither");
			}
		}else if(B > A) {
			if(B % A == 0) {
				System.out.println(A + " is factor of " + B);
			}else {
				System.out.println("neither");
			}
		}
	}
	}

}
