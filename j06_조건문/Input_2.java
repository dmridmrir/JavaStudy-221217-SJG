package j06_조건문;

import java.util.Scanner;

public class Input_2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int money = 0;
		boolean card;
		
		System.out.println("현금을 입력하세요");
		money = scanner.nextInt();
		System.out.println("카드 유무를 입력하세요(true/false)");
		card =  scanner.nextBoolean();
		
		if(money >= 3000 && card == true) {
			System.out.println("택시를 타자");
		}else if(money <= 30000 && card == true) {
			System.out.println("버스를 타자");
		}else {
			System.out.println("걸어가자");
		}
	}
}
