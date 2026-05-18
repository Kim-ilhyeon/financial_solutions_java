package com.kh.array;

public class ArrayBasic {

	/*
	 * [변수] : 하나의 공간에 하나의 값을 담을 수 있음, 메모리 공간에 이름을 붙여서 사용.
	 * [배열]Array : 하나의 이름에 같은 타입인 여러 개의 값들을 저장할 수 있는 연속적인 메모리 공간
	 * 
	 * ?? 배열을 왜 사용합니까?
	 * => 변수만 사용하면 대량의 데이터를 보관하고자 할 때 각각의 변수를 따로 만들어서 관리해야 한다.
	 * 	  하지만 배열은 한번에 저장하여 관리할 수 있기 때문입니다.
	 */
	public static void main(String[] args) {
		// int형 변수 5개를 만들어서 0~4의 값을 각각 할당해라.
		int num1 = 0;
		int num2 = 1;
		int num3 = 2;
		int num4 = 3;
		int num5 = 4;
		
		int[] arr1 = new int[5];
		arr1[0] = 0;
		arr1[1] = 1;
		arr1[2] = 2;
		arr1[3] = 3;
		arr1[4] = 4;
		
		// 배열 선언 + 초기화
		int[] arr2 = {0, 1, 2, 3, 4};
		
		// 배열 사용법
		// 1. 선언 : 자료형[] 배열이름; -> 실제 배열 메모리의 주소값을 갖는 참조변수만 만들어진다.
		int[] arr3;
		
		// 2. 생성(메모리 할당) : 배열이름 = new 자료형[길이];
		arr3 = new int[10];		// 정수 10개를 저장할 공간을 생성
		
		// 반복문을 이용한 값 할당 : 1 ~ 10
		for (int i = 0; i < arr3.length; i++) {
			arr3[i] = i;
		}

		for (int i = 0; i < arr3.length; i++) {
			System.out.println(arr3[i]);
		}
		
		
		// for -each문 : 배열을 전체적으로 탐색할 때 쉽게 사용할 수 있는 문법
		/* 
			for (배열의 자료형 배열의 값을 받아줄 변수 : 배열명) {
				반복할 코드
			}
		*/
		for (int num : arr3) {
			System.out.println("num : " + num);
		}
		
		
		
		
	}

}
