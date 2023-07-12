package quiz;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
			Scanner scanner = new Scanner(System.in);
			System.out.println("숫자 입력");
			int N = scanner.nextInt();
			
			int result = fact(N);
			System.out.println(result);
			
			scanner.close();

	}
	
	static int fact(int n) {
		if(n ==0) {
			return 1;
		}
		return (n*fact(n-1));
	}

}
