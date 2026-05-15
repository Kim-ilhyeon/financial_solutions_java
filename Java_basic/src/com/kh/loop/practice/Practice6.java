package com.kh.loop.practice;

import java.util.Scanner;

public class Practice6 {

	/*
	[짝수만 제곱 출력하기]
	사용자로부터 10개의 정수를 입력받아, **짝수일 경우에만 제곱을 출력**하는 프로그램을 작성하세요.
	단 홀수는 건너뛰고 출력하지 않습니다.
	
	(입력 조건)
		사용자로부터 정수 10개를 입력받습니다.
	
	(출력 조건)
		- 입력된 정수 중 짝수인 수만 `제곱` 형태로 출력하세요.
    	출력 형식은 `"짝수 X의 제곱은 Y입니다."`
    
    ex)
	    출력 : 
		    숫자 입력 : 3
			숫자 입력 : 10
			짝수 10의 제곱은 100입니다.
			숫자 입력 : 7
			숫자 입력 : 8
			짝수 8의 제곱은 64입니다.
			...
	
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < 10; i++) {
			System.out.print("숫자 입력 : ");
			int num = sc.nextInt();
			
			if (num % 2 != 0) {
				continue;
			}
			
			int result = num * num;
			System.out.println("짝수 " + num + "의 제곱은 " + result + "입니다.");
		}
		
		

	}

}
