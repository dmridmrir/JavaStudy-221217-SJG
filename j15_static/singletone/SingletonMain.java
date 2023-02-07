package j15_static.singletone;

public class SingletonMain {

	public static void main(String[] args) {
//		Kia kia = new Kia(); 생성자가 private라 불가능
		
		Kia kia = Kia.getInstance();
		
		System.out.println(kia.produceCar("k3"));
		
		Kia kia2 = Kia.getInstance();
		
		System.out.println(kia.produceCar("k8"));
		
		
		Kia kia3 = Kia.getInstance();
		
		System.out.println(kia.produceCar("k5"));
		
		
		Kia kia4 = Kia.getInstance();
		
		System.out.println(kia.produceCar("k7"));
		
		
		Kia kia5 = Kia.getInstance();
		
		System.out.println(kia.produceCar("k9"));
		
		Test1 test1 = new Test1();
		Test2 test2 = new Test2();
		
	}

}
