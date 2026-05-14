package com.kh.control;

import java.util.Scanner;

public class Switch {

	/*
	 * switch : 값이 정확하게 일치(동등비교)하는 경우 특정 코드를 실행.
	 * 비교 값으로 사용할 수 있는 타입은 문자, 문자열, 정수 등이 있다.
	 * 
	 * + break문 : switch문 실행 도중 
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		/*
		 * 정수를 입력받아
		 * 1일 경우, 5일 경우 -> 빨간색입니다.
		 * 2일 경우 -> 파란색입니다.
		 * 3일 경우 -> 초록색입니다.
		 * 나머지 -> 잘못 입력하였습니다.
		 * 를 출력
		 */
		
		/*
		System.out.print("정수 입력 : ");
		int num = sc.nextInt();
		
		String color = "";
		
		switch (num) {
			case 1, 5: 
				color = "빨간색";
				break;
			case 2: 
				color = "파란색";
				break;
			case 3: 
				color = "초록색";
				break;
			default:
				color = "잘못된 색";
		}
		
		System.out.println(color + "입니다.");
		System.out.printf("%s입니다.", color);
		*/
		
		/*
		 * [과일을 구매하는 프로그램]
		 * 구매하려는 과일을 입력 시
		 * 그에 맞는 가격을 출력되게 해보자.
		 * 
		 * [console]
		 * 구매 가능한 과일 [사과(2000원), 바나나(3000원), 수박(8000원)]
		 * 선택 : (키보드 입력)
		 * 
		 * ~~은 ~~원입니다. / 잘못 입력하였습니다.
		 */
		
		/*
		System.out.println("구매 가능한 과일 [사과(2000원), 바나나(3000원), 수박(8000원)]");
		System.out.print("선택 : ");
		String fruit = sc.next();
		
		int price = 0;
		
		switch (fruit) {
			case "사과":
				price = 2000;
				break;
			case "바나나":
				price = 3000;
				break;
			case "수박":
				price = 8000;
				break;
		}

		// 출력문 분기
		if (price == 0) {			
			System.out.println("잘못 입력하였습니다.");
		} else {
			System.out.println(fruit + "의 가격은 " + price + "원입니다.");			
			System.out.printf("%s의 가격은 %d원입니다.", fruit, price);			
		}
		*/
		
		/*
		 * 월을 입력받아 해당 월의 마지막 날이 며칠인지 출력하는 프로그램
		 * 
		 * [console]
		 * 월 입력 : (키보드 입력)
		 * ~~월은 ~~일까지 있습니다.
		 * 
		 * 1,3,5,7,8,10,12 -> 31일
		 * 2 -> 28일
		 * 4,6,9,11 -> 30일
		 */
		
		System.out.print("월 입력 : ");
		int month = sc.nextInt();
		
		int lastDay = 0;
		
		switch (month) {
			case 1, 3, 5, 7, 8, 10, 12:
				lastDay = 31;
				break;
			case 2:
				lastDay = 28;
				break;
			case 4, 6, 9, 11:
				lastDay = 30;
				break;
		}
		
		if ((month > 0) && (month <= 12)) {			
			System.out.println(month + "월은 " + lastDay + "일까지 있습니다.");
		} else {
			System.out.println(month + "월은 없는 달입니다.");
		}

	}

}
