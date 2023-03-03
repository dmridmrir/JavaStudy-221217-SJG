package quiz;

import java.util.Scanner;

public class CountWord {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		while(true) {
			System.out.println("문자열 입력");
			
			String sentense = scanner.nextLine();
			
			int count = 1;
			
			StringBuilder builder = new StringBuilder();
			builder.append(sentense);
			
			if(builder.indexOf(" ") == 0) {
				builder.delete(0, 1);
			}else if(builder.lastIndexOf(" ") == builder.length()) {
				builder.delete(builder.length()-1, 1);
			}
			
			
			for(int i = 0; i < builder.length(); i ++) {
				char chr = builder.charAt(i);
				String str = String.valueOf(chr);
				
				if(str.equals(" ")) {
					count += 1;
				}
				}
			System.out.println(count);
		}
		}

}
