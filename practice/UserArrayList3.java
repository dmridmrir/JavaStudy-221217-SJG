package j17_collection.arrayList;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import javax.swing.plaf.synth.SynthOptionPaneUI;

import lombok.Data;

@Data

public class UserArrayList3 {
	
	private List<User3> userList;
	private Scanner scanner;
	
	public UserArrayList3() {
		userList = new ArrayList<User3>();
		scanner = new Scanner(System.in);
	}
	
	public void addUser() {
		String userName;
		String passWord;
		
		System.out.println("아이디 입력");
		userName = scanner.nextLine();
		
		System.out.println("비밀번호 입력");
		passWord = scanner.nextLine();
		
		if(userList.contains(userName)) {
			System.out.println("중복된 아이디입니다");
		}else {
			User3 user = User3.builder()
					.userName(userName)
					.passWord(passWord)
					.build();
			
			userList.add(user);
		}
		
	}
	public void printList(){
		for(User3 info : userList) {
			System.out.println("아이디 = " + info.getUserName());
			System.out.println("비밀번호 = " + info.getPassWord());
		}
	}
	public void deleteUser() {
		String userName;
		String passWord;
		
		System.out.println("아이디 입력");
		userName = scanner.nextLine();
		System.out.println("비밀번호 입력");
		passWord = scanner.nextLine();
		
		for(User3 info : userList) {
			if(info.getUserName().equals(userName)){
				if(info.getPassWord().equals(passWord)) {
					userList.remove(info);
					System.out.println("삭제완료");
				}
			}
		}
	}

	
	public static void main(String[] args) {
		UserArrayList3 userlist = new UserArrayList3();
		String select = null;
		
		while(true) {
			System.out.println("회원관리 시스템");
			System.out.println("1.회원 추가");
			System.out.println("2.회원 목록 출력");
			System.out.println("3.회원 삭제");
			
			select = userlist.getScanner().nextLine();
			
			if(select.equals("1")) {
				userlist.addUser();
			}else if(select.equals("2")) {
				userlist.printList();
			}else if(select.equals("3")) {
				userlist.deleteUser();
			}else {
				System.out.println("없는 기능");
			}
		}
		
		
	}

}
