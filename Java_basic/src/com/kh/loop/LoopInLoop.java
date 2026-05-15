package com.kh.loop;

public class LoopInLoop {

	public static void main(String[] args) {
		// 규칙성을 가지고 반복하는 코드는 반복문을 활용할 수 있다.
		// -> 보통 반복문 내에 변수를 i, j, k, h 순서로 추가해서 사용한다. (권장 느낌)
		
		// 구구단
		for (int i = 2; i <= 9; i++) {
			for (int j = 1; j <= 9; j++) {
				System.out.println(i + " X " + j + "= " + (i*j));
			}
			System.out.println("==========");
		}
		

	}

}
