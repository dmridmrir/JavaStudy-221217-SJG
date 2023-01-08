package J04_문자열;

public class StringBuilder2 {

	public static void main(String[] args) {
		String names = "최연호님, 김소유님, 서정근님, 장나겸님";
		
		StringBuilder stringBuilder = new StringBuilder();
//		for(int i = 4; i <= 16; i += 6) {
//			stringBuilder.delete(i, i + 2);
//		}
		stringBuilder.delete(4, 6);
		stringBuilder.delete(10, 12);
		stringBuilder.delete(16, 18);
		
		System.out.println(stringBuilder.toString());
		
		
		StringBuilder stringBuilder2 = new StringBuilder();

	}

}
