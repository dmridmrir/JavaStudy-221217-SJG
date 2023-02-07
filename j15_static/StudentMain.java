package j15_static;

public class StudentMain {

	public static void main(String[] args) {
//		Student student = new Student("서정근");
//		System.out.println(student);
		
		Student[] student = new Student[10];
		for(int i = 0; i < student.length; i ++) {
			student[i] = new Student("서정" + (i + 1));
			System.out.println(student[i]);
		}
		
	}

}
