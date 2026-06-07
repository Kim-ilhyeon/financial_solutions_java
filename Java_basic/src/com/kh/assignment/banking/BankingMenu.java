package com.kh.assignment.banking;

import java.util.List;
import java.util.Scanner;

public class BankingMenu {
	// 필드
	private Scanner sc = new Scanner(System.in);
	private BankingController bc = new BankingController();
	
	
	// 메소드
	// 메인 메뉴 출력 메소드
	public void mainMenu() {
		while (true) {
			System.out.println("***** KH 인터넷 뱅킹 *****");
			System.out.println("1. 회원가입");
			System.out.println("2. 로그인");
			System.out.println("3. 프로그램 종료");
			System.out.println("메뉴 번호 : ");
			int menuNum = sc.nextInt();
			sc.nextLine();
			
			switch (menuNum) {
			case 1 : 
				signUpUser();
				break;
			case 2 : 
				boolean result = logIn();
				if (result) {
					System.out.println("로그인 성공!!");
					userMenu();
				} else {
					System.out.println("ㅠㅠㅠ로그인 실패ㅠㅠㅠ");
				}
				break;
			case 3 : 
				System.out.println("프로그램을 종료합니다...");
				return;
			default : 
				System.out.println("잘못된 번호입니다. 다시 입력해주세요.");
			}
		}
	}
	
	// 회원 메뉴 (로그인 성공 시)
	public void userMenu() {
		while (true) {
			System.out.println("***** 회원 메뉴 *****");
			System.out.println("1. 내 정보 조회");
			System.out.println("2. 비밀번호 수정");
			System.out.println("3. 회원 탈퇴");
			System.out.println("4. 계좌 메뉴");
			System.out.println("5. 로그아웃");
			System.out.print("메뉴 번호 : ");
			int menuNum = sc.nextInt();
			sc.nextLine();
			
			switch (menuNum) {
			case 1 : 
				viewUser();
				break;
			case 2 : 
				updatePassword();
				break;
			case 3 : 
				deleteUser();
				return;
			case 4 :
				accountMenu();
				break;
			case 5 : 
				return;
			default : 
				System.out.println("잘못된 번호입니다. 다시 입력해주세요.");
			}
		}
	}
	
	// 계좌 메뉴
	public void accountMenu() {
		while (true) {
			System.out.println("***** 계좌 메뉴 *****");
			System.out.println("1. 계좌 개설");
			System.out.println("2. 계좌 잔액 조회");
			System.out.println("3. 입금");
			System.out.println("4. 송금");
			System.out.println("5. 나의 거래내역 조회");
			System.out.println("6. 회원 메뉴로 돌아가기");
			System.out.print("메뉴 번호 : ");
			int menuNum = sc.nextInt();
			sc.nextLine();
			
			switch (menuNum) {
			case 1 : 
				signUpAccount();
				break;
			case 2 : 
				viewBalance();
				break;
			case 3 : 
				deposit();
				break;
			case 4 : 
				transfer();
				break;
			case 5 : 
				viewTransaction();
				break;
			case 6 : 
				return;
			default : 
				System.out.println("잘못된 번호입니다. 다시 입력해주세요.");
			}
		}
	}
	
	// 회원 기능
	// 회원가입
	public void signUpUser() {
		boolean repeat = true;
		while (repeat) {
			System.out.print("가입할 아이디 : ");
			String id = sc.next();
			System.out.print("비밀번호(공백 없이) : ");
			String pwd = sc.next();
			sc.nextLine();
			System.out.print("이름 : ");
			String name = sc.nextLine();
			int result = bc.insertUser(id, new User(pwd, name));
			if (result == 1) {
				System.out.println("정상적으로 가입이 완료 되었습니다.");
				return;
			} else {
				System.out.println("회원가입에 실패했습니다.");
				while (true) {
					System.out.print("다시 회원가입을 진행하시겠습니까? (y/n) : ");
					char isContinue = sc.nextLine().toUpperCase().charAt(0);
					if (isContinue == 'N') {
						repeat = false;
						return;
					} else if (isContinue == 'Y') {
						break;
					} else {
						System.out.println("잘못된 명령입니다.");
					}
				}
			}
		}
		
	}
	
	// 로그인
	public boolean logIn() {
		System.out.print("아이디 : ");
		String id = sc.next();
		System.out.print("비밀번호(공백 없이) : ");
		String pwd = sc.next();
		sc.nextLine();
		User user = bc.logIn(id, pwd);
		if (user != null) {
			String userName = user.getName();
			System.out.println(userName + "님 환영합니다!!");
			return true;
		}
		return false;
	}
	
	// 내 정보 조회
	public void viewUser() {
		User loginUser = bc.viewUser();
		if (loginUser != null) {
			System.out.println("조회한 회원의 이름 : " + loginUser.getName());
			if (loginUser.getAccount() != null) {
				Account account = loginUser.getAccount();
				System.out.println("[[ 계좌 정보 ]]");
				System.out.println(account);
				
			} else {
				System.out.println("----계좌 없음----");
			}
		}
		
	}
	
	// 비밀번호 수정
	public void updatePassword() {
		int count = 0;
		while (count < 3) {
			System.out.print("기존 비밀번호 : ");
			String oldPwd = sc.next();
			sc.nextLine();
			String pwd = bc.getLoginedUser().getPassword();
			if (pwd.equals(oldPwd)) {
				System.out.println("변경할 비밀번호 : ");
				String newPwd = sc.next();
				sc.nextLine();
				int result = bc.updatePwd(newPwd);
				if (result == 1) {
					System.out.println("비밀번호를 정상적으로 변경하였습니다.");
					return;					
				} else {
					System.out.println("비밀번호 변경 실패");
				}
			} else {
				System.out.println("기존 비밀번호가 일치하지 않습니다.");
				count++;
			}
		}
		System.out.println("비밀번호를 3번 틀려서 다시 메뉴로 돌아갑니다.");
	}
	
	// 회원 탈퇴
	public void deleteUser() {
		int count = 0;
		while (count < 3) {
			System.out.print("기존 비밀번호 : ");
			String oldPwd = sc.next();
			sc.nextLine();
			String pwd = bc.getLoginedUser().getPassword();
			if (pwd.equals(oldPwd)) {
				int result = bc.deleteUser();
				if (result == 1) {
					System.out.println("계정이 정상적으로 삭제되었습니다.");
					return;					
				} else {
					System.out.println("계정 삭제 실패");
				}
			} else {
				System.out.println("기존 비밀번호가 일치하지 않습니다.");
				count++;
			}
		}
		System.out.println("비밀번호를 3번 틀려서 다시 메뉴로 돌아갑니다.");
	}
	
	// ----------------
	
	// 계좌 기능
	// 계좌 개설
	public void signUpAccount() {
		int result = bc.insertAccount();
		if (result == 1) {
			System.out.println("계좌 개설 성공");
			return;
		} else if (result == -1) {
			System.out.println("이미 계좌가 존재합니다.");
			return;
		}
		System.out.println("계좌 개설 실패ㅠ");
	}
	
	// 계좌가 있는지 여부 확인
	public boolean checkAccount() {
		Account account = bc.getLoginedUser().getAccount();
		if (account == null) {
			return true;
		}
		return false;
	}
	
	// 잔액 조회
	public void viewBalance() {
		if (checkAccount()) {
			System.out.println("아직 계좌가 존재하지 않습니다.");
			return;
		}
		
		int balance = bc.viewBalance();
		System.out.println("현재 잔액 : " + balance);
	}
	
	// 입금
	public void deposit() {
		if (checkAccount()) {
			System.out.println("아직 계좌가 존재하지 않습니다.");
			return;
		}
		
		System.out.print("입금할 금액 : ");
		int money = sc.nextInt();
		sc.nextLine();
		
		int result = bc.deposit(money);
		if (result == 1) {
			System.out.println(money + "입금 성공");
		} else {
			System.out.println("입금 실패ㅠ");
		}
	}
	
	// 송금
	public void transfer() {
		if (checkAccount()) {
			System.out.println("아직 계좌가 존재하지 않습니다.");
			return;
		}
		
		System.out.print("송금할 금액 : ");
		int tMoney = sc.nextInt();
		sc.nextLine();
		System.out.print("보낼 계좌번호 : ");
		String accountNo = sc.nextLine();
		
		int result = bc.transfer(tMoney, accountNo);
		if (result == 1) {
			System.out.println("송금 완료");
		} else if (result == -1) {
			System.out.println("잔액 부족");
		} else {
			System.out.println("송금 실패ㅠ");
		}
	}
	
	
	// 거래내역 조회
	public void viewTransaction() {
		if (checkAccount()) {
			System.out.println("아직 계좌가 존재하지 않습니다.");
			return;
		}
		
		System.out.println("[ 거래 내역 ]");
		List<Transaction> transactions = bc.viewTransaction();
		if (transactions.size() == 0) {
			System.out.println("--- 거래 내역 없음 ---");
		} else {
			for (Transaction tr : transactions) {
				System.out.println(tr);
			}			
		}
	}
	
	
	// 계좌 삭제
	public void deleteAccount() {
		if (checkAccount()) {
			System.out.println("아직 계좌가 존재하지 않습니다.");
			return;
		}
		
		int result = bc.deleteAccount();
		if (result == 1) {
			System.out.println("계좌 삭제 성공");
		} else {
			System.out.println("계좌 삭제 실패ㅠ");
		}
	}
	
	
}
