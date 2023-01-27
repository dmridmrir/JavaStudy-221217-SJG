package j11_상속.practice;

public class Kia extends Car{
	public Kia(int serialNum) {
		super(serialNum);
	}

	@Override
	public int getNum() {
		System.out.print("시리얼 번호 = ");
		return super.getNum();
	}
	
}
