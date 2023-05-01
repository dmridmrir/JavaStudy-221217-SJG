package quiz;

import java.util.Scanner;

public class LinearSearch {
	public static void main(String[] args) {
		int ary[] = {0,1,2,3,4,5,6,7,8,9};
		int index = 0;
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("찾을 숫자 입력");
		int n = scanner.nextInt();
		
		for(int i = 0; i < ary.length; i ++) {
			if(ary[i] != n) {
				continue;
			}else {
				index = i;
				break;
			}
		}
		System.out.println(n + "의 인덱스는 : " + index);
	}
}
