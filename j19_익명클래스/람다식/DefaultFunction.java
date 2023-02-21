package j19_익명클래스.람다식;

import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class DefaultFunction {

	public static void main(String[] args) {
		
		Runnable runnable = () -> {
			System.out.println("runnable 인터페이스 활용한 람다식");
			System.out.println("중괄호 안에 여러 실행문 작성 가능");
		};
		runnable.run();
		
		Supplier<Integer> supplier = () -> 100;
		Supplier<String> supplier2 = () -> {
			System.out.println("다른 실행문 작성 가능");
			String name = "서정근";
			return name;
		};
		System.out.println(supplier.get());
		System.out.println(supplier2.get());
		
		Consumer<String> consumer = (name) -> {
			System.out.println("이름 = " + name);
		};
		consumer.accept("서정근");
		
		Function<Integer, Integer> function = (num) -> num * num;
		System.out.println(function.apply(10));
		
		Predicate<String> predicate = (str) -> str ==null || str.isBlank();
		System.out.println(predicate.test(null));
		System.out.println(predicate.test("서정근"));
		System.out.println(predicate.test(" "));
		
//		파라미터가 하나거나 없는 것
		
		BiConsumer<Integer, Integer> biConsumer = (num1, num2) -> {
			System.out.println(num1 + num2);
		};
		biConsumer.accept(10, 20);
//		람다식에서 매개변수가 하나일 때는 괄호 생략 가능
		
		BiFunction<Integer, Integer, Integer> biFunction = (num1, num2) -> num1 * num2;
		System.out.println(biFunction.apply(10, 20));
		
		BiPredicate<String, String> biPredicate = (String1, String2) -> String1 == null && String2 ==null;
		System.out.println(biPredicate.test(null, null));
		
		BinaryOperator<Integer> operator = (num1, num2) -> num1 * num2;
		System.out.println(operator.apply(10, 2));
		
		
	}

}
