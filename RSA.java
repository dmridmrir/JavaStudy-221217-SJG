package quiz;

import java.util.Scanner;

public class RSA {

	public static void main(String[] args) {
		int p = (int)(Math.random() * 100);
		int q = (int)(Math.random() * 100);
		
		Prime_Algorithm a = new Prime_Algorithm(p);
		while(a.Prime(p) == 0) {
			p = (int)(Math.random() * 100);
			a.Prime(p);
		}
		Prime_Algorithm b = new Prime_Algorithm(q);
		while(b.Prime(q) == 0) {
			q = (int)(Math.random() * 100);
			b.Prime(q);
		}
		System.out.println("p = " + p);
		System.out.println("q = " + q);
//		p,q가 소수가 나올 때 까지 난수 생성
		int z = p*q;
		int phi = (p-1) * (q-1);
		int n = 29;
		int s;
		
		GCD_Algorithm gcd = new GCD_Algorithm();
		n = 3;
		
//		n = gcd.findN(phi);
//		n의값 생성하는 코드
//		n값이 커지면 숫자가 너무 커져서 계산이 안됨
		
//		n과 phi의 최대공약수가 1이되는 n 생성
//		GCD알고리즘에서 범위를 안잡아서 phi-1로 생성
		
		ExtendedEuclid lasts = new ExtendedEuclid();
		s = lasts.findS(n, phi);
//		확장된 알고리즘을 통해 n*s mod phi = 1이되는
//		s값 계산
//		n과 s가 같은 값이 나오는 이유는 n을 phi-1으로 잡아서
//		최대공약수가 1이 나오려면 제곱을 해야함
		
		System.out.println("공개키z : " + z + " 공개키n : " + n);
		System.out.println("개인키s : " + s);
		
		
//		개인키가 -1이 나오면 서로소x -> 프로그램 재시작
		
		System.out.println("------------------------");
		System.out.println("암호화");
		System.out.println("정수 input(<Z), 공개키 (z,n) 하나씩 입력");
		Scanner scanner = new Scanner(System.in);
		int input = scanner.nextInt();
		int z1 = scanner.nextInt();
		int n1 = scanner.nextInt();
		int c;
		int result = 1;
		
		c = input  % z1;
		while(n1>0) {
			if(n1 % 2 ==1) {
				result = (result * c) % z1;
			}
			c = (c*c) % z;
			n1 = (int)Math.floor(n1/2);
		}
		
		System.out.println("암호문 : " + result);
//		암호화
		
		System.out.println();
		System.out.println("복호화");
		System.out.println("암호문 c, 공개키z, 개인키s 하나씩 입력");
		c = scanner.nextInt();
		int z2 = scanner.nextInt();
		int s1 = scanner.nextInt();
		
		result = 1;
		int output = c % z; 
		while(s1 > 0) {
			if(s1 % 2 ==1) {
				result = (result*output) % z2;
			}
			output = (output * output) % z2;
			s1 = (int)Math.floor(s1/2);
		}
		
		System.out.println("평문 : " + result);
//		복호화
	}

}
