package quiz;

public class BubbleSort {

	public static void main(String[] args) {
		int ary[] = {3,2,4,1,5};
		
		for(int i = 0; i<ary.length - 1; i++) {
			for(int j = 0; j < ary.length - 1; j ++) {
				if(ary[j] > ary[j + 1]) {
					int temp = ary[j];
					ary[j] = ary[j + 1];
					ary[j + 1] = temp;
				}
			}
		}
		for(int i = 0; i < ary.length; i ++) {
			System.out.println(ary[i]);
		}
	}

}
