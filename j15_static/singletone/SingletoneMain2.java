package j15_static.singletone;

public class SingletoneMain2 {

	public static void main(String[] args) {
		Kia2 kia = Kia2.getinstance();
		System.out.println(kia.produceCar2("k3"));
		
	}
}