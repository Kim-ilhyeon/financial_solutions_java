package com.kh.array.practice;

import java.util.Scanner;

public class Practice8 {

	/*
	 * [2차원 배열의 최댓값 찾기]
	 * N x M크기의 2차원 배열이 주어질 때, 배열에 포함된 가장 큰 값과 그 값이 위치한 행 번호와 열 번호를 출력하세요.
	 * (행 번호와 열 번호는 1부터 시작합니다.)
	 * 
	 * (입력 조건)
	 * - 첫째 줄 : 정수 N, M (1 <= N, M <=100)
	 * - 다음 N줄 : 각 줄에 M개의 정수 (-1000 ~ 1000 사이의 정수)
	 * 
	 * (출력 조건)
	 * - 첫째 줄 : 배열의 최댓값
	 * - 둘째 줄 : 최댓값이 위치한 행 번호와 열 번호를 공백으로 구분해 출력
	 * - 최댓값이 여러 개일 경우, 가장 앞에 나오는 위치 (행 우선, 그 다음 열 우선)를 출력
	 * 
	 * [console]
	 * (입력)
	 * 3 4
	 * 3 29 38 12
	 * 6 7 15 2
	 * 13 9 25 33
	 * 
	 * (출력)
	 * 38
	 * 1 3
	 * 
	 * (요구사항 요약)
	 * - 2차원 배열 입력 받기
	 * - 전체를 탐색하며 최댓값과 위치 저장
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int row = sc.nextInt();
		int col = sc.nextInt();
		
		int[][] dArray = new int[row][col];
		
		for (int i = 0; i < dArray.length; i++) {
			for (int j = 0; j < dArray[i].length; j++) {
				int num = sc.nextInt();
				dArray[i][j] = num;
			}
		}
		
		int max = dArray[0][0];
		int rIndex = 0;
		int cIndex = 0;
		
		for (int i = 0; i < dArray.length; i++) {
			for (int j = 0; j < dArray[i].length; j++) {
				if (max > dArray[i][j]) {
					max = max;	
				} else {
					max = dArray[i][j];
					rIndex = i+1;
					cIndex = j+1;
				}
			}
		}
		
		// 최댓값 출력
		System.out.println(max);
		
		// 최댓값 당시에 인덱스 값
		System.out.println(rIndex + " " + cIndex);
		
		
		
		
		
		
		
		

	}

}
