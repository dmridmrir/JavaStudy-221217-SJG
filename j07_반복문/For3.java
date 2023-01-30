package j07_반복문;

public class For3 {

	public static void main(String[] args) {
		String str = "abcdefghijk";
		
		for(int i = 0; i < str.length(); i++) {
			String index = str.substring(i, i + 1);
			System.out.println(index);
		}
	}

}
