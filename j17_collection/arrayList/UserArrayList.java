package j17_collection.arrayList;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.jar.Attributes.Name;

import lombok.Getter;


@Getter

public class UserArrayList {
	private List<User> userList;
	private Scanner scanner;
	
	public UserArrayList() {
		userList = new ArrayList<User>();
		scanner = new Scanner(System.in);
	}
	
	public void addUser() {
		String username = null;
		String password = null;
		String name = null;
		String mail = null;
		
		
		System.out.println("아이디 : ");
		username = scanner.nextLine();
		System.out.println("비밀번호 : ");
		password = scanner.nextLine();
		System.out.println("이름 : ");
		name = scanner.nextLine();
		System.out.println("e-mail : ");
		mail = scanner.nextLine();
		
		User user = User.builder()
				.username(username)
				.password(password)
				.name(name)
				.email(mail)
				.build();
		
		userList.add(user);
		
		
//	위의 값들을 입력받아 User객체로 만들기 빌더사용
//		리스트에 저장
		
	}
	public void printList() {
		
		for(User info : userList) {
			System.out.println("아이디 = " + info.getUsername());
			System.out.println("비밀번호 = " + info.getPassword());
			System.out.println("이름 = " + info.getName());
			System.out.println("이메일 = " + info.getEmail());
		}
		
//		아이디 > xx 양식으로 출력
	}
	public void removeUser() {
		String username = null;
		String password = null;
		
		System.out.println("아이디 : ");
		username = scanner.nextLine();
		
		for(User info : userList) {
			if(info.getUsername().equals(username)){
				System.out.println("비밀번호 : ");
				password = scanner.nextLine();
				
				if(info.getPassword().equals(password)) {
					userList.remove(info);
					System.out.println("삭제완료");
					return;
				}else {
					System.out.println("비밀번호 불일치");
					return;
				}
			}
		}
		System.out.println("존재하지 않는 아이디");
//		아이디 입력 -> 비밀번호 확인 -> 일치하면 삭제
	}
	
	public static void main(String[] args) {
		

		/*
		 * 사용자관리프로그램
		 * 1.사용자 추가
		 * 2.사용자리스트 출력
		 * 3.사용자삭제
		 * 4.프로그램종료
		 */
		
		UserArrayList userArrayList = new UserArrayList();
		while(true) {
			String select = null;
			
			System.out.println("사용자관리프로그램");
			System.out.println("1.사용자 추가");
			System.out.println("2.사용자리스트 출력");
			System.out.println("3.사용자삭제");
			System.out.println("4.프로그램종료");
			
			select = userArrayList.getScanner().nextLine();
			
			if(select.equals("1")) {
				userArrayList.addUser();
			}else if(select.equals("2")) {
				userArrayList.printList();
			}else if(select.equals("3")){
				userArrayList.removeUser();
			}else if(select.equals("4")) {
				System.out.println("프로그램종료");
			}else {
				System.out.println("없는 번호");
			}
		}
	}

}
