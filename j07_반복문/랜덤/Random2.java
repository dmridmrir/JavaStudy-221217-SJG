package j07_반복문.랜덤;

import java.util.Random;

public class Random2 {

	public static void main(String[] args) {
		Random random = new Random();
		int rNum = random.nextInt(100);
		System.out.println(rNum);
		
		int i = 0;
		while( i < 10) {
			int rNum2 = random.nextInt(10);
			System.out.println(rNum2);
			i++;
		}
	}

}
