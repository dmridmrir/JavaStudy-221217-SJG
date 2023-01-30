package j08_메소드;

public class Method3 {
	/*
	 * 메소드 오버로딩 매개변수의 형태가 다르면 동일한 메소드 명을 사용하여 메소드를 정의할 수 있다
	 */

	public static void test1() {
		System.out.println("매개변수 x ");
	}
	public static void test1(int num){
		System.out.println("매개변수 1 int자료형");
	}
	public static void test1(int num, int num2) {
		System.out.println("매개변수 2 int 자료형");
	}
	public static void test1(int num, String num2) {
		System.out.println("매개변수 2 int 1 String1");
	}
	public static void test1(String a, int b) {
		System.out.println("매개변수2 String1 int2");
	}
	
	
	
	public static void main(String[] args) {
		test1();
		test1(10);
		test1(10,20);
		test1(10,"20");
		test1("10",20);
	}

}
