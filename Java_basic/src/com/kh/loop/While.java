package com.kh.loop;

import java.util.Scanner;

public class While {

	/*
	 * while문
	 * 
	 * -표현식-
	 * while(조건식) {
	 * 		반복할 코드
	 * 		+ 탈출이 가능한 구조를 만들어줘야 함.
	 * }
	 * 
	 * => 반복할 횟수가 정해져 있는 경우에는 for문을 주로 사용.  /  반복할 횟수가 정확하지 않을 경우에는 while문을 주로 사용.
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		/*
		for (int i = 0; i < 10; i++) {
			System.out.println("안녕하세요.");
		}
		
		
		int i = 0;	// 조건식에 사용할 값이 있어야 함.
		while(i < 10) {
			System.out.println("안녕하세요.");
			i++;	// 조건에 영향을 주는 증감
		}
		*/
		
		/*
		// 사용자가 0을 입력할 때까지 반복해서 입력받아 그대로 출력
		int inpNum = 1;
		while(inpNum != 0) {
			System.out.print("정수 입력 : ");
			inpNum = sc.nextInt();
			System.out.println(inpNum);
		}
		*/
		
		/*
			랜덤 값 (1 ~ 100) 하나 생성
			1 ~ 랜덤 값까지의 합을 while문을 사용하여 출력
			
			[console]
			랜덤 값 : n
			1 ~ n까지의 합 : xxx
		*/
		
		int rd = (int)(Math.random() * 100) + 1;
		System.out.println("랜덤 값 : " + rd);
		
//		int sum = 0;
//		int i = 1;
		int sum = 0, i = 1;	// 위에 코드 2줄을 1줄로 한번에 가능하다.
		while(i <= rd) {
			sum += i;
			i++;
		}
		
		System.out.println("1 ~ " + rd + "까지의 합 : " + sum);
		
		
		
		
		
		
		

	}

}
