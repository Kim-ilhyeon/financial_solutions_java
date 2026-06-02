package com.kh.example.api;

import java.util.Scanner;

public class TokenMenu {
	// 필드
	private Scanner sc = new Scanner(System.in);
	private TokenController tc = new TokenController();
	
	// 메소드
	public void mainMenu () {
		while (true) {
			System.out.println();
			System.out.println("1. 지정 문자열");
			System.out.println("2. 입력 문자열");
			System.out.println("9. 프로그램 끝내기");
			System.out.print("메뉴 번호 : ");
			int menuNum = sc.nextInt();
			sc.nextLine();
			
			switch (menuNum) {
			case 1 : 
				tokenMenu();
				break;
			case 2 : 
				inputMenu();
				break;
			case 9 : 
				System.out.println("프로그램을 종료합니다.");
				return;
			default :
				System.out.println("잘못 입력 하셨습니다. 다시 입력해주세요.");
			}
		}
		
	}
	
	public void tokenMenu() {
		String str = "J a v a P r o g r a m ";
		System.out.println("토큰 처리 전 글자 : " + str);
		System.out.println("토큰 처리 전 개수 : " + str.length());
		String token = tc.afterToken(str);
		System.out.println("토큰 처리 후 글자 : " + token.toString());
		System.out.println("토큰 처리 후 개수 : " + token.length());
		System.out.println("모두 대문자로 변환 : " + token.toUpperCase());
	}
	
	public void inputMenu() {
		System.out.print("문자열을 입력하세요 : ");
		String inputStr = sc.nextLine();
		
		String firstCap = tc.firstCap(inputStr);
		System.out.println("첫글자 대문자 : " + firstCap);
		
		System.out.print("찾을 문자 하나를 입력하세요 : ");
		char findChar = sc.nextLine().charAt(0);
		int findNum = tc.findChar(inputStr, findChar);
		
		System.out.println(findChar + "문자가 들어간 개수 : " + findNum + "개");
	}
	
	
	
}
