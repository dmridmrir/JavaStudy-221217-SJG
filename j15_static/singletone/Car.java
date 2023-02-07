package j15_static.singletone;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@AllArgsConstructor
@Builder

public class Car {
	private int carNumber;
	private String company;
	private String model;
}
