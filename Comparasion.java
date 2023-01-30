package quiz;

import java.util.Scanner;

public class Comparasion {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int A = 0;
		int B = 0;
		
		System.out.println("A입력 후 B 입력");
		A = scanner.nextInt();
		B = scanner.nextInt();
		
		if(A > B) {
			System.out.println(">");
		}else if(A < B) {
			System.out.println("<");
		}else {
			System.out.println("==");
		}
	}

}
