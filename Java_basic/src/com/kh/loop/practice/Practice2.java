package com.kh.loop.practice;

import java.util.Scanner;

public class Practice2 {

	/*
	[영수증 계산기]
	영수증에 적힌 **총 구매 금액**이 실제 구매한 각 물건의 **가격 × 개수 합계**와 일치하는지 확인하는 프로그램을 작성하세요.
	총액이 정확하면 `"Yes"`, 그렇지 않으면 `"No"`를 출력합니다.
	
	(입력 조건)
		1. 첫째 줄: 영수증에 적힌 총 금액 `X` (정수)
		2. 둘째 줄: 구매한 물건의 **종류 수** `N` (정수)
		3. 이후 `N`줄: 각 줄마다 두 정수 `a`, `b`가 주어집니다.
		    - `a`: 물건의 가격
		    - `b`: 해당 물건의 구매 개수

	(제약 조건)
		- `1 ≤ N ≤ 100`
		- 금액과 개수는 모두 `1,000,000` 이하의 자연수 (정수)
		
	(출력 조건)
		- `a × b`의 합이 `X`와 같으면 `"Yes"` 출력
		- 그렇지 않으면 `"No"` 출력
		
	ex)
		입력 : 
			260000
			4
			20000 5
			30000 2
			10000 6
			5000 8
		출력 : 
			Yes
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int allPrice = sc.nextInt();
		int ea = sc.nextInt();
		int sum = 0;
		
		for (int i = 1; i <= ea; i++) {
			int price = sc.nextInt();
			int pEa = sc.nextInt();
			sum += (price * pEa);
		}
		
		if (allPrice == sum) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
		

	}

}
