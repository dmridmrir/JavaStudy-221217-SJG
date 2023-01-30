package j05_입력;

import java.util.Scanner;

public class Input1_1 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String str = null;
		int num1 = 0;
		
		System.out.println("내용을 입력하세요");
		str = scanner.nextLine();
		System.out.println("내용을 입력하세요");
		num1 =  scanner.nextInt();
		
		System.out.println("출력 : " + str);
		System.out.println("출력2 : " + num1);
	}

}
