package j12_다형성2;

public class KakaoTalk implements Messenger{

	@Override
	public void send() {
		System.out.println("카카오톡 메세지 송신");
	}

	@Override
	public void receive() {
		System.out.println("카카오톡 메세지 수신");
	}
	
	public void sedGift() {
		System.out.println("카카오톡 선물전송");
	}
	
}
