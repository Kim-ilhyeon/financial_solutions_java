package com.kh.operator;

public class Operator2 {

	/*
	 * 산술 연산자
	 * +
	 * -
	 * *
	 * /
	 * %
	 * 
	 * 복합대입 연산자 : 산술 연산 후 대입 연산을 사용할 때에는 축약 가능하다.
	 * +=
	 * -=
	 * *=
	 * /=
	 * %=
	 */
	public static void main(String[] args) {
		int a = 5;
		int b = 12;
		
		System.out.println("a + b = " + (a + b));
		System.out.println("a - b = " + (a - b));
		System.out.println("a * b = " + (a * b)); // 0으로 나눌 시 에러 발생!!
		System.out.println("a / b = " + (a / b));
		System.out.println("a % b = " + (a % b));

		// a = a + b; == a += b;
		
	}

}
