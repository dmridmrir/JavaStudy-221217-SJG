package J01_출력;

public class Myinfo {

	public static void main(String[] args) {
		char name1 = '서';
		char name2 = '정';
		char name3 = '근';
		
		int birth = 119;
		
		String address = "부경대학교";
		
//		crtl + space : 자동완성
//		sysout + 자동완성 -> 		System.out.println();
		System.out.print("이름 = ");
//		System.out.println(name1 + name2 + name3);
		System.out.println("" + name1 + name2 + name3);
		System.out.print("생일 : ");
		System.out.println(birth);
		System.out.print("주소 : ");
		System.out.println(address);
	}

}
