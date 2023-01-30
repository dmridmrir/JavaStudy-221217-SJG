package j12_다형성2.연습;

public class MessengerMid {
	private Messenger2 messenger2;
	
	public MessengerMid(Messenger2 messenger2) {
		this.messenger2 = messenger2;
	}
	
	public void sendMessage() {
		messenger2.send();
	}
	public void receiveMessage() {
		messenger2.receive();
	}
	public void runAdd() {
		if(messenger2 instanceof Kakao) {
			Kakao kakao = (Kakao) messenger2;
			kakao.sendGift();
		}else if(messenger2 instanceof Instagram) {
			Instagram instagram = (Instagram) messenger2;
			instagram.like();
		}
	}
}
