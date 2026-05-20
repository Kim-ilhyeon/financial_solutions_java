package com.kh.method;

public class MethodBasic {
	
	/*
	 * [메소드]
	 * : Class내부에 정의된 함수를 method라고 부름.
	 * - 특정 기능을 수행하는 코드블럭을 정의하고, 필요할 때 호출해서 재사용 가능.
	 * 
	 * (특징)
	 * 	1. 중복 코드 제거와 가독성
	 * 	2. 유지보수성이 향상됨.
	 * 	+. 하나의 함수에서는 한가지 기능만 동작하도록 설계해야됨.
	 * 
	 * -기본 구조-
	 * 
	 * [접근 제한자] [static] 반환형 메소드명 (매개변수) {
	 * 		// 함수에서 실행할 내용
	 * 		[return 값;]
	 * }
	 */
	
	// main 메소드 : 프로그램을 시작할 때 사용되는 메소드
	public static void main (String[] args) {
		System.out.println("프로그램 시작");
//		hiEveryone(12);
//		hiEveryone(20);
//		adder(12, 8);
//		adder(120, 20);
		System.out.println(adder(12, 8));
		System.out.println(adder(120, 20));
		System.out.println("프로그램 끝");
		System.out.println(square(3.15));
	}
	
	// 매개변수 : 함수가 수행할 기능에 필요한 값들을 외부로부터 전달받기 위한 변수
	public static void hiEveryone (int age) {
		System.out.println("좋은 아침입니다.");
		System.out.println("제 나이는 " + age + "살 입니다.");
	}
	
	// 반환형 : 함수의 결과로 돌려줄 값의 타입(자료형), 반환 값이 없을 시 void로 작성
	public static int adder (int num1, int num2) {
//		System.out.printf("%d + %d = %d \n", num1, num2, (num1 + num2));
		return (num1 + num2);
	}
	
	public static double square (double num) {
		return num * num;
	}

}
