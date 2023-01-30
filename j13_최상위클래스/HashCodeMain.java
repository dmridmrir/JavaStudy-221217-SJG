package j13_최상위클래스;

public class HashCodeMain {

//	10진수로 주소를 나타내줌
	
	public static void main(String[] args) {
		Student student = new Student(20230001, "서정근");
		Student student2 = new Student(20230001, "서정근");
		Student student3 = new Student(20230002, "서정근");
		
		System.out.println(student.hashCode());
		System.out.println(student2.hashCode());
		System.out.println(student3.hashCode());
	}

}
