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
			System.out.println("3. 삼각형\n4. 사각형\n9. 프로그램 종료");
			System.out.print("메뉴번호 : ");
			menuNum = sc.nextInt();
			sc.nextLine();
			switch (menuNum) {
				case 3 : 
					triangleMenu();
					break;
				case 4 : 
					squareMenu();
					break;
				case 9 : 
					System.out.println("프로그램을 종료 합니다.");
					return;	// 반환 값 반환 + 함수 종료
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
	
	// type은 삼각형과 사각형인지를 구분해주는 번호, menuNum은 고른 메뉴번호
	public void inputSize(int type, int menuNum) {
		switch (type) {
		// 삼각형 : type = 3
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
		// 사각형 : type = 4
		case 4 : 
			// 높이와 너비를 받는 중복되는 기능을 case를 묶는 것 보다
			// 입력받는 것을 기능으로 보아 함수로 빼는 것이 좀 더 좋은 방법이다.
			switch (menuNum) {
			case 1 : {
				System.out.print("높이 : ");
				int height = sc.nextInt();
				System.out.print("너비 : ");
				int width = sc.nextInt();
				sc.nextLine();
				double calcP = scr.calcPerimeter(height, width);
				System.out.println("사각형 둘레 : " + calcP);
			}
				break;
			case 2 : {
				System.out.print("높이 : ");
				int height = sc.nextInt();
				System.out.print("너비 : ");
				int width = sc.nextInt();
				sc.nextLine();
				double calcArea = scr.calcArea(height, width);
				System.out.println("사각형 면적 : " + calcArea);
			}
				break;
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
			String result = tc.print();
			System.out.println(result);
		}
		if (type == 4) {
			String result = scr.print();
			System.out.println(result);
		}
	}

}
