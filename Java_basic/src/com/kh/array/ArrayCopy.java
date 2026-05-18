package com.kh.array;

import java.util.Scanner;

public class ArrayCopy {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		int[] origin = {1, 2, 3, 4, 5};
		
		System.out.println("====원본 출력====");
		for (int or : origin) {
			System.out.print(or + " ");
		}
		System.out.println();
		
		// 주소 값 복사 ->origin을 단순 대입해서 copy배열 생성
		int[] copy = origin;
		
		System.out.println("====복사본 출력====");
		for (int cp : copy) {
			System.out.print(cp + " ");
		}
		System.out.println();
		
		copy[2] = 99;
		System.out.println("복사본 값 변경");
		
		System.out.println("====원본 출력2====");
		for (int or : origin) {
			System.out.print(or + " ");
		}
		System.out.println();
		
		// => copy배열의 값을 수정해도 원본의 값이 변경됨.
		// 왜? => origin과 copy는 참조 변수이고, 같은 메모리를 참고하고 있기 떄문에
		// 참조 변수의 주소 값이 동일.
		
		// 똑같은 배열을 따로 하나 만들고 싶을 때
		/*
		 * 1. for문 활용
		 * 새로운 배열을 만들어서 우너본 배열의 값을 하나하나 복사함.
		 */
		int[] origin2 = {1, 2, 3, 4, 5};
		
		int[] copy2 = new int[origin2.length];
		for(int i = 0; i < copy2.length; i++) {
			copy2[i] = origin2[i];
		}
		
		System.out.println("====원본2 출력====");
		for (int or2 : origin2) {
			System.out.print(or2 + " ");
		}
		System.out.println();
		
		System.out.println("====복사본2 출력====");
		for (int cp2 : copy2) {
			System.out.print(cp2 + " ");
		}
		System.out.println();
		
		copy2[2] = 99;
		
		System.out.println("====원본2 출력2====");
		for (int or2 : origin2) {
			System.out.print(or2 + " ");
		}
		System.out.println();
		
		System.out.println("====복사본2 출력2====");
		for (int cp2 : copy2) {
			System.out.print(cp2 + " ");
		}
		System.out.println();
		
		
		/*
		 * clone()
		 * java에서 제공하는 메소드(기능)
		 * : 배열의 모든 요소를 새로운 배열로 복사
		 */
		int[] origin3 = {1, 2, 3, 4, 5};
		int[] copy3 = origin.clone();	// origin3와 동일한 새로운 메모리를 만들어줌.
		

	}

}
