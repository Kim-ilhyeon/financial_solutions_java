package com.kh.example.poly2;

import java.util.Scanner;

public class LibraryMenu {
	// 필드
	private LibraryController lc = new LibraryController();
	private Scanner sc = new Scanner(System.in);
	
	// 메소드
	public void mainMenu() {
		System.out.print("이름 : ");
		String name = sc.nextLine();
		System.out.print("나이 : ");
		int age = sc.nextInt();
		sc.nextLine();
		System.out.print("성별 : ");
		char gender = sc.nextLine().toUpperCase().charAt(0);
		
		Member mem = new Member(name, age, gender);
		lc.insertMember(mem);
		
		while (true) {
			System.out.println("==== 메뉴 ====");
			System.out.println("1. 마이페이지");
			System.out.println("2. 도서 전체 조회");
			System.out.println("3. 도서 검색");
			System.out.println("4. 도서 대여하기");
			System.out.println("9. 프로그램 종료");
			System.out.print("메뉴 번호 : ");
			int menuNum = sc.nextInt();
			sc.nextLine();
			
			switch (menuNum) {
			case 1 : 
				String myInfo = lc.myInfo().toString();
				System.out.println(myInfo);
				break;
			case 2 :
				this.selectAll();
				break;
			case 3 :
				this.searchBook();
				break;
			case 4 : 
				this.rentBook();
				break;
			case 9 :
				System.out.println("프로그램을 종료합니다.");
				return;
			default : 
				System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");
			}
		}
	}
	
	public void selectAll() {
		Book[] bList = lc.selectAll();
		for (int i = 0; i < bList.length; i++) {
			if (bList[i] == null) {
				break;
			}
			System.out.print(i + "번 도서 : ");
			String bookInfo = bList[i].toString();
			System.out.println(bookInfo);
		}
	}
	
	public void searchBook() {
		System.out.println();
		System.out.print("검색할 제목 키워드 : ");
		String keyword = sc.nextLine();
		Book[] kList = lc.searchBook(keyword);
		for (Book kl : kList) {
			if (kl == null) {
				break;
			}
			String findInfo = kl.toString();
			System.out.println(findInfo);
		}
	}
	
	public void rentBook() {
		selectAll();
		
		System.out.print("대여할 도서 번호 선택 : ");
		int rentNum = sc.nextInt();
		sc.nextLine();
		
		int result = lc.rentBook(rentNum);
		
		switch (result) {
		case 0 : 
			System.out.println("성곡적으로 대여 되었습니다.");
			break;
		case 1 : 
			System.out.println("나이 제한으로 대여 불가능합니다.");
			break;
		case 2 : 
			System.out.println("성공적으로 대여 되었습니다. 요리학원 쿠폰이 발급 되었으니 마이페이지에서 확인하세요.");
		}
		
	}
	
	
	
	
}
