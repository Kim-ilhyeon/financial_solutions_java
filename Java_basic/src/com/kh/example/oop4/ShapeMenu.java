package com.kh.example.oop4;

import java.util.Scanner;

public class ShapeMenu {
	// 필드
	private Scanner sc = new Scanner(System.in);
	private SquareController scr = new SquareController();
	private TriangleController tc = new TriangleController();
	
	// 메소드
	public void inputMenu() {
		int menuNum = 0;
		while (menuNum != 9) {
			System.out.println("==== 도형 프로그램 ====");
			System.out.println("3. 삼각형\n4. 사각형\n9. 종료");
			System.out.print("메뉴번호 : ");
			menuNum = sc.nextInt();
			sc.nextLine();
			switch (menuNum) {
				case 3 : triangleMenu();
					break;
				case 4 : squareMenu();
					break;
				case 9 : 
					System.out.println("프로그램을 종료 합니다.");
					break;
				default : 
					System.out.println("잘못된 번호입니다. 다시 입력 하세요.");
			}
			System.out.println();
		}
	}
	
	public void triangleMenu() {
		int menuNum = 0;
		while (menuNum != 9) {
			System.out.println();
			System.out.println("==== 삼각형 ====");
			System.out.println("1. 면적 계산\n2. 색칠\n3. 정보보기\n9. 메인으로");
			System.out.print("메뉴번호 : ");
			menuNum = sc.nextInt();
			sc.nextLine();
			switch (menuNum) {
			case 1, 2 :
				inputSize(3, menuNum);
				break;
			case 3 : 
				printInformation(3);
				break;
			case 9 : 
				return;
			default : 
				System.out.println("잘못된 번호입니다. 다시 입력 하세요.");
			}
		}
	}
	
	public void squareMenu() {
		int menuNum = 0;
		while (menuNum != 9) {
			System.out.println();
			System.out.println("==== 사각형 ====");
			System.out.println("1.둘레 계산\n2. 면적 계산\n3. 색칠\n4. 정보보기\n9. 메인으로");
			System.out.print("메뉴번호 : ");
			menuNum = sc.nextInt();
			sc.nextLine();
			switch (menuNum) {
			case 1, 2, 3 : 
				inputSize(4, menuNum);
				break;
			case 4 : 
				printInformation(4);
				break;
			case 9 : 
				return;
			default : 
				System.out.println("잘못된 번호입니다. 다시 입력 하세요.");
			}
		}
	}
	
	public void inputSize(int type, int menuNum) {
		switch (type) {
		case 3 : 
			switch (menuNum) {
			case 1 : 
				System.out.print("높이 : ");
				int height = sc.nextInt();
				System.out.print("너비 : ");
				int width = sc.nextInt();
				sc.nextLine();
				double calcArea = tc.calcArea(height, width);
				System.out.println("삼각형 면적 : " + calcArea);
				break;
			case 2 : 				
				System.out.print("색깔 : ");
				String color = sc.nextLine();
				tc.paintColor(color);
				break;
			}
			break;
		case 4 : 
			switch (menuNum) {
			case 1 : {
				System.out.print("높이 : ");
				int height = sc.nextInt();
				System.out.print("너비 : ");
				int width = sc.nextInt();
				sc.nextLine();
				double calcP = scr.calcPerimeter(height, width);
				System.out.println("사각형 둘레 : " + calcP);
				break;
			}
			case 2 : {
				System.out.print("높이 : ");
				int height = sc.nextInt();
				System.out.print("너비 : ");
				int width = sc.nextInt();
				sc.nextLine();
				double calcArea = scr.calcArea(height, width);
				System.out.println("사각형 면적 : " + calcArea);
				break;
			}
			case 3 : 
				System.out.print("색깔 : ");
				String color = sc.nextLine();
				scr.paintColor(color);
				break;
			}			
		}
	}
	
	public void printInformation(int type) {
		if (type == 3) {
			String result1 = tc.print();
			System.out.println(result1);
		}
		if (type == 4) {
			String result2 = scr.print();
			System.out.println(result2);
		}
	}

}
