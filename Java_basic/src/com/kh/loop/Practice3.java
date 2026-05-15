package com.kh.loop;

// java.lang.~~에 있는 기능들은 굳이 import를 하지 않아도 사용이 가능하다.
public class Practice3 {

	public static void main (String[] args) {
		/*
		 * 랜덤한 수를 생성할 때 사용하는 Math객체의 함수가 있음.
		 * => Math.random();
		 * : java.lang.Math 클래스에서 기본적으로 제공하는 함수
		 * 
		 * Math.random() -> 0.0 ~ 0.9999999 사이의 랜덤 값 반환
		 * => 기본적으로 컴퓨터는 랜덤 값을 구할 수 없기 때문에 '밀리 초 단위의 시간'을 사용하여 공식을 통해서 랜덤을 사용한다.
		 * 		(실시간으로 변하는 숫자를 이용하여 특정 규칙을 통해서 랜덤 값을 구한다.)
		 * 
		 * 최소 값 ~ 최대 값 랜덤 수 : (int)(Math.random() * (최대 값 + 1 - 최소 값)) + 최소 값
		 */
		
		/* 
		 * ============================================================
			random(1 ~ 100)한 숫자 n을 생성한 다음, 1부터 n까지의 합을 출력해라.
			[console]
			random 값 : n
			1 ~ n 까지의 합 : xxx
		 * =============================================================
		 */
		
		int rd = (int)((Math.random()) * 100) + 1;
		int sum = 0;
		
		for (int i = 1; i <= rd; i++) {
			sum += i;
		}
		
		System.out.println("random 값 : " + rd);
		System.out.println("1부터 " + rd + "까지의 합 : " + sum);

		System.out.println();
		
		System.out.printf("random 값 : %d\n", rd);
		System.out.printf("1부터 %d까지의 합 : %d", rd, sum);
		
	}

}
