package j09_클래스.생성자;

import j09_클래스.접근지정자a.TestA_2;
import j09_클래스.접근지정자b.TestB;

public class AccessModifierMain {

	public static void main(String[] args) {
		TestA_2 testA_2 = new TestA_2();
		
		//접근지정자 아무것도 명시안하면 default 설정
		//생성자는 기본적으로 public
		
		
		testA_2.testA2();
		
		TestB testB = new TestB();
		
	}

}
