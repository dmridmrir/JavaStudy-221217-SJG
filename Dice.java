package quiz;

import java.util.Scanner;

public class Dice {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int A = 0;
		int B = 0;
		int C = 0;
		int prize = 0;
		int num = 0;
		
		System.out.println("주사위 눈 수 입력");
		A = scanner.nextInt();
		B = scanner.nextInt();
		C = scanner.nextInt();
		
		if(A == B && B == C){
			prize = 10000 + A * 1000;
		}else if(A != B && B != C && A != C) {
			for(int i = 0; i < 3; i++) {
				if(i == 0) {
				num = A;	
				}else {
					if(num <B) {
						num = B;
					}else if(num < C) {
						num = C;
					}
				}
				prize = num * 100;
			}
		}else {
			if(A == B) {
				prize = A * 100 + 1000;
			}else {
				prize = B * 100 + 1000;
			}
		}
		System.out.println(prize);
	}

}
