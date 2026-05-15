package com.kh.loop.practice;

import java.util.Scanner;

public class Practice3 {

	/*
	[A + B - 7]
	
	테스트 케이스(`T`)만큼 **두 정수 `A`와 `B`를 입력받아, 각각의 합을 출력**하는 프로그램을 작성하세요.
	단, 출력 형식은 `"Case #x: "` 뒤에 합을 붙여 출력해야 하며, `x`는 1부터 시작하는 **테스트 케이스 번호**입니다
	
	(입력 조건)
		첫째 줄 : 테스트 케이스 개수 T
		이후 T줄 : 각 줄에 정수 A, B입력 (공백으로 구분)
		
	(출력 조건)
	- 각 테스트 케이스마다 "Case #x: "를 앞에 붙이고, 그 뒤에 A + B 결과를 출력합니다.
	- x는 테스트 케이스 번호로, 1부터 차례대로 증가합니다.
	
	ex) 
	입력 : 
		3
		1 1
		2 3
		3 4
	출력 : 
		Case #1: 2
		Case #2: 5
		Case #3: 7
	
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int caseNum = sc.nextInt();
		int sum = 0;
		
		int[] sumL = new int[caseNum];
		
		for (int i = 1; i <= caseNum; i++) {
			int num1 = sc.nextInt();
			int num2 = sc.nextInt();
			
			sum = num1 + num2;
			sumL[i-1] = sum;
		}
		
		for (int j = 1; j <= caseNum; j++) {			
			System.out.println("Case #" + j + ": " + sumL[j-1]);
		}
		

	}

}
