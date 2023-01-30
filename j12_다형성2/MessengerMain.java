package j12_다형성2;

public class MessengerMain {
	public static void main(String[] args) {
		KakaoTalk kakaotalk = new KakaoTalk();
		Facebook facebook = new Facebook();
		
		Messenger messenger = facebook;
		
		MessengerMiddleware messengerMiddleware = new MessengerMiddleware(messenger);
		messengerMiddleware.sendMessage();
		System.out.println("메세지 전송완료");
		System.out.println();
		
		messengerMiddleware.receiveMessage();
		System.out.println("매세지 수신완료 ");
		System.out.println();
		
		messengerMiddleware.runAddOns();
		System.out.println("추가기능 실행완료");
	}
}
