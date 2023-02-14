package j17_collection.arrayList;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import lombok.Getter;

@Getter

public class UserArrayList2 {
	private List<User2> userlist2;
	private Scanner scanner;
	
	public UserArrayList2() {
		userlist2 = new ArrayList<User2>();
		scanner = new Scanner(System.in);
	}
	public void addUser2() {
		String userName;
		String password;
		
		System.out.println("아이디 :");
		userName = scanner.nextLine();
		
		
		System.out.println("비밀번호 :");
		password = scanner.nextLine();
		
		
		User2 user = User2.builder()
				.userName(userName)
				.password(password)
				.build();
		userlist2.add(user);
		
	}
	public void printList2() {
		for(User2 info : userlist2) {
			System.out.println("아이디 = " + info.getUserName());
			System.out.println("비밀번호 = " + info.getPassword());
		}
	}
	public void removeUser2() {
		String userNmae;
		String password;
		
		System.out.print("아이디 = ");
		userNmae = scanner.nextLine();		
		System.out.print("비밀번호 = ");
		password = scanner.nextLine();
		
		for(User2 info : userlist2) {
			if(userNmae.equals(info.getUserName())) {
				if(password.equals(info.getPassword())) {
					userlist2.remove(info);
				}
			}else {
				System.out.println("아이디나 비밀번호가 일치하지 않습니다");
			}
		}
		
	}

	
	public static void main(String[] args) {
		/*
		 * 사용자관리프로그램
		 * 1.사용자 추가
		 * 2.사용자리스트 출력
		 * 3.사용자삭제
		 * 4.프로그램종료
		 */
		
		UserArrayList2 arrayList2 = new UserArrayList2();
		String select = null;
		
		while(true) {
			System.out.println("사용자관리프로그램");
			System.out.println("1.사용자 추가");
			System.out.println("2.사용자리스트 출력");
			System.out.println("3.사용자삭제");
			System.out.println("4.프로그램종료");
			
			select = arrayList2.getScanner().nextLine();
			
			if(select.equals("1")) {
				arrayList2.addUser2();
			}else if(select.equals("2")) {
				arrayList2.printList2();
			}else if(select.equals("3")) {
				arrayList2.removeUser2();
			}else if(select.equals("4")) {
				System.out.println("프로그램 종료");
			}else {
				System.out.println("잘못된 번호");
				break;
			}
		}
		
		
	}

}
