package com.kh.loop.practice;

import java.util.Scanner;

public class Practice8 {

	/*
	[별 피라미드 출력]
	
	사용자로부터 정수 N(1 ≤ N ≤ 20)을 입력받아, N층의 왼쪽 정렬된 별 피라미드를 출력하세요.
	
	(입력 조건)
		첫째 줄에 정수 N을 입력받음
	
	(출력 조건)
		- 입력된 `N`층만큼 별 을 출력
		- 각 층마다 별의 개수는 해당 층 수와 동일 (1층: ★, 2층: ★★, …)
	
	ex)
		출력 : 
			정수 입력 : 5
				
				*
				**
				***
				****
				*****
	
	(요구 사항)
		- 중첩된 `for`문 사용
		- 외부 반복문: 줄 수, 내부 반복문: 각 줄의 별 개수 출력
		- 줄마다 개행 포함
	
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 입력 : ");
		int num = sc.nextInt();
		System.out.println();
		
		for (int i = 1; i <= num; i++) {
			for (int j = 1; j <= i; j ++) {
				System.out.print("*");				
			}
			System.out.println();
		}
		
		
		

	}

}
