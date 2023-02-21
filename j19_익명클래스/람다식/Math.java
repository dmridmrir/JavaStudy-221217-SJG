package j19_익명클래스.람다식;

@FunctionalInterface
//람다식을 쓰기위해 매서드를 하나만 쓸 떄 다는 어노테이션

public interface Math<T1,T2> {
	public double calc(T1 value1, T2 value2);
	
	
}
