package j20_예외처리;

public class ExceptionTest2 {
	
	public void printArray() throws Exception{
		
		int[] numArray = {1,2,3,4,5};
		for(int i = 0; i < 6; i ++) {
			System.out.println(numArray[i]);
		}
	}
}
