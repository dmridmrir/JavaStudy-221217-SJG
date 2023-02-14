package j17_collection.hashMap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Dictionary1 {

	public static void main(String[] args) {
		
//		List<String> arrayList = new ArrayList<String>();
		Map<String, String> dict = new HashMap<String, String>();
		
		Scanner scanner = new Scanner(System.in);
		String text = null;
		
		while(true) {
			System.out.println("[사전 검색 기능]");
			System.out.println("#프로그램 종료 명령 = exit");
			
			System.out.print("검색어 : ");
			text = scanner.nextLine();
			
			
			if(text.equals("exit")) {
				System.out.println("프로그램 종료");
				break;
			}else if(dict.containsKey(text)) {
				System.out.println(dict.get(text));
			}else {
				System.out.println("없는 단어");
			}
			dict.put("축구", "soccer");
			dict.put("야구", "baseball");
			dict.put("농구", "basketball");
			dict.put("골프", "golf");
			
			Iterator<String> irKey = dict.keySet().iterator();

		}
	}

}
