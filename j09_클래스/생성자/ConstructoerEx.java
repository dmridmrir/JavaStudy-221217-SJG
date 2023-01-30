package j09_클래스.생성자;

public class ConstructoerEx {
	String name;
	int birth;
	
	
	public ConstructoerEx() {
		System.out.println("기본 생성자");
	}
	public ConstructoerEx(String name) {
		System.out.println("매개변수 : " + name);
		System.out.println("name매개변수");
		this.name = name;
	}
	public ConstructoerEx(int birth) {
		System.out.println("매개변수 : " + birth);
		System.out.println("birth매개변수");

	}
	public ConstructoerEx(String name, int birth) {
		System.out.println("매개변수 : " + name);
		System.out.println("매개변수 : " + birth);
		System.out.println("전체 생성");
	}
	
	
//	args = argument 인수/매개변수
}
