package com.kh.array.practice;

import java.util.Scanner;

public class Practice1 {

	/* 
	 * [x보다 작은 수]
	 * 정수 N개로 이루어진 수열A와 정수X가 주어집니다.
	 * 이때, 수열 A에서 X보다 작은 수를 모두 입력된 순서대로 공백 한 칸으로 구분하여 출력하는 프로그램을 작성하세요.
	 * 
	 * (입력 조건)
	 * - 첫째 줄 : 정수 N과 X (1 <= N, X <= 10000)
	 * - 둘째 줄 : 수열 A를 이루는 정수 N개 (각 원소는 1 이상 10000이사)
	 * 
	 * (출력 조건)
	 * - A에서 X보다 작은 수들을 입력된 순서대로 공백으로 구분해 출력합니다.
	 * 
	 * [console]
	 * (입력)
	 * 10 5
	 * 1 10 4 9 2 3 8 5 7 6
	 * 
	 * (출력)
	 * 1 4 2 3
	 * 
	 * (요구 사항 요약)
	 * - for 반복문으로 수열 A를 순회하며 조건 A[i] < X)일 경우 출력
	 * - 출력 간 구분에 주의 (공백처리)
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("입력 : ");
		int leng = sc.nextInt();
		int[] nArr = new int[leng];
		
		int standard = sc.nextInt();
		
		for (int i = 0; i < leng; i++) {
			int num = sc.nextInt();
			nArr[i] = num;
		}
		
		int sLeng = 0;
		
		for (int na : nArr) {
			if (standard > na) {
				System.out.print(na + " ");
			}
		}
		
		

	}

}
