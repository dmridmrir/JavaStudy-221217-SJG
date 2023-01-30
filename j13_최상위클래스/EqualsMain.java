package j13_최상위클래스;

public class EqualsMain {

//	== 주소비교
//	=  값 비교
//	
	
	public static void main(String[] args) {
		Student s1 = new Student(20220001, "서정근");
		Student s2 = new Student(20220001, "서정근");
		Student s3 = new Student(20220002, "홍길동");
		Student s4 = new Student(20220002, "서정근");
		
		System.out.println(s1 == s2);
		
	}

}
