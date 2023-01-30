package j07_반복문;

public class DoublieWhile2 {

	public static void main(String[] args) {
		int i = 0;
	

		
//		while(i < 4) {
//			i++;
//			System.out.println(i + "교시");
//			while(j < 50) {
//				j++;
//				System.out.println("\t"+ j + "분");
//				if(j == 50) {
//					System.out.println("\t10분 쉬는시간");
//					while(k < 10) {
//						k++;
//						System.out.println("\t" +k + "분");
//					}
//				}
//			}
//			j = 0;
//			k = 0;
//		}
		while(i < 4) {
			System.out.println(i + 1 + "교시");
			int j = 0;
			while(j < 60) {
				int k = 0;
				if(j < 50) {
					k = j + 1;
					System.out.println("\t" + k + "분");
				}else {
					if(j == 50) {
						System.out.println("\t10분 쉬는시간");
				}
				k = j - 50 + 1;
				System.out.println("\t" + k + "분");
			}
			j++;
		}
		i++;
	}
	}
}
