package j19_익명클래스.foreach;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class CollectionForEach {

	public static void main(String[] args) {
		List<String> strList = new ArrayList<String>();
		
		for(int i = 0; i < 26; i ++) {
			strList.add(Character.toString((char) (97 + i)));
		}
		System.out.println(strList);
		
		for(String str : strList) {
			System.out.println(str);
		}
		
		System.out.println("==========================================");
		
		strList.forEach(str -> {System.out.println(str);});

		
		System.out.println("==========================================");

		
		Consumer<String> consumer = str -> {
			System.out.println(str);
		};
		
		strList.forEach(consumer);
		
//		map도 해보기
		
		
	}

}
