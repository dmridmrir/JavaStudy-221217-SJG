package j17_collection.hashSet;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;

import j15_static.Student;

public class StudentHashSet {

	public static void main(String[] args) {
		Student student1 = new Student("최연호");
		Student student2 = new Student("정예빈");
		Student student3 = new Student("박상훈");
		Student student4 = new Student("백가현");
		Student student5 = new Student("서정근");
		
		HashSet<Student> studentHashSet = new HashSet<Student>();

		Student[] students = {student1, student2, student3, student4, student5}; 		
		
		studentHashSet.addAll(Arrays.asList(students));
		
		System.out.println(studentHashSet);
		
		for(Student str : studentHashSet) {
			if(str.getName().equals("서정근")) {
				studentHashSet.remove(str);
				break;
			}
		}
		
//		Iterator<Student> ir = studentHashSet.iterator();
//		
//		while(ir.hasNext()) {
//			Student student = ir.next();
//			if(student.getName().equals("정예빈")) {
//				조건 순간에 객체를 찾아 지움
//				studentHashSet.remove(student);
//				break;
				
//				조건 순간에 범위를 지우는 방법
//				ir.remove();
//			}
//		}
		System.out.println(studentHashSet);
	}

}
