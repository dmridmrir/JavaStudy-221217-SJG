package j11_상속.factory;

public class FactoryMain {

	public static void main(String[] args) {
		SamsungFactory samsungFactory = new SamsungFactory(1);
		
		SamsungFactory[] samsungfactories = new SamsungFactory[3];
		samsungfactories[0] = new SamsungFactory(1);
		samsungfactories[1] = new SamsungFactory(2);
		samsungfactories[2] = new SamsungFactory(3);
		
		LGFactory[] lgfactories = new LGFactory[3];
		lgfactories[0] = new LGFactory(1);
		lgfactories[1] = new LGFactory(2);
		lgfactories[2] = new LGFactory(3);
		
		System.out.println("삼성공장가동");
		for(int i = 0; i < samsungfactories.length; i ++) {
			samsungfactories[i].start();
		}
		System.out.println("삼성공장중지");
		for(int i = 0; i < samsungfactories.length; i ++) {
			samsungfactories[i].stop();
		}
		System.out.println("엘지공장가동");
		for(int i = 0; i < lgfactories.length; i ++) {
			samsungfactories[i].start();
		}
		System.out.println("엘지공장가동");
		for(int i = 0; i < lgfactories.length; i ++) {
			samsungfactories[i].stop();
		}
	}

}
