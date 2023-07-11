package baekjun;

import java.util.Scanner;


public class N2839 {

	public static void main(String[] args) {
		System.out.println("무게 입력");
		Scanner scanner = new Scanner(System.in);
		int N = scanner.nextInt();
		//무게 입력
	
		int count = sugar(N);
		
		if(count == -1) {
			System.out.println(-1);
		}else {
			System.out.println(count);
		}
		
	}
	
	public static int sugar(int n) {
		if(n==0) {
			return 0;
		}else if(n<0) {
			return -1;
		}
		
		int count = Integer.MAX_VALUE;
		
		int box5 = sugar(n-5);
		if(box5 != -1) {
			count = Math.min(count, box5+1);
		}
		int box3 = sugar(n-3);
		if(box3 != -1) {
			count = Math.min(count, box3+1);
		}
		
		return count == Integer.MAX_VALUE ? -1 : count;
	}
}
