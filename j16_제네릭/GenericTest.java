package j16_제네릭;

import lombok.Data;

@Data

public class GenericTest<T,E> {
	private T num;
//	private String data;
	private E data;
	
	
}
