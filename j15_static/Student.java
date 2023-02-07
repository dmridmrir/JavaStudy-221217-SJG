package j15_static;

import lombok.Data;

@Data

public class Student {
	public static int autocode = 20230000;
	
	private int studentCode;
	private String name;
	
	public Student(String name) {
		studentCode = ++autocode;
		this.name = name;
	}
}
