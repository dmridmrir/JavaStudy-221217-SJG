package j12_다형성.인터페이스;

public class Computer {
	private HDMI hdmi;
	
	public Computer(HDMI hdmi) {
		this.hdmi = hdmi;
	}
	
	public void powerOn() {
		System.out.println("컴퓨터 전원 킴");
		connectDisplay();
	}
	public void powerOff() {
		disconnectDisplay();
		System.out.println("컴퓨터 전원 끔");
	}
	
	private void connectDisplay() {
		System.out.println("출력장치 연결");
		hdmi.connect();
	}
	private void disconnectDisplay() {
		System.out.println("출력장치 연결 해제");
		hdmi.disconnect();
	}
}
