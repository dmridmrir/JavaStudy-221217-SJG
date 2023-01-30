package j12_다형성.인터페이스2;

public class Computer2 {
	private HDMI2 hdmi2;
	
	public Computer2(HDMI2 hdmi2) {
		this.hdmi2 = hdmi2;
	}
	public void poweron() {
		System.out.println("컴퓨터on");
		connectdisplay();
	}
	public void poweroff() {
		disconnectDisplay();
		System.out.println("컴퓨터off");
	}
	public void connectdisplay() {
		System.out.println("컴퓨터와 모니터를 연결");
		hdmi2.connect();
	}
	public void disconnectDisplay() {
		System.out.println("컴퓨터와 모니터 연결 해제");
		hdmi2.disconnect();
	}
}
