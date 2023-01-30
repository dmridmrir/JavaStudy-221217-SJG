package j11_상속.factory;

public class FactoryMain5 {
	public static void main(String[] args) {
		
		Factory[] a = new Factory[20];
		
		for (int i = 0; i < a.length; i ++) {
			if(i % 2 == 0) {
				a[i] = new SamsungFactory((i / 2) + 1);
			}else {
				a[i] = new LGFactory((i / 2) + 1);
			}
		}
		
		
		
		System.out.println("모든공장가동");
		for (int j = 0; j < a.length; j ++) {
			a[j].start();
			if(a[j] instanceof SamsungFactory) {
				SamsungFactory samsungFactory = (SamsungFactory) a[j];
				samsungFactory.produceSP();
			}else {
				LGFactory lgFactory = (LGFactory) a[j];
				lgFactory.produceST();
			}
			a[j].stop();
			System.out.println();
		}
	}
}
