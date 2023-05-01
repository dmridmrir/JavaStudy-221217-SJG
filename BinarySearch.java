package quiz;

import java.util.Scanner;

public class BinarySearch {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("배열의 길이 입력");
		int n = scanner.nextInt(); //n = 배열의 길이
		int i;
		
		int ary[] = new int[n];
		
		for(i = 0; i < n; i ++) {
			System.out.println((i + 1) + "번째 값 입력");
			ary[i] = scanner.nextInt();
		}
		System.out.print("정렬 전 :");
		for(i = 0; i< n; i ++) {
			System.out.print(ary[i] + " ");
		}
		System.out.println();
		//배열생성 완료
		
		//삽입정렬 알고리즘
		
		for (i = 1; i < n; ++i) {
	        int now = ary[i];
	        int j = i - 1;

	        // ary의 요소 중 now보다 큰 값들을 오른쪽으로 이동시킨다.
	        while (j >= 0 && ary[j] > now) {
	            ary[j + 1] = ary[j];
	            j = j - 1;
	        }
	        // j+1 위치에 key 값을 삽입한다.
	        ary[j + 1] = now;
	    }
		System.out.print("정렬 후 :");
		for(i = 0; i< n; i ++) {
			System.out.print(ary[i] + " ");
		}
		System.out.println();
		//이진탐색 적용
		System.out.println("찾읗 숫자 입력");
		int x = scanner.nextInt();
		
		BinarySearchAlgorithm search = new BinarySearchAlgorithm(ary,x);
		int ans = search.BinarySearch(ary, x);
		
		if(ans == 0) {
			System.out.println("없는 숫자");
		}else {
			System.out.println(x + "는 배열의" + ans + "번째 index에 있음");
		}
	}

}
