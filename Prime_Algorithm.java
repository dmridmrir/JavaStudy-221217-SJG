package quiz;

public class Prime_Algorithm {
	int n;
	int k;
	public Prime_Algorithm(int a) {
		n = a;
	}
	public int Prime(int n) {
		for(int d = 2; d <= (int)Math.sqrt(n); d++) {
			if(n % d == 0) {
				k=0;
				break;
			}else {
				k=1;
			}
		}
		return k;
	} 
//	소수 찾기 알고리즘 
//	나눠지는 수가 있다면 0을 리턴
//	그렇지 않다면 1을 리턴
}
