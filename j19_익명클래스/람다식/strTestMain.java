package j19_익명클래스.람다식;

import java.util.function.Function;

public class strTestMain {

	public static void main(String[] args) {
//		익명클래스 사용
		strTest name = new strTest() {
			
			@Override
			public String test(String str) {
				return str;
			}
		};
		
		System.out.println(name.test("서정근"));
			
		
//		람다사용
		strTest name2 = (str) -> str + "님";
		System.out.println(name2.test("서정근"));
		
		
		strTest strScore = (score) -> {
			if(score.equals("90")) {
				return "A";
			}else if(score.equals("80")) {
				return "B";
			}else {
				return "F";
			}
		};
		
		String myscore = strScore.test("80");
		System.out.println(myscore);
		
		Function<Integer, String> f = (num) -> Integer.toString(num);
		System.out.println(f.apply(100));
	}

}
