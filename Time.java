package quiz;

import java.util.Scanner;

public class Time {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int hour = 0;
		int min = 0;
		
		System.out.println("(0 <= 시간 <= 23)을 입력하고 (0 <= 분 <= 60)을 입력하세요");
		hour = scanner.nextInt();
		min = scanner.nextInt();
		if(min >= 45) {
			System.out.println(hour + "시 " + min + "분");
		}else if(min < 45) {
			hour -= 1;
			min = 60 + (min - 45);
			if(hour < 0) {
				System.out.println(23 + "시 " + min + "분");
			}else {
				System.out.println(hour + "시 " + min + "분");
			}
		}
		}

}
