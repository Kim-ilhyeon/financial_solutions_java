package com.kh.loop;

import java.util.Scanner;

public class For {
	
	/*
	 * 반복문 : 특정 코드를 여러번 반복해서 실행하고자 할 때 사용하는 제어문
	 * 
	 * for문, while문, do ~ while문
	 */
	public static void main(String[] args) {
		
		// 10번 "안녕하세요." 반복 출력
		for (int i = 0; i < 10; i++) {		// 변수i가 0 ~ 9일때까지 반복 => 10번 반복하게 됨.
			System.out.println("안녕하세요.");
		}
		
		// "안녕하세요."에서 한글자씩 떼서 출력
		String hello = "안녕하세요.";
		for (int i = 0; i < 6; i++) {
			System.out.println(hello.charAt(i));
		}
		
		// 1 ~ 5까지의 숫자를 순차적으로 출력 (ex) -> 1 2 3 4 5
		for (int i = 0; i < 5; i++) {
			// 마지막 5를 출력할 때에는 공백을 추가하지 않기 위한 분기
			if (i == 4) {				
				System.out.println(i+1);
			} else {
				System.out.print(i+1 + " ");				
			}
		}
		
		/*
		 * 블록 = { }
		 * 블록 scope : 자바의 지역변수
		 * - 특정 메서드나 블록({ }) 내부에서 선언하고 관리하는 변수
		 * - 해당 블록이 종료되면 블록내부의 변수도 사라짐.
		 * => 블록 안에서 선언한 변수나 메서드는 해당 블록이 종료되면 사라져서 사용할 수 없다.
		 */
		
		// 정수 n을 입력받아 1부터 n까지 1씩 증가시키면서 출력해라
		// [console]
		// 정수 입력 : n
		// 1 2 3 4 5 . . . n 
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 입력 : ");
		int num = sc.nextInt();
		
		for (int i = 0; i < num; i++) {
			// 마지막 n을 출력할 때에는 공백을 추가하지 않기 위한 분기
			if (i == (num - 1)) {				
				System.out.println(i+1);
			} else {
				System.out.print(i+1 + " ");				
			}
		}
		
		
	}

}
