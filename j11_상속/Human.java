package j11_상속;

public class Human extends Animal{
	
	public Human() {
		super();
		System.out.println("haman 객체 생성");
	}
//	public void move() {
//		System.out.println("동물이 움직입니다");
//	}
//	오버라이드 : 재정의
//	@ -> 어노테이션
	@Override
	public void move() {
		System.out.println("사람이 두 발로 걷습니다");
	}
	
	public void readBooks() {
		System.out.println("사람이 책을 읽습니다");
	}
}
