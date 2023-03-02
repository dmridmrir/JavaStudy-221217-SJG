package quiz;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FindAlphabet {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("소문자 단어 입력");
		
		String random = scanner.nextLine();
		StringBuilder stringBuilder = new StringBuilder();
		stringBuilder.append(random);

		for(int i = 0; i < 26; i ++) {
			System.out.println(random.indexOf((char) i + 97));
		}
	}

}
