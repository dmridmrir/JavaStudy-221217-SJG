package j05_입력;

import java.util.Scanner;

public class Input2 {

	public static void main(String[] args) {
		/*
		 * 
		 * 
		 * 이름 : 최연호	next()	변수명 : name
		 * 생일 : 624		nextInt()		 birth
		 * 주소 : 부산 진구 가야동 	nextLine()	address
		 * 연락처 : 010-3300-4698	next()	phone
		 * 
		 * 
		 * 사용자의 이름은 최연호이고 생일은 624입니다
		 * 주소는 부산진구 가야동에 거주중입니다
		 * 연락처는 010-33--04698
		 * 
		 */
		String name = null;
		String address = null;
		String phone = null;
		
		Scanner scanner = new Scanner(System.in);
		name = scanner.next();
		int birth = scanner.nextInt();
		scanner.nextLine();
		address = scanner.nextLine();
		phone = scanner.next();
		
		System.out.println("사용자의 이름은 " + name + " 이고 생일은 " + birth + "입니다");
		System.out.println("주소는 " + address + "에 거주중입니다");
		System.out.println("연락처는 " + phone);
	}

}
