package j06_조건문;

public class SwitchCase2 {

	public static void main(String[] args) {
		
		int score = 85;
		switch(score / 10) {
		case 10 :
		case 9 :
			System.out.println("A");
			break;
		case 8 :
			System.out.println("B");
			break;
		case 7 :
			System.out.println("C");
			break;
		case 6 :
			System.out.println("D");
			break;
		default :
			System.out.println("F");
		}
		
		boolean breakFlag = false;
		switch(score / 10) {
		case 10:
		case 9:
			System.out.println("A");
			if(breakFlag) {
				break;
			}
		case 8:
			System.out.println("B");
			if(breakFlag) {
				break;
			}
		case 7:
			System.out.println("C");
			if(breakFlag) {
				break;
			}
		case 6:
			System.out.println("D");
			if(breakFlag) {
				break;
			}
		default : 
			System.out.println("F");
		}
		
		
		
		
		
		
		
	}

}
