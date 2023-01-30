package quiz;

import java.util.Scanner;

public class Count {

	public static void main(String[] args) {
		int n = 11;
		int[] v = new int[n];
		int m = 2;
		int count = 0;
		for (int i = 0; i <= n-1; i ++) {
			v[i] = (int)(Math.random() * 100 % 10);
			System.out.println(v[i]);
		}
		for (int i = 0; i <= n-1; i ++) {
			if(v[i] == m) {
				count ++;
			}
		}
		System.out.println();
		System.out.println(count);
	}

}
