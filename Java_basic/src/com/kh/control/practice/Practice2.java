package com.kh.control.practice;

import java.util.Scanner;

public class Practice2 {

	/*
	 * 1부터 6까지 눈이 있는 세 개의 주사위를 던졌을 때, 아래 규칙에 따라 상금을 계산하는 프로그램을 작성하세요.
	 * 
	 * 입력 조건 : 한 줄에 세 개의 정수 (각각 주사위 눈, 1 ~ 6) 공백으로 구분하여 입력.
	 * 
	 * (규칙)
	 * 1. 같은 눈이 세개 모두 같을 때 -> 10,000원 + (같은 눈 수) * 1,000원
	 * 2. 같은 눈이 세개만 같을 때 -> 1,000원 + (같은 눈 수) * 100원
	 * 3. 모두 다른 눈일 때 -> (최댓값) * 100원
	 * 
	 * [console]
	 * # 입력 : 
	 * 3 3 6
	 * # 출력 : 
	 * 1300
	 * 
	 * (요구사항)
	 * - if ~ else if ~ else 조건문을 사용하여 세 경우에 맞게 분기처리.
	 * - 세 개 주가위 값을 변수에 저장 한 뒤 비교.
	 * 
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("# 입력 :");
		
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int num3 = sc.nextInt();
		
		int prizeMoney = 0;
		
		if (num1 == num2 && num2 == num3) {	// 3개가 모두 같을 때
			prizeMoney = 10000 + num1 * 1000;
		} else if (num1 != num2 && num2 != num3 && num1 != num3) {	// 모두 다를 때
			/*
			 * [Math.max()함수 사용
			int maxInt = Math.max(num1, num2);
			maxInt = Math.max(num3, maxInt);
			*/
			
			// 삼항 연산자 사용
			int maxInt = num1 > num2 ? num1 : num2;
			maxInt = maxInt > num3 ? maxInt : num3;
			prizeMoney = maxInt * 100;
		} else {	// 두개만 같을 때
			if (num1 == num2) {				// 같은 수를 구하기 위한 분귀
				prizeMoney = 1000 + num1 * 100;
			} else if (num2 == num3) {
				prizeMoney = 1000 + num2 * 100;				
			} else {
				prizeMoney = 1000 + num3 * 100;								
			}
		}
		
		System.out.println("# 출력 : " + prizeMoney + "원");
		System.out.printf("# 출력 : %d원", prizeMoney);
		
		
	}

}
