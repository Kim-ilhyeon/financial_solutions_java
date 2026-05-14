package com.kh.control.practice;

import java.util.Scanner;

public class Practice3 {

	/*
	 * [놀이공원 입장권 계산기]
	 * 어린이, 청소년, 성인의 구분에 따라 입장료가 다르게 부과되는 놀이공원 요금 계산기를 만들어보세요.
	 * 또한, 주말에는 20% 할인이 적용됩니다.
	 * 
	 * 입력 조건 : 나이 (int), 요일 (문자열: "월", "화", . . ."일")
	 * 
	 * (요금표)
	 * 어린이 : 0 ~ 12 -> 5,000원
	 * 청소년 : 13 ~ 18 -> 7,000원
	 * 성인 : 19세 이상 -> 10,000원
	 * 
	 * 할인 조건 : 요일이 "토" or "일" 인 경우, 입장료의 20% 할인
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("나이를 입력하세요 : ");
		int age = sc.nextInt();
		
		System.out.print("요일을 입력하세요 : ");
		char day = sc.next().charAt(0);
		
		int price = 0;
		String gen = "";
		boolean saleStatus = false;
		String saleMsg = "(주말 할인 적용)";
		
		// 나이에 따른 세대 구분
		if ((age > 0) && (age <= 12)) {
			gen = "어린이";
			price = 5000;
		} else if (age <= 18) {
			gen = "청소년";
			price = 7000;
		} else {
			gen = "성인";
			price = 10000;
		}
		
		// 주말인지 여부에 따른 할인율 적용
		switch (day) {
		case '토', '일':
			saleStatus = true;
			price = price - (price * 20 / 100);
			break;
		default:
			saleStatus = false;				
		}
		
		if (saleStatus) {
			System.out.println(gen + "요금입니다." + saleMsg);
			System.out.println("최종 요금은 " + price + "원입니다.");						
		} else {
			System.out.println(gen + "요금입니다.");
			System.out.println("최종 요금은 " + price + "원입니다.");			
		}
		
		
	}

}
