package j10_배열;

import java.util.Scanner;

public class Array1 {

	public static void main(String[] args) {
		int[] numbers = new int[5];
		
		String[] strArray = new String[5];
		
		Scanner[] scanArray = new Scanner[5];
		
		
		
		numbers[0] = 10;
		numbers[1] = 20;
		numbers[2] = 30;
		numbers[3] = 40;
		numbers[4] = 50;
		
		strArray[4] = "문자열";
		
		scanArray[0] = new Scanner(System.in);
		int a = scanArray[0].nextInt();
		System.out.println(a);
	}

}
