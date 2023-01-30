package j12_다형성2.연습;

public class MessengerMain2 {

	public static void main(String[] args) {
		Kakao kakao = new Kakao();
		Instagram instagram = new Instagram();
		
		Messenger2 messenger2 = instagram;
		
		MessengerMid messengerMid = new MessengerMid(messenger2);
		
		messengerMid.sendMessage();
		messengerMid.receiveMessage();
		messengerMid.runAdd();
	}

}
