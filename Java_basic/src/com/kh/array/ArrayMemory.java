package com.kh.array;

public class ArrayMemory {
	
	public static void main (String[] args) {
		int i = 10;
		int[] iArr = new int[5];
		
		System.out.println(iArr.hashCode());
		System.out.println(iArr);
		// 기본적으로 자바는 메모리의 주소를 직접 확인할 수 없다.
		// => 객체의 메모리 주소를 암호화한 해시 값을 .hashCode()로 가져올 수는 있다.
		
		double[] dArr = new double[3];
		System.out.println(dArr.hashCode());
		/*
		 * 리터럴 값을 바로 담을 수 있는 변수 -> 일반 변수
		 * 다른 메모리의 주소 값을 담고 있는 변수 -> 참조 변수
		 * 
		 * 기본 자료형 (원시 타입) : int, double, float, char, long . . .
		 * -> 실제 리터럴 값을 직접 담을 수 있는 변수타입
		 * 
		 * 그 외 객테형(참조 타입) : String Scanne, int[], dounble[] . . .
		 * -> 필요한 메모리의 크기가 가변적이기 때문에
		 */
		
		// iArr 전체 출력
		for (int num : iArr) {
			System.out.print(num + " ");
		}
		
		System.out.println();
		System.out.println("=====구분선=====");
		
		// dArr 전체 출력
		for (int j = 0; j < dArr.length; j++) {
			System.out.print(dArr[j] + " ");
		}
		System.out.println();

		/* 
		 * 배열 생성 시 따로 초기화 하지 않아도 기본 값이 담겨있음.
		 * Heap이라는 메모리 공간의 특성 상 빈 공간을 허용하지 않기 때문.
		 * -> 메모리가 할당될 때 JVM에서 기본 값으로 모두 초기화.
		*/
		
		System.out.println(iArr);	// 참조 변수 출력 시 자료형 + @ + 주소의 16진수 hash값
		/*
			iArr = null;				// 객체 타입의 참조변수에 빈 값을 표현할 때 null을 사용한다.
			System.out.println(iArr);	// 
			
			// . : 접근 연산자
			System.out.println(iArr.length);
			// NullPointException 이 발생함 -> 참조 변수가 가지고 있는 주소 값이 없을 경우에 발생.
		*/
		
		int[] arr = new int[5]; 	// index -> 0~4
		/*
			System.out.println(arr[5]);
			// ArrayIndexOutOfBoundsException -> 배열의 크기를 벗어난 index를 제시하면 발생하는 에러.
		*/
		
		// 배열의 가장 큰 단점.
		// - 배열은 한번 지정하면 크기 변경이 불가.
		System.out.println(arr.hashCode());
		arr = new int[10];
		System.out.println(arr.hashCode());
		// => 주소 값이 변경된 것을 확인할 수 있다. (수정이 불가하여 새로운 메모리 공간을 할당.)
		
		/*
		 * Heap메모리의 데이터 중 호출이 불가한 값 (연결이 끊긴 값)은 더이상 쓸모가 없다.
		 * -> 일정 시간이 지나면 Garbage Collection(가비지 콜렉터)가 알아서 회수한다.
		 * -> 자바에서의 "자돵 메모리 관리" 특징 : 개발자가 코드에 집중할 수 있게 해줌.
		 */
		
		arr = null;
		// 해당 메모리를 더 이상 사용하지 않음 -> 메모리 반환
		
		int[] arr4 = {1, 1, 1, 1, 1};
		int[] arr5 = {1, 1, 1, 1, 1};
		
		System.out.println(arr4 == arr5);
		// => false 출력됨. --> 각 참조 변수는 ==을 통해서 비교 시 주소 값을 비교하기 때문에
		
		arr4 = arr5;
		System.out.println(arr4 == arr5);
		// => true 출력됨. --> arr4의 주소 값을 arr5의 주소값을 대입하여 저장하였기 때문에
		// 각각의 참조 변수가 동일한 주소 값을 가지고 있을수 있음.
		
		arr4[0] = 100;
		arr5[1] = 200;
		for (int ar : arr4) {
			System.out.print(ar + " ");
		}
		System.out.println();

		for (int ar : arr5) {
			System.out.print(ar + " ");
		}
		System.out.println();
		
		
		
	}
	

}
