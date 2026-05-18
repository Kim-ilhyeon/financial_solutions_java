package com.kh.array.practice;

import java.util.Scanner;

public class Practice2 {

	/*
	 * [최소, 최대]
	 * N개의 정수가 주어질 때, 이들 중 최솟값과 최대값을 찾는 프로그램을 작성하세요.
	 * 
	 * (입력 조건)
	 * - 첫째 줄 : 정수의 개수 N (1 <= N <= 1000000)
	 * - 둘째 줄 : N개의 정수가 공백으로 구분되어 주어집니다. 각 정수는 -1000000이상 1000000이하
	 * 
	 * (출력 조건)
	 * - 첫째 줄에 최솟값과 최대값을 공백으로 구분하여 출력 합니다.
	 * 
	 * [console]
	 * (입력)
	 * 5
	 * 20 10 35 30 7
	 * 
	 * (출력)
	 * 7 35
	 * 
	 * (요구사항 요약)
	 * - 입력 받은 수들을 배열이나 반복문으로 처리
	 * - for 반복문을 통해 최소 및 최대값 갱신
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("입력 : ");
		int leng = sc.nextInt();
		int[] nArr = new int[leng];
		
		for (int i = 0; i < leng; i++) {
			int num = sc.nextInt();
			nArr[i] = num;
		}
		
		// 최솟값 구하기
		int min = 0;
		for (int i = 0; i < nArr.length-1; i++) {
			if (nArr[i] > nArr[i+1]) {
				min = nArr[i+1];
			} else {
				min = nArr[i];
			}
		}
		
		// 최대값 구하기
		int max = 0;
		for (int i = 0; i < nArr.length-1; i++) {
			if (nArr[i] > nArr[i+1]) {
				max = nArr[i];
			} else {
				max = nArr[i+1];
			}			
		}
		
		System.out.println("최솟값 : " + min);
		System.out.println("최대값 : " + max);
		

	}

}
