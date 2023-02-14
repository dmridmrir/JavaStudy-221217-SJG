package j17_collection.hashMap;

import java.util.HashMap;
import java.util.Iterator;

public class StringMap {

	public static void main(String[] args) {
		HashMap<Integer, String> strMap = new HashMap<Integer, String>();
		
//		add 대신 put 사용
//		key, value는 ,로 구분 
		strMap.put(1, "java");
		strMap.put(1, "java");
		strMap.put(1, "java");
		strMap.put(1, "java");
		
		
		strMap.put(1, "java1");
		strMap.put(1, "java2");
		strMap.put(1, "java3");
		strMap.put(1, "java4");
//		key중복불가
		
		strMap.put(20, "java1");
		strMap.put(30, "java2");
		strMap.put(40, "java3");
		strMap.put(50, "java4");
//		순서 x -inedx없음 - 반복불가능
		
		strMap.put(2, "java");
		strMap.put(3, "java");
		strMap.put(4, "java");
		strMap.put(5, "java");
//		value중복가능
		
		
//		System.out.println(strMap);
		
		Iterator<Integer> irKey = strMap.keySet().iterator();
		
		while(irKey.hasNext()) {
			System.out.println(strMap.get(irKey.next()));
		}
//		map은 foreach 사용 불가능 무조건 iterator사용
		
//		key값중 해당 key값이 있는지 보기
		
		System.out.println(strMap.containsKey(30));
		System.out.println(strMap.containsKey(15));
		
//		value값 중 해당 value값이 있는지 보기
		System.out.println(strMap.containsValue("java1"));
		
		
		
		
		
	}

}
