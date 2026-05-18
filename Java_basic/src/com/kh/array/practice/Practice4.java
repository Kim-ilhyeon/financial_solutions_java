package com.kh.array.practice;

import java.util.Scanner;

public class Practice4 {

	/*
	 * [과제 안 내신 분..?]
	 * 학생 30명이 있고, 28명이 과제를 제출했습니다.
	 * 제출하지 않은 2명의 출석번호를 오름차순으로 출력하는 프로그램을 작성하세요.
	 * 
	 * (입력 조건)
	 * - 28개의 줄에 서로 다른 출석번호 (1 ~ 30)이 주어집니다.
	 * 
	 * (출력 조건)
	 * - 과제를 제출하지 않은 학생 2명의 출석번호를 오름차순으로 한줄에 하나씩 출력합니다.
	 * 
	 * [console]
	 * (입력)
	 * 1
	 * 2
	 * . . .
	 * 28번까지 입력
	 * 
	 * (출력)
	 * 29
	 * 30
	 * 
	 * (요구사항 요약)
	 * - 크기 30의 boolean 또는 정수 배열 초기화
	 * - 입력 된 번호 인덱스에 표시
	 * - 반복문으로 1 ~ 30까지 순회하며 제출 안한 번호 출력
	 * 
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] submit = new int[28];
		boolean[] submitted = new boolean[30];
		
		System.out.println("입력 : ");
		for (int i = 0; i < submit.length; i++) {
			int num = sc.nextInt();
			submit[i] = num;
		}

		// 1부터 30까지 순회하면서 제출리스트와 비교하여 일치하는게 있으면 제출여부 리스트의 값을 true로 바꿔줌
		for (int i = 1; i <= 30; i++) {
			for (int ns : submit) {
				if (i == ns) {
					submitted[i-1] = true;
					break;
				}
			}
		}
		
		// 한번 검사를 한 제출여부 리스트에서 false인 값들의 index+1값을 출력 (출석번호는 index의 번호보다 1씩 높기 때문에)
		for (int j = 0; j < submitted.length; j++) {
			if (!submitted[j]) {
				System.out.println(j+1);
			}
		}
		
		

	}

}
