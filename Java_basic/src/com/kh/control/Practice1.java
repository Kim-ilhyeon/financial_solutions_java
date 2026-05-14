package com.kh.control;

import java.util.Scanner;

public class Practice1 {

	/*
	 * 나이를 입력 받아서
	 * 13세 이하 : 어린이
	 * 14 ~19세 : 청소년
	 * 20세 이상 : 성인
	 * 
	 * [console]
	 * 나이 입력 : (키보드 입력)
	 * ~~세는 ~~에 속합니다.
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("나이 입력 : ");
		int age = sc.nextInt();
		
		String generation = "";
		
		if ((age > 0) && (age <= 13)) {
			generation = "어린이";
		} else if ((age > 0) && (age <= 19)) {
			generation = "청소년";
		} else if ((age > 0) && (age >= 20)) {
			generation = "성인";			
		} else {
			generation = "미존재";
		}
		
		System.out.println(age + "세는 " + generation + "에 속합니다.");
		System.out.printf("%d세는 %s에 속합니다.", age, generation);
		
	}

}
