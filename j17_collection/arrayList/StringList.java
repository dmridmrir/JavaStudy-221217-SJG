package j17_collection.arrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StringList {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		
//		값추가
		
		list.add("java");
		list.add("python");
		list.add("c");
		
//		원하는 위치에 값 추가
		
		list.add(1, "css");
		list.add("html");
		
//		리스트 toString
		
		System.out.println(list);
		
//		리스트의 크기
		
		System.out.println(list.size());
		
//		리스트에서 해당 인덱스로 값 찾기
		
		String subjet = list.get(0);
		System.out.println(subjet);
		
//		리스트에서 인덱스 찾는 방법
		
		int finalindex = list.indexOf("python");
		System.out.println(finalindex);
		
//		해당 인덱스 위치의 값을 수정
		
		list.set(3, "c++");
		System.out.println(list);
		
//		
//		해당 리스트가 값을 포함하고 있는지 확인
		ArrayList<String> tempList = new ArrayList<String>();
		tempList.add("python");
		tempList.add("c++");
		tempList.add("spring");
		
		boolean contains = list.contains("java");
		System.out.println(contains);
		
		boolean containsAll = list.containsAll(tempList);
		System.out.println(containsAll);
		
//		다른 컬렉션의 데이터를 모두 추가
		list.addAll(tempList);
		System.out.println(list);
//		뒤에서 부터 채움 중복 
		
//		삭제
		list.remove("python");
		System.out.println(list);
		
		System.out.println(list.remove("python"));
		System.out.println(list);
		
//		삭제 인덱스값 이용
		list.remove(1);
		System.out.println(list);
		
//		list.removeAll(tempList);
//		System.out.println(list);
//		해당 temlist에 있었던 값들을 모두 지움
		
//		해당 컬렉션을 포함하는것을 제외하고 다 지움(거꾸로 지우기)
		list.retainAll(tempList);
		System.out.println(list);
		
//		리스트가 비었는지 확인
		System.out.println(list.isEmpty());
		
//		리스트 전체 비우기
		list.clear();
		System.out.println(list.isEmpty());
		
//		배열을 리스트로 만듦
		List<String> asList = Arrays.asList(new String[] {"java", "python", "c++", "html"});
		System.out.println(asList);
		
		list.addAll(asList);
		System.out.println(list);
		
		for(int i = 0; i < list.size(); i ++) {
			System.out.println(list.get(i));
		}
		
		System.out.println("<<< foreach >>>");
		for(String str : list) {
			System.out.println(str);
		}
		
		String roles = "User,Admin,Test_User";
//		,를 인식해서 배열에 입력
		String[] roleArray = roles.split(",");
		System.out.println(roleArray[0]);
		System.out.println(roleArray[1]);
		System.out.println(roleArray[2]);
//		배열을 리스트로 만듦
		Arrays.asList(roleArray);
		
		
		Arrays.asList(roleArray).forEach(arg -> {
			System.out.println("role : " + arg);
		});
		
		
	}

}
