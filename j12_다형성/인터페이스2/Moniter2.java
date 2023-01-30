package j12_다형성.인터페이스2;

public class Moniter2 implements HDMI2{

	@Override
	public void connect() {
		System.out.println("모니터 연결 완료");
	}

	@Override
	public void disconnect() {
		System.out.println("모니터 연결 해제 완료");
	}
	
}
