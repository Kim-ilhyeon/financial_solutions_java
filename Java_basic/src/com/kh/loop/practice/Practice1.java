package com.kh.loop.practice;

import java.util.Scanner;

public class Practice1 {

	/*
	[구구단]
	정수 N(1 ≤ N ≤ 9)이 주어졌을 때, N 단 구구단을 1부터 9까지 출력하는 프로그램을 작성하세요.
	출력 형식은 N * i = 결과이며, 각 줄마다 i가 1부터 9까지 하나씩 증가합니다. 공백과 기호 표현에 주의하세요
	
	(입력 조건)
	첫째 줄에 정수 N이 주어집니다. (1 ≤ N ≤ 9)
	
	(출력 조건)
	1부터 9까지의 i에 대해, 아래 형식으로 각 줄마다 출력합니다:
	
	ex)
		입력 : 2
		출력 : 
		2 * 1 = 2
		2 * 2 = 4
		2 * 3 = 6
		2 * 4 = 8
		2 * 5 = 10
		2 * 6 = 12
		2 * 7 = 14
		2 * 8 = 16
		2 * 9 = 18
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("입력 : ");
		int num = sc.nextInt();
		
		for (int i = 1; i <= 9; i++) {
			System.out.println(num + " * " + i + " = " + (num*i));
		}
		

	}

}
