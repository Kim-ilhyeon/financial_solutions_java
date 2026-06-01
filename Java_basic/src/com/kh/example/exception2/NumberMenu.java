package com.kh.example.exception2;

import java.util.Scanner;

public class NumberMenu {
	// 필드
	private Scanner sc = new Scanner(System.in);
	NumberController nc = new NumberController();
	
	
	//메소드
	public void menu() {
		System.out.print("정수1 입력 : ");
		int num1 = sc.nextInt();
		
		System.out.print("정수2 입력 : ");
		int num2 = sc.nextInt();
		sc.nextLine();
		
		try {
			boolean bl = nc.checkDouble(num1, num2);
			System.out.println(num1 + "은(는) " + num2 + "의 배수인가? : " + bl);
		} catch (NumRangeException e) {
			System.err.println("1부터 100 사이의 값이 아닙니다.");
			e.printStackTrace();
		}
	}
	
	
	
}
