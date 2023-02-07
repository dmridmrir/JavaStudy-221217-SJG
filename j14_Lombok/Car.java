package j14_Lombok;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data

public class Car {
	private String company;
	private String color;
	private String model;
	
}
