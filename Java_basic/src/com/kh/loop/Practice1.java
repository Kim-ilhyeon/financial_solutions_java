package com.kh.loop;

import java.util.Scanner;

public class Practice1 {
	
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
	
		/*
		 * 커피 주문 키오스크
		 * 
		 * [출력]
		 * 아메리카노(1,100원)를 몇 잔 구매 하시겠습니까? : (키보드 입력)
		 * 1잔 -> 1100원
		 * 2잔 -> 2200원
		 * 3잔 -> 3300원
		 * . . .
		 * n잔 -> xxxx원
		 * 결제하실 금액 xxxx원입니다.
		 */
		
		System.out.print("아메리카노(1,100원)를 몇 잔 구매 하시겠습니까? : ");
		int ea = sc.nextInt();
		int price = 0;
		
		for (int i = 1; i <= ea; i++) {
			price += 1100;
			System.out.println(i + "잔 -> " + price + "원");
			if (i == ea) {
				System.out.println("결제하실 금액은 " + price + "원입니다.");				
			}
		}
		
		
		// 1 ~ 100까지의 합을 구해라
		int sum = 0;
		for (int i = 1; i <= 100; i++) {
			sum += i;
		}
		System.out.println("1부터 100까지의 합 : " + sum);
		
		
		
	}

}
