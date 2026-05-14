package com.kh.control.practice;

import java.util.Scanner;

public class Practice1 {

	/*
	 * [시험 성적 출력 프로그램]
	 * 0점부터 100점 사이의 정수를 입력받아 아래 조건에 따라 등급(학점)을 출력하는 프로그램을 작성하세요.
	 * 
	 * 조건 : 시험 점수 (정수형, 0 이상 100 이하)
	 * 
	 * (기준)
	 * 90 ~ 100 -> A
	 * 80 ~ 89 -> B
	 * 70 ~ 79 -> C
	 * 60 ~ 69 -> D
	 * 0 ~ 59 -> F
	 * 
	 * [console]
	 * 점수를 입력하세요 : (키보드 입력)
	 * 당신의 성적은 ~입니다.
	 * 
	 * (요구사항)
	 * 조건문(if ~ else if ~ else문) 또는 (switch문)을 사용하려 등급 분기
	 * 입력 값이 0 ~ 100범위에 있는지 검사하지 않아도 됨 (문제에 보장되어 있음)
	 * 등급은 문자 or 문자열로 출력
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("점수를 입력하세요 : ");
		int score = sc.nextInt();
		
		char grade = 'F';
		
		if ((score >= 90) && (score <= 100)) {
			grade = 'A';
		} else if (score >= 80) {
			grade = 'B';
		} else if (score >= 70) {
			grade = 'C';
		} else if (score >= 60) {
			grade = 'D';
		} else {
			grade = 'F';
		}
		
		if (score < 0 || score > 100) {
			System.out.println("성적은 0 ~ 100점 사이 값으로 입력해주세요.");
		} else {
			System.out.println("당신의 성적은 " + grade + "입니다.");
			System.out.printf("당신의 성적은 %c입니다.", grade);
		}
		
		

	}

}
