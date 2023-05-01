package quiz;

import lombok.Data;

@Data

public class BinarySearchAlgorithm {
	public BinarySearchAlgorithm(int[] ary, int x) {}
	int BinarySearch(int[] ary, int x) {
		int first = 0;
		int last = ary.length-1;
		//중간값 찾기
		while(first <= last) {
			int middle = (first + last) / 2;
			//탐색범위 조정
			 if (ary[middle] < x) {
	                first = middle + 1;	
	            } else if (ary[middle] > x) {
	                last = middle - 1;
	            } else {
	                return middle;
	            }
		}
		return 0; //우너소가 없으면 0 반환
	}
}
