package j09_클래스;

public class Computer {
	int year;
	String company;
	String cpu;
	int ram;
	String graphic;
	
	void showInfo() {
		System.out.println(year + " 제조 " + company + " 제작 " + cpu + ram + " 그래픽카드 " + graphic);
		System.out.println();
	}
	void removeRam(int gigabyte) {
		if(ram > 1) {
			ram -= gigabyte;
			if (ram < 1) {
				System.out.println("램은 최소 1기가 장착");
			}
		}else {
			System.out.println("램을 제거할 수 없음");
		}
	}
	
	void addRam(int gigabyte) {
		int overRam = ram;
		if(ram < 32) {
			ram += gigabyte;
			if(ram > 32) {
				overRam = ram - 32;
				System.out.println("램은 최대32기가" + overRam + "초과");
			}
		}else {
			System.out.println("랩 추가 불가");
		}
	}
}
