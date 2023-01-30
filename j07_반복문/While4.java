package j07_반복문;

public class While4 {

	public static void main(String[] args) {
		int dans = 2;
		int times = 0;
		int ans = 0;
		
		while(dans < 9) {
			while(times < 9) {
				times++;
				ans = dans * times;
				System.out.println(dans + " x " + times + " = " + ans);
			}
			times = 0;
			dans++;
		}
	}

}
