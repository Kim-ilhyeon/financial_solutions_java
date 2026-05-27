package com.kh.example.oop7;

import java.util.Scanner;

public class ProductMenu {
	// 필드
	private ProductController pc = new ProductController();
	private Scanner sc = new Scanner(System.in);

	// 메소드
	public void mainMenu() {
		int menuNum = 0;
		while (menuNum != 9) {
			System.out.println("===== 상품 관리 메뉴 =====");
			System.out.println("1. 상품 추가");
			System.out.println("2. 상품 전체 조회");
			System.out.println("9. 프로그램 종료");
			System.out.print("메뉴 번호 : ");
			menuNum = sc.nextInt();
			sc.nextLine();
			System.out.println();
			switch (menuNum) {
			case 1 : 
				System.out.print("추가할 상품명 : ");
				String pName = sc.nextLine();
				System.out.print("추가할 가격 : ");
				int price = sc.nextInt();
				sc.nextLine();
				System.out.print("추가할 브랜드 : ");
				String brand = sc.nextLine();
				pc.insertProduct(pName, price, brand);
				System.out.println();
				break;
			case 2 :
				Product[] pArr = pc.selectProduct();
				for (Product pd : pArr) {
					if (pd == null) {
						break;
					}
					System.out.println(pd.inform());
				}
				System.out.println();
				break;
			case 9 : 
				System.out.println("프로그램을 종료하였습니다.");
				return;
			default : 
				System.out.println("잘못 입력 하셨습니다. 다시 입력해주세요.");
			}
		}
	}

}
