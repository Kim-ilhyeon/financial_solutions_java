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
		
		boolean[] submitted = new boolean[30];
		
		// 28번 반복하여 해당 submitted배열의 (번호 - 1)의 인덱스 값을 true로 바꿔줌
		for (int i = 0; i < 28; i++) {
			System.out.print("입력 : ");
			int num = sc.nextInt();
			submitted[num - 1] = true;
		}
		
		for (int i = 0; i < submitted.length; i++) {
			if (!submitted[i]) {
				System.out.println(i + 1);
			}
		}



		
		// 한번 검사를 한 제출여부 리스트에서 false인 값들의 index+1값을 출력 (출석번호는 index의 번호보다 1씩 높기 때문에)

		
		

	}

}
