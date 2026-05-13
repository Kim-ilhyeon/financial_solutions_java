package com.kh.operator;

public class Operator {

	/*
	 * 증감 연산자
	 * ++ : 변수에 담긴 값 1증가
	 * -- : 변수에 담긴 값 1감소
	 * 
	 * (증감연산자)변수 : 전위연산 -> "선 증감" 후 처리
	 * 변수(증감연산자) : 후위연산 -> 선 처리 "후 증감"
	 */
	public static void main(String[] args) {
		int num = 0;
		
		System.out.println(num++);	// 0출력, num의 값 : 1 -> num을 출력 후에 num의 값을 1증가.
		System.out.println(++num);	// 2출력, num의 값 : 2 -> num의 값을 1증가 후에 num을 출력.
		System.out.println(num--);	// 2출력, num의 값 : 1 -> num을 출력 후에 num의 값을 1감소.
		System.out.println(--num);	// 0출력, num의 값 : 0 -> num의 값을 1감소 후에 num을 출력.

	}

}
