package com.kh.example.exception1;

import java.util.Scanner;

public class CharacterMenu {
	private Scanner sc = new Scanner(System.in);
	private CharacterController cc = new CharacterController();
	
	// 메소드
	public void menu() {
		System.out.print("문자열 : ");
		String str = sc.nextLine();
		
		try {
			int count = cc.countAlpha(str);
			System.out.println(str + "에 포함된 영문자 개수 : " + count);
		} catch (CharCheckException e) {
			System.out.println("체크할 문자열 안에 공백이 포함되어 있습니다.");
			e.printStackTrace();
		}
		
	}
}
