package com.kh.loop.practice;

import java.util.Scanner;

public class Practice5 {

	/*
	[누적 합 종료 조건]
	사용자에게 정수를 반복 입력받아 **총합을 누적 계산**하는 프로그램을 작성하세요.
	단, **음수를 입력하면 입력을 종료**하고, 마지막에 누적된 총합을 출력하세요.
	
	(입력 조건)
		사용자로부터 정수를 반복 입력 (음수 입력 시 종료)
		
	(출력 조건)
		최종적으로 입력된 수들의 합계를 출력하세요 (음수는 포함되지 않음)
	
	ex)
	출력 : 
		숫자 입력 : 5
		숫자 입력 : 10
		숫자 입력 : 3
		숫자 입력 : -1
		총합 : 18
		
	(요구 사항)
		- `Scanner`를 사용하여 사용자 입력을 받을 것
		- `while(true)`와 `break` 문을 사용하여 무한 루프 종료 구현
		
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int sum = 0;
		
		while(true) {
			System.out.print("숫자 입력 : ");
			int num = sc.nextInt();
			
			if (num < 0) {
				System.out.println("총합 : " + sum);
				break;
			}
			
			sum += num;
		}
		

	}

}
