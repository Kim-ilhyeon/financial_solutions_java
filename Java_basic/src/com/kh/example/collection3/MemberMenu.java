package com.kh.example.collection3;

import java.util.HashSet;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;

public class MemberMenu {
	// 필드
	private MemberController mc = new MemberController();
	private Scanner sc = new Scanner(System.in);
	
	// 메소드
	public void mainMenu() {
		while (true) {
			System.out.println();
			System.out.println("**** 메인 메뉴 ****");
			System.out.println("1. 회원가입");
			System.out.println("2. 로그인");
			System.out.println("3. 같은 이름 회원 찾기");
			System.out.println("9. 종료");
			System.out.print("메뉴 번호 : ");
			
			int menuNum = sc.nextInt();
			sc.nextLine();
			
			switch (menuNum) {
			case 1 : 
				joinMembership();
				break;
			case 2 : 
				logIn();
				memberMenu();
				break;
			case 3 : 
				sameName();
				break;
			case 9 : 
				System.out.println("프로그램 종료");
				return;
			default : 
				System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");
			}
		}
	}
	
	public void memberMenu() {
		while (true) {
			System.out.println();
			System.out.println("**** 회원 메뉴 ****");
			System.out.println("1. 비밀번호 바꾸기");
			System.out.println("2. 이름 바꾸기");
			System.out.println("3. 로그아웃");
			System.out.print("메뉴 번호 : ");
			
			int menuNum = sc.nextInt();
			sc.nextLine();
			
			switch (menuNum) {
			case 1 : 
				changePassword();
				break;
			case 2 : 
				changeName();
				break;
			case 3 : 
				System.out.println("로그아웃 되었습니다.");
				return;
			default : 
				System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");
			}
		}
	}
	
	public void joinMembership() {
		while (true) {
			System.out.print("아이디 : ");
			String id = sc.next();
			System.out.print("비밀번호 : ");
			String pwd = sc.next();
			sc.nextLine();
			System.out.print("이름 : ");
			String name = sc.nextLine();
			boolean result = mc.joinMember(id, new Member(pwd, name));
			if (result) {
				System.out.println("성공적으로 회원가입 완료하였습니다.");
				return;
			} else {
				System.out.println("중복된 아이디입니다. 다시 입력해주세요.");
			}
		}
	}
	
	public void logIn() {
		while (true) {
			System.out.print("아이디 : ");
			String id = sc.next();
			System.out.print("비밀번호 : ");
			String pwd = sc.next();
			sc.nextLine();
			
			String logInName = mc.logIn(id, pwd);
			if (logInName == null) {
				System.out.println("틀린 아이디 또는 비밀번호입니다. 다시 입력해주세요.");
			} else {
				System.out.println(logInName + "님, 환영합니다!");
				memberMenu();
				return;
			}
		}
	}
	
	public void changePassword() {
		boolean isSuccess = true;
		while (isSuccess) {
			System.out.print("아이디 : ");
			String id = sc.next();
			System.out.print("기존 비밀번호 : ");
			String oldPwd = sc.next();
			System.out.print("새로운 비밀번호 : ");
			String newPwd = sc.next();
			sc.nextLine();
			
			boolean result = mc.changePassword(id, oldPwd, newPwd);
			if (result) {
				System.out.println("비밀번호 변경에 성공했습니다.");
				isSuccess = false;
			} else {
				System.out.println("비밀번호 변경에 실패했습니다. 다시 입력해주세요.");
			}
		}
	}
	
	public void changeName() {
		System.out.print("아이디 : ");
		String id = sc.next();
		System.out.print("비밀번호 : ");
		String pwd = sc.next();
		sc.nextLine();
		
		String logInName = mc.logIn(id, pwd);
		System.out.print("현재 설정된 이름 : " + logInName);
		System.out.print("변경할 이름 : ");
		String newName = sc.next();
		sc.nextLine();
		mc.changeName(id, newName);
		
		String checkName = mc.logIn(id, pwd);
		if (checkName.equals(newName)) {
			System.out.println("이름 변경에 성공했습니다.");
		} else {
			System.out.println("이름 변경에 실패했습니다.");
		}
	}
	
	public void sameName() {
		System.out.print("검색할 이름 : ");
		String searchName = sc.next();
		sc.nextLine();
		TreeMap<String, String> treeMap =  mc.sameName(searchName);
		Set<Entry<String, String>> set = treeMap.entrySet();
		for (Entry<String, String> s : set) {
			System.out.println(s);
		}
	}
	
	
	
	
}
