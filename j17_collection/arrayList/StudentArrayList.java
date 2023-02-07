package j17_collection.arrayList;

import java.util.ArrayList;
import java.util.Arrays;

import javax.management.relation.Role;

import j15_static.Student;

public class StudentArrayList {

	public static void main(String[] args) {
		Student student1 = new Student("서정근1");
		Student student2 = new Student("서정근2");
		Student student3 = new Student("서정근3");
		Student student4 = new Student("서정근4");
		Student student5 = new Student("서정근5");
		/*
		 * student배열 생성 후 위의 학생 넣고 리스트로 전환후 arraylist를 이용해 studentlist이름의 리스트 생성
		 */
		ArrayList<Student> studentList = new ArrayList<Student>();
		Student[] students = {student1, student2, student3, student4, student5};
		
		studentList.addAll(Arrays.asList(students));
		System.out.println(studentList);
		
		for(Student student : studentList) {
			System.out.println(student);
		}
		/*
		 * 학생이름이 서정근3인 객체 찾아서 출력하고 삭제
		 */
//		int i = 0;
//		while(i < studentList.size()) {
//			Student a = studentList.get(i);
//			if(a.getName() == "서정근3") {
//				System.out.println(a);
//				studentList.remove(i);
//				break;
//			}i++;
//		}
//		System.out.println(studentList); - 내 정답
		
		
//		for(Student str : studentList) {
//			if(str.getName().equals("서정근2")) {
//				System.out.println(str);
//				int a = studentList.indexOf("str");
//				studentList.remove(a);
//			}
//		}
//		System.out.println(studentList);
		
	}
}
