package j12_다형성2.연습;

public class Instagram implements Messenger2{

	@Override
	public void send() {
		System.out.println("인스타 메세지 송신");
	}

	@Override
	public void receive() {
		System.out.println("인스타 메세지 수신");
	}
	
	public void like() {
		System.out.println("좋아요 보내기");
	}

}
