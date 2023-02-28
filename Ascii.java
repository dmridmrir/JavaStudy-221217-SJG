package quiz;

import java.util.Scanner;

public class Ascii {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		while(true) {
			System.out.println("숫자 or 알파벳(대/소) 입력");
			
			char a = scanner.next().charAt(0);
			System.out.println((int) a);
		}
	}

}
