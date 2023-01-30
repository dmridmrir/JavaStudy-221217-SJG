package j12_다형성2;

public class Facebook implements Messenger{

	@Override
	public void send() {
		System.out.println("페이스북 메세지 송신");
	}

	@Override
	public void receive() {
		System.out.println("페이스북 메세지 수신");
	}
	
	public void call() {
		System.out.println("페이스북 전화연결");
	}
	
}
