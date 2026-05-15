package com.kh.loop.practice;

public class Practice4 {

	/*
	[7의 배수 찾기]
	
	1부터 100 사이의 숫자 중에서 7의 배수만 출력하는 프로그램을 작성하세요.
	단, 짝수인 7의 배수는 건너뛰고, 출력에서 제외하세요.
	
	(입력 조건) : 입력 없음
	
	(출력 조건)
		1부터 100까지의 수 중에서 7의 배수이면서 홀수인 숫자만 출력하세요.
	
	ex)
		출력 : 7 21 35 49 63 77 91
	
	(요구 사항)
		- 반복문(`for` 또는 `while`)을 사용하여 1~100 범위를 순회할 것
		- `continue` 문을 사용하여 **조건에 맞지 않는 경우 건너뛰기**
		- 출력은 공백으로 구분
	 */
	public static void main(String[] args) {
		for (int i = 1; i <= 100; i++) {
			
			if ((i % 7 == 0) && (i % 2 != 0)) {
				if (i == 91) {
					System.out.print(i );								
				} else {
					System.out.print(i + " ");									
				}
			} else {
				continue;
			}
			
		}
		

	}

}
