package j12_다형성.인터페이스;

/*
 * 인터페이스(상속 extend x 구현 implements)
 * -모든 메소드는 기본적으로 추상 메소드로 정의 abstract 사용x
 * -생성 불가능
 * -일반변수 선언 불가능 /초기화와 동시에 선언하여 static 상수로 선언
 * -반환 자료형 앞에 default 입력하여 일반메소드 정의 ( ex. public default void disconnect(); )
 * -다중구현 가능 (중요)
 */


public interface HDMI {
	public void connect();
	public void disconnect();
	
//	public int number;
//	public int NUMBER = 10;
}
