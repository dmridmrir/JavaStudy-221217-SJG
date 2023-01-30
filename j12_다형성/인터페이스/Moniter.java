package j12_다형성.인터페이스;

public class Moniter implements HDMI{

	@Override
	public void connect() {
		System.out.println("모니터 연결");
	}

	@Override
	public void disconnect() {
		System.out.println("모니터 연결 해제");
	}
	
}
