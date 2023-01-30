package quiz;

import java.util.Scanner;

public class resume {
	public static void main(String[] args) {
		int total = 0;
		int count = 0;
		int price = 0;
		int n = 0;
		int result = 0;
		int multi = 0;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("총 구입액을 입력");
		total = scanner.nextInt();
		System.out.println("구입한 물품의 종류 입력");
		n = scanner.nextInt();
		
//		for(int i = 1; i <= n; i++) {
//			System.out.println("구입한 물품의 가격 입력");
//			price = scanner.nextInt();
//			System.out.println("구입한 물품의 갯수 입력");
//			count = scanner.nextInt();
//			multi = price * count;
//			result += multi;
//		}
//		System.out.println(total == result);
		int a = 0;
		while(a < n) {
			System.out.println("구입한 물품의 가격 입력");
			price = scanner.nextInt();
			System.out.println("구입한 물품의 갯수 입력");
			count = scanner.nextInt();
			multi = price * count;
			result += multi;
			a ++;
		}
		
		System.out.println(total == result);
	}

}
