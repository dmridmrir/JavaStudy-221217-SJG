package j19_익명클래스.람다식;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class DefaultFunction2 {

	public static void main(String[] args) {

		Runnable runnable = () -> {
			System.out.println("엄");
		};
		runnable.run();
		
		Supplier<String> supplier = () -> {
			String name = "준";
			return name;
		};
		System.out.println(supplier.get());
		
		Consumer<String> consumer = (name) -> {
			System.out.println("식");
		};
		
		consumer.accept("namasdsadas");
		
		Function<String, String> function = (name) -> {
			String name1 = "엄";
			return name1;
		};
		System.out.println(function.apply("fdafasf"));
		
		Predicate<String> predicate = (name) -> {
			if(name.equals("엄준식")) {
				return true;
			}else {
				return false;
			}
		};
		
		System.out.println(predicate.test("엄준식1"));
	}

}
