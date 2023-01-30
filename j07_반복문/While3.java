package j07_반복문;

import java.util.Scanner;

public class While3 {

	public static void main(String[] args) {
		int i = 0;
		int n = 0;
		
		System.out.println("반복횟수 입력");
		Scanner scanner = new Scanner(System.in);
		n = scanner.nextInt();
		
		while(i < n) {
			i++;
			System.out.println("i" + " = " + i);
		}
		System.out.println("------------------------------");
		while(i > 0) {
			System.out.println("i" + " = " + i);
			i--;
		}
	}

}
