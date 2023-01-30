package j12_다형성.추상.computer;

public class ComputerMain {

	public static void main(String[] args) {
		Computer c1 = new Laptop();
		Computer c2 = new DesktopImplment();
		
		
		c1.onDisplay();
		c2.onKeyPress();
		((Desktop)c2).onMouseClick();
		
		c1.onSound();
		c2.onSound();
	}
/*
 * c1은 Laptop
 * c2는 DesktopImplement
 * 
 * DeskImpl 상속 Desk 상속 Computer
 * 
 * onMouseClick은 Desktop의 매서드이기 때문에 다운캐스팅 해줘야함
 * 
 * Laptop desktop 모두 Computer 상속받았기 떄문에 onSound 이용가능
 * 
 */
}
