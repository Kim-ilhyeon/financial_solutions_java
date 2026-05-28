package com.kh.example.inherit;

import java.util.Scanner;

public class PointMenu {
	// 필드
	private Scanner sc = new Scanner(System.in);
	private CircleController cc = new CircleController();
	private RectangleController rc = new RectangleController();
	
	// 메소드
	public void mainMenu() {
		while (true) {
			System.out.println("===== 메뉴 =====");
			System.out.println("1. 원");
			System.out.println("2. 사각형");
			System.out.println("9. 프로그램 종료");
			System.out.print("메뉴 번호 : ");
			int menuNum = sc.nextInt();
			switch (menuNum) {
			case 1 : 
				circleMenu();
				break;
			case 2 : 
				rectangleMenu();
				break;
			case 9 : 
				return;
			default :
				System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");
			}
		}
	}
	
	public void circleMenu() {
		while (true) {
			System.out.println("===== 원 메뉴 =====");
			System.out.println("1. 둘레");
			System.out.println("2. 넓이");
			System.out.println("9. 메인으로");
			System.out.print("메뉴 번호 : ");
			int menuNum = sc.nextInt();
			switch (menuNum) {
			case 1 : 
				calcCircum();
				break;
			case 2 : 
				calcCircleArea();
				break;
			case 9 :
				return;
			default :
				System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");
			}
		}
	}
	
	public void rectangleMenu() {
		while (true) {
			System.out.println("===== 사각형 메뉴 =====");
			System.out.println("1. 둘레");
			System.out.println("2. 넓이");
			System.out.println("9. 메인으로");
			System.out.print("메뉴 번호 : ");
			int menuNum = sc.nextInt();
			switch (menuNum) {
			case 1 : 
				calcPerimeter();
				break;
			case 2 : 
				calcRectArea();
				break;
			case 9 :
				System.out.println("종료합니다.");
				return;
			default :
				System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");
			}
		}
	}
	
	public void calcCircum() {
		System.out.print("x 좌표 : ");
		int x = sc.nextInt();
		System.out.print("y 좌표 : ");
		int y = sc.nextInt();
		System.out.print("반지름 : ");
		int radius = sc.nextInt();
		
		String result = cc.calcCircum(x, y, radius);
		System.out.println(result);
	}
	
	public void calcCircleArea() {
		System.out.print("x 좌표 : ");
		int x = sc.nextInt();
		System.out.print("y 좌표 : ");
		int y = sc.nextInt();
		System.out.print("반지름 : ");
		int radius = sc.nextInt();
		
		String result = cc.calcArea(x, y, radius);
		System.out.println(result);
	}
	
	public void calcPerimeter() {
		System.out.print("x 좌표 : ");
		int x = sc.nextInt();
		System.out.print("y 좌표 : ");
		int y = sc.nextInt();
		System.out.print("높이 : ");
		int height = sc.nextInt();
		System.out.print("너비 : ");
		int width = sc.nextInt();
		
		String result = rc.calcPerimeter(x, y, height, width);
		System.out.println(result);
	}
	
	public void calcRectArea() {
		System.out.print("x 좌표 : ");
		int x = sc.nextInt();
		System.out.print("y 좌표 : ");
		int y = sc.nextInt();
		System.out.print("높이 : ");
		int height = sc.nextInt();
		System.out.print("너비 : ");
		int width = sc.nextInt();

		String result = rc.calcArea(x, y, height, width);
		System.out.println(result);
	}
	
	
}
