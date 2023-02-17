package j17_collection.hashMap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

public class Dictionary2 {

	public static void main(String[] args) {
		Map<String, String> dict = new HashMap<String, String>();
		Scanner scanner = new Scanner(System.in);
		String text = null;
		
		
		while(true) {
			dict.put("축구", "soccer");
			dict.put("농구", "basketball");
			dict.put("야구", "baseball");
			dict.put("배구", "volleyball");
			
			System.out.println("사전 검색");
			System.out.print("검색어 = ");
			
			text = scanner.nextLine();
			
			
			Iterator<String> irKey = dict.keySet().iterator();
//			iterator = list가 아닌 변수를 list처럼 줄세우기

			if(dict.containsKey(text)) {
				System.out.println(text + " = " + dict.get(text));
			}
		}
		
		

	}
	
	

}
