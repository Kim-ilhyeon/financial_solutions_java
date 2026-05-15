package com.kh.loop;

import java.util.Scanner;

public class Practice4 {
	
	public static void main (String[] args) {
		// 문자열.length() -> 문자열의 길이를 반환하는 함수(메소드)
		
		/*
		 * 사용자에게 문자열을 입력받아 해당 문자열의 짝수자리 글자만 출력.
		 * [console]
		 * 문자열 입력 : (키보드 입력)
		 * ex) Hello
		 * el
		 */
		Scanner sc = new Scanner(System.in);
		
		System.out.print("문자열 입력 : ");
		String inp = sc.nextLine();
		
		int leng = inp.length();
		
		for (int i = 0; i < leng; i++) {
			if (i % 2 != 0) {
				System.out.print(inp.charAt(i));
			}
		}
		System.out.println();
		
		
	}

}
