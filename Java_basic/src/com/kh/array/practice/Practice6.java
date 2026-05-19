package com.kh.array.practice;

import java.util.Scanner;

public class Practice6 {

	/*
	 * [바구니 뒤집기]
	 * 1번부터 N번까지 번호가 순서대로 적힌 바구니가 있습니다.
	 * M개의 뒤집기 작업이 주어지며, 각각은 i번부터 j번 바구니의 순서를 역순으로 바꾸는 작업입니다.
	 * 모든 작업 후 최종 바구니의 번호 배열을 출력하세요.
	 * 
	 * (입력 조건)
	 * - 첫째 줄 : N (1 <= N <= 100), M (1 <= M <= 100)
	 * - 다음 M줄 : i j (1 <= i <= j <= N)
	 * 
	 * (출력 조건)
	 * - 작업 수행 후, 1번 바구니부터 N번 바구니에 쓰인 번호를 공백으로 구분하여 출력
	 * 
	 * [console]
	 * (입력)
	 * 5 4
	 * 1 2		2 1 3 4 5
	 * 3 4		2 1 4 3 5
	 * 1 4		3 4 1 2 5
	 * 2 2		3 4 1 2 5
	 * 
	 * (출력)
	 * 3 4 1 2 5
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int pNum = sc.nextInt();	// 바구니의 갯수
		int fNum = sc.nextInt();	// 뒤집기 작업을 할 횟수
		
		// 바구니 배열 만들고 1 ~ N까지의 값으로 초기화
		int[] pockets = new int[pNum];
		for (int i = 0; i < pockets.length; i++) {
			pockets[i] = i+1;
		}
		
		for (int k = 0; k < fNum; k++) {
			int i = sc.nextInt() - 1;	// i번째 바구니부터 -> index로 변경
			int j = sc.nextInt() - 1;	// j번째 바구니부터 -> index로 변경
		
			// i번째 바구니부터 j번째 인덱스 값까지 역순으로 정렬
			// 뒤에 값부터 순차적으로 앞으로 넣자!!
			// 앞에 값이 사라지기 전에 보관을 잠시 해야겠다.
			while (i < j) {
				int tmp = pockets[i];
				pockets[i] = pockets[j];
				pockets[j] = tmp;
				i++;
				j--;
			}
		}
		
		for (int ps : pockets) {
			System.out.print(ps + " ");
		}
		
		
		
		

	}

}
