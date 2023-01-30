package j11_상속.factory;

public class FactoryMain2 {

	public static void main(String[] args) {
//		업캐스팅 : 부모객체로 형변환
		Factory factory1 = new SamsungFactory(1);
		Factory factory2 = new LGFactory(1);
		
		Factory[] factories = new Factory[4];
		factories[0] = new SamsungFactory(1);
		factories[1] = new LGFactory(1);
		factories[2] = new SamsungFactory(2);
		factories[3] = new LGFactory(2);
		
		System.out.println("모든공장가동");
		for(int i = 0; i < factories.length; i ++) {
			factories[i].start();
		}
		System.out.println("모든공장중지");
		for(int i = 0; i < factories.length; i ++) {
			factories[i].stop();
		}
//			상속을 받아야 업캐스팅 가능
	}

}
