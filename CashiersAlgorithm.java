package quiz;

import java.util.Scanner;

public class CashiersAlgorithm {

	public static void main(String[] args) {
		int c1 =25;
		int c2 = 10;
		int c3 = 5;
		int c4 = 1;
		int sum1=0;
		int sum2 = 0;
		int sum3 =0;
		int sum4 = 0;
		
		System.out.println("받은 돈 입력");
		Scanner scanner = new Scanner(System.in);
		int cost = scanner.nextInt();
		
		while(cost > c1) {
			cost -= c1;
			sum1 ++;
		}
		while(cost > c2) {
			cost -= c2;
			sum2 ++;
		}
		while(cost > c3) {
			cost -= c3;
			sum3 ++;
		}
		while(cost >= c4) {
			cost -= c4;
			sum4 ++;
		}
		System.out.println("25센트 : " + sum1 + "개");
		System.out.println("10센트 : " + sum2 + "개");
		System.out.println("5센트 : " + sum3 + "개");
		System.out.println("1센트 : " + sum4 + "개");
	}

}
