package j14_Lombok;

public class BuilderMain {

	public static void main(String[] args) {
		Builder builder = new Builder();
		Car car = builder.builder()
				.company("κΈ°μ")
				.model("k5")
				.color("white")
				.build();
		System.out.println(car);
		
		Car car2 = builder.builder()
				.company("νλ")
				.build();
		System.out.println(car2);
	}

}
