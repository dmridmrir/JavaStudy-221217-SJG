package j02_val;

public class Cast {

	public static void main(String[] args) {
		char a = 'A';
		int b = a;
		double c = b;
		
		
		System.out.println(b);
		System.out.println(c);
//		업캐스팅
		
		
//		int d = c;
		
		int d = (int) c;
		char e = (char) d;
		
		System.out.println(d);
		System.out.println(e);
		
//		다운캐스팅 (문자형) 변수;
	}

}
