package j04_문자열;

public class StringBuilder2 {

	public static void main(String[] args) {
		String names = "최연호님, 김소유님, 서정근님, 장나겸님";
		StringBuilder stringBuilder = new StringBuilder();
		
		stringBuilder.append(names.substring(0,3));
		stringBuilder.append("/");
		stringBuilder.append(names.substring(6,9));
		stringBuilder.append("/");
		stringBuilder.append(names.substring(12,15));
		stringBuilder.append("/");
		stringBuilder.append(names.substring(18,21));
		System.out.println(stringBuilder.toString());
		
		
		
//		int index = names.indexOf("님");
//		stringBuilder.append(names.substring( index - 3, index));
//		stringBuilder.append("/");
//		
//		index = names.indexOf("님", index + 1);
//		stringBuilder.append(names.substring( index - 3, index));
//		stringBuilder.append("/");
//		
//		index = names.indexOf("님", index + 1);
//		stringBuilder.append(names.substring( index - 3, index));
//		stringBuilder.append("/");
//		
//		index = names.indexOf("님", index + 1);
//		stringBuilder.append(names.substring( index - 3, index));
//		System.out.println(stringBuilder.toString());
		
		StringBuilder stringBuilder2 = new StringBuilder();
		stringBuilder2.append(names);
		
//		int index;
//		index = stringBuilder2.indexOf("님");
//		stringBuilder2.delete(index, index + 3);
//		index = stringBuilder2.indexOf("님");
//		stringBuilder2.delete(index, index + 3);
//		index = stringBuilder2.indexOf("님");
//		stringBuilder2.delete(index, index + 3);
//		index = stringBuilder2.indexOf("님");
//		stringBuilder2.delete(index, index + 3);
		
		stringBuilder2.delete(3, 6);
		stringBuilder2.delete(6, 9);
		stringBuilder2.delete(9, 12);
		stringBuilder2.delete(12, 15);
		System.out.println(stringBuilder2);
	}

}
