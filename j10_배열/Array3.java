package j10_배열;

import j09_클래스.접근지정자.student.Student;

public class Array3 {
	public static void main(String[] args) {
		String[] name = {"최연호", "김민종", "김소유", "박상훈", "백가현"};
		int[] studentYears = {3,2,4,3,4};
		double[] scores = {75.9, 80.5, 85.7, 88.3, 78.5}; 
		
		for (int i = 0; i < 5; i ++) {
			System.out.println(name[i] + "\t" + studentYears[i] + "\t" + scores[i] + "점");
		}
		
		Student[] students = new Student[5];
		
		students[0] = new Student("홍길동", 3, 15, "부산", "01033004698");
		
		for(int i = 0; i < 5; i ++) {
			if(students[i] == null) {
				continue;
			}
			System.out.println("이름 : " + students[i].getName());
		}
	}
}