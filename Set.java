package quiz;

import java.security.DrbgParameters.NextBytes;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Scanner;

import javax.lang.model.type.UnionType;

import lombok.Data;

@Data


public class Set {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("배열들의 크기 입력");
		int n = scanner.nextInt();
		
		int[] A = new int[n+1];
		int[] B = new int[n+1];
//		배열 생성
		int j = 0;
		while (j < n) {
			double rNum1 = Math.random();
			double rNum2 = Math.random();
			
			A[j] = (int)(rNum1*100);
			B[j] = (int)(rNum2*100);
//			A와 B에 0부터 100까지 정수 입력
			while(true) {
				if(A[j] == 0) {
					A[j] = (int)(Math.random() * 100);
				}else if(B[j] == 0) {
					B[j] = (int)(Math.random()*100);
				}else {
					break;
				}
			}
//			0인 데이터는 다시 0에서 100까지 무작위 정수 입력(반복)
			j++;
			A[n] = 0;
			B[n] = 0;
//			집합의 끝은 0으로 표기 
		}
		
		A = Arrays.stream(A).distinct().toArray();
		B = Arrays.stream(B).distinct().toArray();

		System.out.println("집합 A = " + Arrays.toString(A));
		System.out.println("집합 B = " + Arrays.toString(B));
		
//		합집합 구하기
		HashSet<Integer> union = new HashSet();
		for(int i = 0; i < A.length; i ++) {
			union.add(A[i]);
		}
		for(int i = 0; i < B.length; i ++) {
			union.add(B[i]);
		}
		Iterator<Integer> uni = union.iterator();
		while(uni.hasNext()) {
			int a = uni.next();
			if(a == 0) {
				uni.remove();
			}
		}
//		iterator는 순서없는 자료형에 순서를 부여해줌
//		hasnext는 iterator에 의해 정렬된 자료중 다음 자료가 있다면 true를 반환
//		next는 다음 인덱스로 넘어가는것 remove는 제거
	    System.out.println("두 집합의 합집합: " + union);
//	    A와 B의 인덱스 번호대로 값을 찾아 union이라는 이름의 hashset 객체에 저장
//	    hashset은 자료의 중복이 허용되지 않는 컬렉션 순서도 x
	        
	    
//	    교집합 구하기
	    HashSet<Integer> intersection = new HashSet<>();
	    for(int i = 0; i < A.length; i ++) {
	    	for(int k = 0; k < B.length; k ++) {
	    		if(A[i]==B[k]) {
	    			intersection.add(A[i]);
	    		}
	    	}
	    }
//	    반복문을 두번 중첩하여 A의 첫번째 인덱스 부터 마지막 인덱스까지를 B의 첫번쨰 인덱스부터 마지막까지
//	    하나하나 비교하여 같은 자료를 저장
	    Iterator<Integer> inter = intersection.iterator();
	    while(inter.hasNext()) {
			int b = inter.next();
			if(b == 0) {
				inter.remove();
			}
		}
	    System.out.println("두 집합의 교집합: " + intersection);
	    
//	    차집합 구하기
	    HashSet<Integer> same = new HashSet();
	    
	    HashSet<Integer> subtractionA = new HashSet();
	    for(int i = 0; i < A.length; i ++) {
	    	for(int k = 0; k < B.length; k ++) {
	    		subtractionA.add(A[i]);
	    		if(A[i] == B[k]) {
	    			subtractionA.remove(A[i]);
	    		}
	    	}
	    }
	    HashSet<Integer> subtractionB = new HashSet();
	    for(int k = 0; k < B.length; k ++) {
	    	for(int i = 0; i < A.length; i ++) {
	    		subtractionB.add(B[k]);
	    		if(B[k] == A[i]) {
	    			 same.add(B[k]);
	    		}
	    	}
	    }
	    subtractionA.removeAll(same);
	    subtractionB.removeAll(same);
//	    중첩 반복문으로 subtraction 리스트에 모든 원소를 담고 같은 원소는 same 리스트에 추가로 저장
//	    removeall 함수로 same 리스트와 같은 값을 모두 제거
//	    0도 중복이기에 0제거 구문 필요 x
	    

	    System.out.println("A의 차집합: " + subtractionA);
	    System.out.println("B의 차집합: " + subtractionB);
	}
}
