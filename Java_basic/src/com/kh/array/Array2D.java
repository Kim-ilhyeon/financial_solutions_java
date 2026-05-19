package com.kh.array;

import java.util.Scanner;

public class Array2D {

	/*
	 * 2차원 배열
	 * : 자료형이 같은 1차원 배열의 묶음.
	 * 
	 * -표현식-
	 * int[][] arr = new int[행][열];		: ~열의 1차원 배열이 ~행만큼 존재한다.
	 * 
	 * 각 1차원 배열의 길이는 서로 달라도 된다.
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// 2차원 배열 선언 (1차원 배열의 참조변수 묶음을 참조하는 2차원 배열의 참조변수)
		// 자료형[][] 배열명;
		int[][] arr;
		arr = new int[2][3];
		// => arr이라는 참조변수에 2행3열의 메모리 구조가 할당됨. = 3개짜리 1차원 배열 2개가 생성됨.
		arr[0][0] = 1;
		arr[0][1] = 1;
		arr[0][2] = 1;
		arr[1][0] = 2;
		arr[1][1] = 2;
		arr[1][2] = 2;
		
		// 2차원 배열 전체 출력
		// 출력해야 하는 1차원 배열 -> arr[0], arr[1]
		/*
		for (int i = 0; i < arr[0].length; i++) {
			System.out.print(arr[0][i] + " ");
		}
		for (int i = 0; i < arr[1].length; i++) {
			System.out.print(arr[1][i] + " ");
		}
		*/
		for (int j = 0; j < arr.length; j++) {
			for (int i = 0; i < arr[j].length; i++) {
				System.out.print(arr[j][i] + " ");
			}
			System.out.println();
		}
		/*
		// 2차원 배열의 모든 요소를 탐색 --> 두 개의 for문을 통해서 탐색하면 된다.
			for (int i = 0; i < 2차원배열의length; i++) {
				for (int j = 0; j < 2차원배열[i].length; j++) {
					// 2차원배열[i][j];
				}
				// 1차원 배열 하나가 끝날때마다 실행할 코드
			}
		*/
		
		// 1차원 배열의 참조변수만 3개 먼저 생성
		arr = new int[3][];
		
		// 각각의 1차원 배열을 참조변수에 실제 배열 메모리를 생성
		arr[0] = new int[5];
		arr[1] = new int[2];
		arr[2] = new int[3];
		
		
	}

}
