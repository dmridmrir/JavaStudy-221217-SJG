package quiz;

import java.util.Scanner;

public class Snail {

	public static void main(String[] args) {
		int len; //나무의 높이
		int up; //올라가는 높이
		int down; // 미그러지는 높이
		int now = 0; //현재 높이
		int day = 1;
		
		Scanner scanner  = new Scanner(System.in);
		
		System.out.println("하루에 올라가는 높이 입력");
		up = scanner.nextInt();
		System.out.println("밤에 미끄러지는 높이 입력");
		down = scanner.nextInt();
		System.out.println("나무의 높이 입력");
		len = scanner.nextInt();
		
		while(true) {
			now += up;
			if(len <= now) {
				break;
			}
			now -= down;
			if(now < 0) {
				now = 0;
			}
			day++;
		}
		System.out.println("나무를 올라가는데 걸리는 날 : " + day);
	}

}
