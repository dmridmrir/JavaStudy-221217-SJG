package quiz;

public class GCD_Algorithm {
	int n;
	
	public int findN(int num) {
		for(int i = 1; i < num; i ++) {
			if(gcd(num,i)==1){
				n = i;
			}
		}
		return n;
	}
//	숫자가 주어지면 1부터 숫자-1까지의 숫자 중
//	최대공약수가 1인 수를 찾음
//	n크기의 제한을 둬서 크기 조절 가능
	public int gcd(int a, int b) {
		if(b == 0 ) {
			return a;
		}
		return gcd(b, a%b);
	}
//	최대공약수를 구하는 함수
}
