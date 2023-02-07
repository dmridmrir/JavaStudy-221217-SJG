package j17_collection.hashSet;

import java.util.HashSet;

public class StringHashSet {

	public static void main(String[] args) {
		HashSet<String> set = new HashSet<String>();
		
//		set은 우선순서가 없이 입력됨
//		중복 불가능
//		index가 없어서 get사용 불가능
		
		set.add("java");
		set.add("java");
		set.add("java");
		set.add("java");
		set.add("python");
		set.add("python");
		set.add("python");
		set.add("python");
		set.add("1");
		set.add("2");
		
		System.out.println(set);
		
		
	}

}
