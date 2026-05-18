package com.kh.array.practice;

import java.util.Scanner;

public class Practice5 {

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
		
		// 바구니의 갯수를 담을 변수
		int pocketNum = sc.nextInt();
		// 바구니의 번호는 1 ~ N 순서대로 정해짐
		int[] pockets = new int[pocketNum];
		for (int i = 0; i < pocketNum; i++) {
			pockets[i] = i+1;
		}
		
		System.out.println("배열이 정확히 만들어졌는지 확인용");
		for (int ps : pockets) {
			System.out.print(ps + " ");
		}
		System.out.println();
		
		// 뒤집기 작업을 할 횟수를 담을 변수
		int flipNum = sc.nextInt();
		
		// 뒤집기 횟수만큼 반복문을 돌려서 시작번호와 끝번호를 입력 받아서
		for (int i = 0; i < flipNum; i++) {
			int firstNum = sc.nextInt();
			int lastNum = sc.nextInt();
			// 받을 때마다 길이가 (끝번호-시작번호+1)인 copy라는 배열을 만들어서 기존 배열의 시작번호부터 끝번호까지를 각각 복사
			int[] copy = new int[lastNum - firstNum + 1];
			for (int j = firstNum-1; j < lastNum; j++) {
				copy[j] = pockets[j];
			}

			System.out.println("반복문 중에 pocket 배열과 copy 배열 : ");
			for (int nt : pockets) {
				System.out.print(nt + " ");
			}
			System.out.println();
			for (int nt : copy) {
				System.out.print(nt + " ");
			}
			
			for (int j = firstNum-1, k = copy.length-1; j < lastNum; j++, k--) {
				pockets[j] = copy[k];
			}
			System.out.println("반복문 중에 pocket 배열과 copy 배열 : **뒤집기 후** ");
			for (int nt : pockets) {
				System.out.print(nt + " ");
			}
			System.out.println();
			for (int nt : copy) {
				System.out.print(nt + " ");
			}
		}
		
		// 기존배열의 시작번호부터 끝번호까지 반복하여 copy를 뒤집어서 값 초기화
		
		// for-each문 사용하여 기존배열을 공백포함하여 출력
		
	}

}
