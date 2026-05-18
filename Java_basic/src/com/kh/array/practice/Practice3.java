package com.kh.array.practice;

import java.util.Scanner;

public class Practice3 {

	/*
	 * [공 넣기]
	 * N개의 바구니(1 ~ N번)가 있고, M개의 공 넣기 작업이 주어집니다.
	 * 각 작업은 u번 바구니부터 j번 바구니까지 숫자 k가 적힌 공을 넣는 것을 의미합니다.
	 * 그 후 각 바구니에 어떤 공이 들어 있는지 출력하세요. 공이 없는 경우 0으로 출력합니다.
	 * 
	 * (입력 조건)
	 * - 첫째 줄 : N(1 <= N <= 100), M(1 <= M <= 100)
	 * - 다음 M줄 : i j k (1 <= i <= j<= N, 1 <= l <= N)
	 * 
	 * (출력 조건)
	 * - 1번 바구니부터 N번 바구니까지 각 바구니에 들어있는 공의 번호를 공백으로 구분하여 출력 (공이 없는 경우 0)
	 * 
	 * [console]
	 * (입력)
	 * 5 4
	 * 1 2 3
	 * 3 4 4
	 * 1 4 1
	 * 2 2 2
	 * 
	 * (출력)
	 * 1 2 1 1 0
	 * 
	 * (요구사항 요약)
	 * - 배열을 0으로 초기화하여 바구니 상태 표현
	 * - 각 i-j 범위를 반복문으로 돌며 k를 채움
	 * - 마지막에 배열 출력
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("입력 : ");
		int pNum = sc.nextInt();
		int tNum = sc.nextInt();
		
		int[] pocket = new int[pNum];
		
		for (int i = 0; i < tNum; i++) {
			int firstNum = sc.nextInt();
			int lastNum = sc.nextInt();
			int kNum = sc.nextInt();
			
			for (int j = firstNum-1; j < lastNum; j++) {
				pocket[j] = kNum;
			}
		}
		
		for (int pn : pocket) {
			System.out.print(pn + " ");
		}
		

	}

}
