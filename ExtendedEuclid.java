package quiz;

public class ExtendedEuclid {
	public static int[] extendedEuclideanAlgorithm(int a, int b) {
		
	    if (b == 0) {
	        return new int[] { a, 1, 0 };
	    }
	    int[] gcdXY = extendedEuclideanAlgorithm(b, a % b);
	    int x = gcdXY[2];
	    int y = gcdXY[1] - (a / b) * gcdXY[2];
	    return new int[] { gcdXY[0], x, y };
	}
//	확장된 유클리드 알고리즘 구현
//	{최대공약수,x,y}배열 리턴

	public static int findS(int n, int phi) {
	    int[] gcdXY = extendedEuclideanAlgorithm(n, phi);
	    int gcd = gcdXY[0];
	    int x = gcdXY[1];
	    int y = gcdXY[2];
	    if (gcd != 1) {
	        return -1;
	    }
	    int s = x % phi;
	    return s >= 0 ? s : s + phi;
	}
//	n과 phi의 최대공약수가 1이 아닌경우에 -1을 리턴
}
