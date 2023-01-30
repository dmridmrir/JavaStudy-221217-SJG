package j12_다형성.인터페이스;

public class ComputerMain {
	public static void main(String[] args) {
			Moniter moniter = new Moniter();
			Computer computer = new Computer(moniter);
			
//			computer.powerOn();
			
			for(int i = 0; i < 3; i ++) {
				computer.powerOn();
				try {
					Thread.sleep(5000);
				} catch (Exception e) {
					// TODO: handle exception
				}
				computer.powerOff();
			}
	}
}
