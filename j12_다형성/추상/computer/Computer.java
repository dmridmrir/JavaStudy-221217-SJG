package j12_다형성.추상.computer;

public abstract class Computer {
	
	public abstract void onKeyPress();
	public abstract void onDisplay();
	
	public void onSound() {
		System.out.println("소리를 출력함");
	}
}
