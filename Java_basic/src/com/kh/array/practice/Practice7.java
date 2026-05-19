package com.kh.array.practice;

import java.util.Scanner;

public class Practice7 {

	/*
	 * [행렬 덧셈]
	 * 크기가 N x M인 두 정수행렬 A, B가 주어질 때, 두 행렬의 원소별 합을 구해 출력하세요.
	 * 
	 * (입력 조건)
	 * - 첫째 줄 : 정수 N, M (1 <= N, M <= 100)
	 * - 다음 N줄 : 행렬 A의 원소 M개
	 * - 다음 N줄 : 행렬 B의 원소 M개
	 * - 각 원소는 -100 ~ 100 사이의 정수
	 * 
	 * (출력 조건)
	 * - N줄에 걸쳐, 각 줄마다 M개의 정수를 공백으로 구분하려  A + B의 결과 행렬을 출력
	 * 
	 * [console]
	 * (입력)
	 * 3 3
	 * 1 1 1
	 * 2 2 2
	 * 0 1 0
	 * 3 3 3
	 * 4 4 4
	 * 5 5 100
	 * 
	 * (출력)
	 * 4 4 4
	 * 6 6 6
	 * 5 6 100
	 * 
	 * (요구사항 요약)
	 * - 2차우너 배열(또는 리스트)을 사용해 두 행렬을 입력받기
	 * - 이중 반복문으로 같은 위치의 원소끼리 더해 출력
	 * - 출력 시 공백 및 줄바꿈 형식으로 정확히 맞추기
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int row = sc.nextInt();	// 행 갯수 입력
		int col = sc.nextInt();	// 열 갯수 입력

		// 행과 열만큼의 2차원 배열 A와B 총 2개 생성
		int[][] aArray = new int[row][col];
		int[][] bArray = new int[row][col];
		
		// 배열 A 값을 입력 값으로 초기화
		for (int i = 0; i < aArray.length; i++) {
			for (int j = 0; j < aArray[i].length; j++) {
				int num = sc.nextInt();
				aArray[i][j] = num;
			}
		}
		
		// 배열 B 값을 입력 값으로 초기화
		for (int i = 0; i < bArray.length; i++) {
			for (int j = 0; j < bArray[i].length; j++) {
				int num = sc.nextInt();
				bArray[i][j] = num;
			}
		}
		
		// 배열의 같은 값끼리 더하여 넣을 2차원 배열 하나를 더 만들기
		int[][] sArray = new int[row][col];
		
		// 중첩 반복문으로 합을 각 인덱스에 값 초기화
		for (int i = 0; i < sArray.length; i++) {
			for (int j = 0; j < sArray[i].length; j++) {
				sArray[i][j] = aArray[i][j] + bArray[i][j];
			}
		}
		
		// 합계 2차원 배열 전체 출력
		for (int i = 0; i < sArray.length; i++) {
			for (int j = 0; j < sArray[i].length; j++) {
				System.out.print(sArray[i][j] + " ");
			}
			System.out.println();
		}
		

		
		
	}

}
