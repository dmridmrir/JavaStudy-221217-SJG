package j11_상속.factory;

public class FactoryMain3 {

	public static void main(String[] args) {

		Factory[] factories = new Factory[4];
		factories[0] = new SamsungFactory(1);
		factories[1] = new LGFactory(1);
		factories[2] = new SamsungFactory(2);
		factories[3] = new LGFactory(2);
		
		SamsungFactory sFactory = new SamsungFactory(1);
		System.out.println(sFactory);
		
		System.out.println((Factory) sFactory);
		
		Factory f = sFactory;
		
		SamsungFactory sf = (SamsungFactory) f;
		
		Factory fa = new Factory(1);
		SamsungFactory sfa = (SamsungFactory) fa;
		sfa.start();
	}

}
