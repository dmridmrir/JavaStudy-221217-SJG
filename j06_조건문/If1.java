package j06_조건문;

public class If1 {

	public static void main(String[] args) {
		boolean money = true;
		if(money) {
			System.out.println("택시를 타고가라");
		}else {
			System.out.println("걸어가라");
		}

		boolean money2 = false;
		if(money2)
			System.out.println("택시를 타고가라");
		if(!money2) {
			System.out.println("걸어가라");
		}
	}

}
