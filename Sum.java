package quiz;

import java.util.Scanner;

public class Sum {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int sum = 0;
		int n = 0;
		System.out.println("정수를 입력하세요");
		n = scanner.nextInt();
		
		for (int i = 0; i <= n; i++) {
			sum = sum + i;
		}
		System.out.println(sum);
	}

}
