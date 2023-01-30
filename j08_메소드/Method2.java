package j08_메소드;

public class Method2 {

	public static void test1() {
		System.out.println("test1");
	}
	public static void test2(int num) {
		System.out.println("test2" + " = " + num);
	}
	public static void test3(int num, int num2) {
		System.out.println("test3" + " = " + num + ", " + num2);
	}
	public static int test4() {
		System.out.print("test4" + " = ");
		return 100;
	}
	public static String test5(String name, int index) {
		System.out.println("test5" + " = " + name + index);
		return name + index;
	}
	
	public static void main(String[] args) {
		test1();
		test2(100);
		test3(100,200);
		int a = test4();
		System.out.println(a);
		System.out.println(test5("서정근",1));
	}

}
