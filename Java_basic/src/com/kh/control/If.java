package com.kh.control;

import java.util.Scanner;

public class If {

	// 특정 코드를 선탯적으로 실행시키고 싶을 때 -> 조건문
	// 조건문 : 조건식을 통해 true 또는 false를 판단하고 true일 경우 그에 해당하는 코드를 실행한다.
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		/*
		 * if (조건식) {
		 * 		조건식이 참일 경우 실행할 코드
		 * }
		 */
		
		System.out.print("정수 입력 : ");
		int num = sc.nextInt();
		
		// 첫 번째 방법
		System.out.print("첫 번째 방법 -> ");
		if (num > 0) {
			System.out.println("양수입니다.");
		}
		if (num == 0) {
			System.out.println("0입니다.");
		}
		if (num < 0) {
			System.out.println("음수입니다.");
		}
		
		// 두 번째 방법
		System.out.print("두 번째 방법 -> ");
		if (num > 0) {
			System.out.println("양수입니다.");			
		} else {
			if (num == 0) {
				System.out.println("0입니다.");
			} else {
				System.out.println("음수입니다.");
			}
		}
		
		// 세 번째 방법
		System.out.print("세 번째 방법 -> ");
		if (num > 0) {
			System.out.println("양수입니다.");
		} else if (num == 0) {
			System.out.println("0입니다.");
		} else {
			System.out.println("음수입니다.");
		}

	}

}
