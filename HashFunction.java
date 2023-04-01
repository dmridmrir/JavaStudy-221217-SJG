package quiz;

import java.util.Scanner;

public class HashFunction {
	
	public static int H(int input) {
		int result = input % 11;
		return result;
	}
//	입력값을 11로 나눈 나머지값을 리턴하는 해쉬함수 구현

	public static void main(String[] args) {
		int n = 0;
		int[] ary = {0,0,0,0,0,0,0,0,0,0,0};
//		크기가 11이고 모든 인덱스의 값이 0인 배열 생성
		
		Scanner scanner = new Scanner(System.in);
		
		for(int i = 0; i < ary.length; i ++) {
			System.out.println("임의의 정수 입력");
			int input = scanner.nextInt();
			
			if(ary[H(input)] != 0) {			
				while(true) {					
					input ++;
					n++;
					if(ary[H(input)] == 0) {
						ary[H(input)] = input - n;
						break;
					}
			}
		}else {
			ary[H(input)] = input;
		}
//		인덱스 값이 0이 아닌 경우 -> input값에 1을 더하면서 H함수에 적용시켜 빈 인덱스를 탐색하여 비자리 저장
//		나머지 값은 그냥 저장
		}
		for(int j = 0; j < ary.length; j ++) {
			System.out.println(j + "번째 인덱스의 값 = " + ary[j]);
		}

}
}