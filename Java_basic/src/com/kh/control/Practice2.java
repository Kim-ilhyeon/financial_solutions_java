package com.kh.control;

import java.util.Scanner;

public class Practice2 {

	/*
	 * 성별을 m/f(대소문자 상관x)로 입력받아 남학생인지 여학생인지 출력하는 프로그램
	 * 
	 * [console]
	 * 성별(m/f) : (키보드 입력)
	 * 
	 * 여학생입니다. / 남학생입니다. / 잘못 입력하였습니다.
	 * 
	 * 문자열.charAt(n); -> 문자열에서 n번째 글자만 추출 (char)
	 * 문자열.toLowerCase() -> 모든 문자열을 소문자로 변환
	 * 문자열.toUpperCase() -> 모든 문자열을 대문자로 변환
	 * 
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("성별(m/f) : ");
		char gender = sc.next().charAt(0);
		
		String result = "";
		
		if ((gender == 'M') || (gender == 'm')) {
			result = "남학생";
		} else if ((gender == 'F') || (gender == 'f')) {
			result = "여학생";
		} else {
			result = "x";
		}
		
		// 입력받은 값을 소문자로 변환해서 받은 다음에 비교하는 방법도 가능!!
//		System.out.print("성별(m/f) : ");
//		char gender = sc.next().toLowerCase().charAt(0);
//		
//		String result = "";
//		
//		if ((gender == 'm') {
//			result = "남학생";
//		} else if gender == 'f') {
//			result = "여학생";
//		} else {
//			result = "x";
//		}
		
		
		// 출력문 분기
		if (result == "x") {
			System.out.println("잘못 입력하였습니다.");
		} else {
			System.out.println(result + "입니다.");
		}
		

	}

}
