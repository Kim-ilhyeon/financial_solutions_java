package com.kh.exception;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Run {
	
	/*
	 * 에러의 종류
	 * - 시스템 에러 : 하드웨어/OS장애 -> 코드로 해결x
	 * - 컴파일 에러 : 문법오류 -> 개발자가 알아채고 수정하기 간단함.
	 * - 런타임 에러(=예외 exception) : 실행 중 발생, 개발자가 바로 처리해서 대응.
	 * - 논리 에러 : 실행은 정상적으로 되지만 결과가 의도와 다르게 나옴 -> 발견, 수정 어려움.
	 * 
	 * 예외처리를 하는 이유
	 * : 프로그램이 비정상적인 종료를 하면 안된다 -> (가용성을 유지하기 위해)복구 가능한 흐름으로 만들어서 사용자의 불편을 없애기 위해서.
	 * 
	 * 예외를 처리하는 방법
	 * 1. try ~ catch문을 이용		-> 직접 처리
	 * 2. throws를 이용			-> 위임
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		/*
//		try (Scanner sc = new Scanner(System.in)) {
		try {
			System.out.print("1번째 숫자 입력 : ");
			int num1 = sc.nextInt();
			System.out.print("2번째 숫자 입력 : ");
			int num2 = sc.nextInt();
			
			System.out.println("num1 / num2 = " + (num1 / num2));
		} catch (InputMismatchException e) {
			System.out.println("에러 발생");
		} catch (ArithmeticException e) {
			System.out.println("Error 원인 : " + e.getMessage());
		} finally {
			// try, catch여부와 상관없이 무조건 1번 실행되는 코드
			sc.close();
		}
		
		System.out.println("끝");
		*/
		
		RunException re = new RunException();
//		re.examException1();
		
//		re.examException2();
		
		try {
			re.methodA();
		} catch (IOException e) {
//			e.printStackTrace();
			System.out.println("IO 예외 발생 : " + e.getMessage());
		} catch (CustomException e) {
//			e.printStackTrace();
			System.out.println("커스텀 예외 발생 : " + e.getMessage());
		}
	}

}
