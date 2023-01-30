package j07_반복문.랜덤;

import java.util.Random;

public class Random3 {

	public static void main(String[] args) {
		int i = 0;
		int j = 0;
		int max = 0;
		Random random = new Random();
		
		while(i < 20) {
			while(j < 3) {
				int rNum = random.nextInt(50);
				System.out.println("생성값" + rNum);
				if(j == 0) {
					max = rNum;
				}else {
					if(max < rNum) {
						max = rNum;
					}
				}
				j++;
			}
			i++;
			System.out.println("최댓값 : " + max);
			max = 0;
			j = 0;
		}
	}

}
