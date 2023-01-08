package J04_문자열;

public class StringBuilder1 {

	public static void main(String[] args) {
		StringBuilder stringBuilder = new StringBuilder();
		
		System.out.println(stringBuilder);
		
		stringBuilder.append("이름 : ");
		stringBuilder.append("서정근");
		
		stringBuilder.delete(1, 2);
		
		
		System.out.println(stringBuilder.toString());
//		toString() 문자열로 출력
	}

}
