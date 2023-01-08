package J04_문자열;

public class String1 {

	public static void main(String[] args) {
//		System.out.println("안녕하세요");
//		System.out.println("\"안녕\"하세요");
		
//		System.out.println("안녕\t 하세ㅛ");
		
//		String address = "부산시 진구 가야동";
		
//		int index = address.indexOf("시");
//		System.out.println(index);
//		
//		int index2 = address.indexOf("진");
//		System.out.println(index2);
		
		String address2 = "부산시 동래구 사직동";
		int index3 = address2.indexOf("동");
		System.out.println(index3);
		
//		int index4 = address2.lastIndexOf("동");
//		System.out.println(index4);
		
		String subAddress = address2.substring(0, 3);
		System.out.println(subAddress);
		
		String subAddress2 = address2.substring(0, 4);
		System.out.println(subAddress2);
		
		String subAddress3 = address2.substring(4);
		System.out.println(subAddress3);
//		indexOf 문자열에서 해당 문자열 값을 찾아 위치 알려줌
//		substring 문자열에서 범위 지정하여 문자열 잘라줌
		
		
		String test_add = "부산광역시 서구 부민동";
		int test = test_add.lastIndexOf(" ");
		int test2 = test_add.indexOf("부");
		System.out.println(test);
		System.out.println(test2);
		
		String ans = test_add.substring(0 , 8);
		System.out.println(ans);
		
		
		String replaceAddress = test_add.replace(' ', '-');
		System.out.println(replaceAddress);
		
		String replaceAddress2 = test_add.replaceAll(" 서", "-");
		System.out.println(replaceAddress2);
		
		
		
		String phoneNumbers = "010/3300/4698, 010/1234/5678";
		
		String replaceNum1 = phoneNumbers.replaceAll("010", "011");
		replaceNum1 = replaceNum1.replace('/', '-');
		replaceNum1 = replaceNum1.replace(',', '/');
		
		System.out.println(replaceNum1);
		
//		String replaceNum2 = phoneNumbers.replaceAll("010", "011")
//				.replaceAll(""', '-').repl
		
		
		


		
		
	}

}
