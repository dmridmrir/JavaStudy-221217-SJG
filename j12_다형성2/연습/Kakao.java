package j12_다형성2.연습;

public class Kakao implements Messenger2{

	@Override
	public void send() {
		System.out.println("카카오톡 매세지 송신");
	}

	@Override
	public void receive() {
		System.out.println("카카오톡 메세지 수신");
	}
	
	public void sendGift() {
		System.out.println("카카오톡 선물보내기");
	}

}
