package quiz;

import java.util.Scanner;

public class PseudorandomNumber {

	public static void main(String[] args) {
		int modulus, multiflier, increment, seed;
		int n;
		int result;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("생성할 난수의 갯수 입력");
		n = scanner.nextInt();
		System.out.println("modulus 값 입력");
		modulus = scanner.nextInt();
		System.out.println("multiflier 값 입력 (2 <= multiflier < modulus)");
		multiflier = scanner.nextInt();
		System.out.println("increment 값 입력 (0 <= increment < modulus)");
		increment = scanner.nextInt();
		System.out.println("seed 값 입력(0 <= seed < modulus)");
		seed = scanner.nextInt();
//		초기값 세팅
		
		for(int i = 0; i < n; i++) {
			seed = (multiflier * seed + increment) % modulus;
			System.out.println((i + 1) + "번째 난수 = " + seed);
		}
	}

}
