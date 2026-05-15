package com.kh.loop;

import java.util.Scanner;

public class Practice5 {

	/*
	 * 사용자가 0을 입력할 때까지 랜덤 값(1 ~ 100)을 하나씩 생성해서 모두 더한 값을 출력
	 * 
	 * [console]
	 * 숫자 입력(0 입력 시 종료) : (키보드 입력)
	 * 랜덤 값 누적 : ~~
	 * . . .
	 * 숫자 입력(0 입력 시 종료) : 0
	 * 랜덤 값 누적 : ~~
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		boolean bl = true;
		int sum = 0;
		
		while(bl) {
			System.out.print("숫자 입력(0 입력 시 종료) : ");
			int inp = sc.nextInt();
			
			int rd = (int)(Math.random() * 100) + 1;
			sum += rd;
//			System.out.println("뽑힌 랜덤 값 : " + rd);
			System.out.println("랜덤 값 누적 : " + sum);
			bl = (inp == 0) ? false : true;
		}
		

	}

}
