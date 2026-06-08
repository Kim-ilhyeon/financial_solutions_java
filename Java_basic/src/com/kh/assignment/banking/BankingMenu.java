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
			System.out.print("메뉴 번호 : ");
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
				int result = deleteUser();
				switch (result) {
				case 1 :
					return;
				case 2 : 
					break;
				}
				break;
			case 4 :
				accountMenu();
				break;
			case 5 : 
				logOut();	// bc의 필드인 loginedId와 loginedUser의 값을 null로 변경하기 위한 메소드
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
	
	// 회원 기능 (회원가입, 로그인, 내 정보조회, 비밀번호 수정, 회원탈퇴)
	
	// 1. 회원가입 (사용자 입력 : id, 비밀번호, 이름)
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
			
			// 사용자에게 입력 받은 값을 사용해 BankingController의 insertUser():int 메소드 호출
			int result = bc.insertUser(id, new User(pwd, name));
			// insertUser()메소드의 성공 여부를 int로 반환받아 성공할 경우 -> 1 반환받음, 실패할 경우 0 반환받음
			if (result == 1) {
				System.out.println("정상적으로 가입이 완료 되었습니다.");
				return;
			} else {
				System.out.println("아이디 또는 비밀번호가 중복 되어 회원가입에 실패했습니다.");
				// 회원가입에 실패했을 경우 반복여부를 사용자에게 입력받아 값에 따라서 분기
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
	
	// 2. 로그인 (사용자 입력 : id, 비밀번호)
	public boolean logIn() {
		System.out.print("아이디 : ");
		String id = sc.next();
		System.out.print("비밀번호(공백 없이) : ");
		String pwd = sc.next();
		sc.nextLine();
		
		// 사용자에게 입력받은 값을 통해서 BankingController의 logIn():int 메소드를 호출
		// 성공했을 경우 -> User객체 반환받음, 실패했을 경우 -> null 반환받음, 성공/실패에 따라서 boolean값 반환함
		User user = bc.logIn(id, pwd);
		if (user != null) {
			// 로그인한 User객체의 이름을 사용하기 위해서 bc.logIn()은 User객체를 반환받음
			String userName = user.getName();
			System.out.println(userName + "님 환영합니다!!");
			return true;
		}
		return false;
	}
	
	// 3. 로그아웃 (사용자 입력 : X)
	public void logOut() {
		bc.setLoginedId(null);
		bc.setLoginedUser(null);
	}
	
	// 4. 내 정보 조회 (사용자 입력: x)
	public void viewUser() {
		// bc의 viewUser():User 메소드를 호출하여 로그인한 객체를 반환받아
		// null이 아닌 경우에만 회원의 정보를 출력
		User loginUser = bc.viewUser();
		if (loginUser != null) {
			System.out.println("조회한 회원의 이름 : " + loginUser.getName());
			if (loginUser.getAccount() != null) { // User객체의 필드 중 Accuont객체가 null인지 여부에 따라서 출력을 구분
				Account account = loginUser.getAccount();
				System.out.println("[[ 계좌 정보 ]]");
				System.out.println(account);	// -> Account객체에 toString()이 오버라이딩 되어있음
				
			} else {
				System.out.println("----계좌 없음----");
			}
		}
		
	}
	
	// 5. 비밀번호 수정 (사용자 입력 : 기존 비밀번호, 변경할 비밀번호)
	public void updatePassword() {
		int count = 0;	// 기존 비밀번호 확인 횟수
		while (count < 3) {
			System.out.print("기존 비밀번호 : ");
			String inputPwd = sc.next();
			sc.nextLine();
			String oldPwd = bc.getLoginedUser().getPassword();
			
			if (inputPwd.equals(oldPwd)) {	// 기존 비밀번호가 입력한 비밀번호와 일치할 경우에 newPwd를 입력받는 분기문
				System.out.print("변경할 비밀번호 : ");
				String newPwd = sc.next();
				sc.nextLine();
				
				// bc의 updatePwd():int 메소드를 호출하여 성공했을 경우 -> 1반환받음, 실패했을 경우 -> 0반환받음
				int result = bc.updatePwd(newPwd);
				if (result == 1) {
					System.out.println("비밀번호를 정상적으로 변경하였습니다.");
					return;					
				} else {
					System.out.println("비밀번호 변경 실패");
				}
			} else {	// 입력한 비밀번호와 기존비밀번호와 일치하지 않을 경우 안내문 출력 및 기존 비밀번호 확인 횟수 증가하여 기회 -1
				System.out.println("기존 비밀번호가 일치하지 않습니다.");
				count++;
			}
		}
		// count가 3이 되어 반복문을 탈출할 경우 기존비밀번호 확인불가 안내문 출력
		System.out.println("비밀번호를 3번 틀려서 다시 메뉴로 돌아갑니다.");
	}
	
	// 6. 회원 탈퇴 (사용자 입력 : 기존 비밀번호)
	public int deleteUser() {
		int count = 0;	// 기존 비밀번호 확인 횟수
		while (count < 3) {
			System.out.print("기존 비밀번호 : ");
			String inputPwd = sc.next();
			sc.nextLine();
			String oldPwd = bc.getLoginedUser().getPassword();
			
			if (inputPwd.equals(oldPwd)) {	// 기존 비밀번호가 입력한 비밀번호와 일치할 경우에 newPwd를 입력받는 분기문
				int result = bc.deleteUser(); // bc의 deleteUser():int 메소드를 호출하여 성공했을 경우 -> 1반환받음, 실패했을 경우 -> 0반환받음
				if (result == 1) {
					System.out.println("계정이 정상적으로 삭제되었습니다.");
					return 1;					
				} else {
					System.out.println("계정 삭제 실패");
				}
			} else {	// 입력한 비밀번호와 기존비밀번호와 일치하지 않을 경우 안내문 출력 및 기존 비밀번호 확인 횟수 증가하여 기회 -1
				System.out.println("기존 비밀번호가 일치하지 않습니다.");
				count++;
			}
		}
		// count가 3이 되어 반복문을 탈출할 경우 기존비밀번호 확인불가 안내문 출력
		System.out.println("비밀번호를 3번 틀려서 다시 메뉴로 돌아갑니다.");
		return 0;
	}
	
	// ----------------
	
	// 계좌 기능 (계좌개설, 잔액조회, 입금, 송금, 거래내역 조회, 계좌 삭제)
	
	// 1. 계좌 개설 (사용자 입력 : x)
	public void signUpAccount() {
		// bc의 insertAccount():int 메소드를 통해서 계좌생성 후 결과값을 성공 -> 1,이미 계좌 있을 경우 -> -1, 실패 -> 0 반환받음
		int result = bc.insertAccount();

		switch (result) {
		case 1 : 
			System.out.println("계좌 개설 성공");
			break;
		case -1 :
			System.out.println("이미 계좌가 존재합니다.");
			break;
		case 0 : 
			System.out.println("계좌 개설 실패ㅠ");
		}
	}
	
	// +. 계좌가 있는지 여부 확인 (아래에 기능들을 하기 전에 계좌 여부를 확인하는 메소드)
	public boolean checkAccount() {
		Account account = bc.getLoginedUser().getAccount();	// bc의 필드에 저장되어있는 로그인된 User객체의 account에 접근하여 저장
		if (account == null) {
			return true;
		}
		return false;
	}
	
	// 2. 잔액 조회 (사용자 입력 : x)
	public void viewBalance() {
		if (checkAccount()) {
			System.out.println("아직 계좌가 존재하지 않습니다.");
			return;
		}
		
		int balance = bc.viewBalance();
		System.out.println("현재 잔액 : " + balance);
	}
	
	// 3. 입금 (사용자 입력 : 입금금액)
	public void deposit() {
		if (checkAccount()) {
			System.out.println("아직 계좌가 존재하지 않습니다.");
			return;
		}
		
		System.out.print("입금할 금액 : ");
		int money = sc.nextInt();
		sc.nextLine();
		
		// bc의 deposit():int 메소드를 통해 결과값 성공 -> 1, 실패 -> 0 반환받음
		int result = bc.deposit(money);
		if (result == 1) {
			System.out.println(money + "입금 성공");
		} else {
			System.out.println("입금 실패ㅠ");
		}
	}
	
	// 4. 송금 (사용자 입력 : 보낼 계좌번호, 송금할 금액)
	public void transfer() {
		if (checkAccount()) {
			System.out.println("아직 계좌가 존재하지 않습니다.");
			return;
		}
		
		boolean check = true;	// 송금하는 금액이 0원 이상인지를 확인하기 위해 구분해놓은 boolean값
		int money = 0;
		
		System.out.print("보낼 계좌번호 : ");
		String targetAccount = sc.nextLine();
		
		// check를 통해서 송금하는 금액이 0원 이상이 아니라면 계속 반복
		while (check) {
			System.out.print("송금할 금액 : ");
			money = sc.nextInt();
			sc.nextLine();
			if (money <= 0) {
				System.out.println("1원 이상 송금이 가능합니다.");
			} else {
				check = false;				
			}
		}
		
		// bc의 transfer():int 메소드를 통해서 성공 -> 1, 잔액보다 송금금액이 큰 경우 -1, 실패 -> 0 반환받음
		int result = bc.transfer(money, targetAccount);
		
		switch (result) {
		case 1 : 
			System.out.println("송금 완료");
			break;
		case -1 : 
			System.out.println("잔액 부족");
			break;
		case 0 : 
			System.out.println("송금 실패ㅠ");
		}
	}
	
	
	// 5. 거래내역 조회 (사용자 입력 : x)
	public void viewTransaction() {
		if (checkAccount()) {
			System.out.println("아직 계좌가 존재하지 않습니다.");
			return;
		}
		System.out.println("[ 거래 내역 ]");
		
		// bc의 viewTransaction():List<Transaction> 메소드를 통해서 List<Transaction>을 반환받음
		// List의 길이가 0인 경우에는 "거래내역 없음" 출력, 0이 아닌경우 List를 for-each로 반복하여 출력
		List<Transaction> transactions = bc.viewTransaction();
		if (transactions.size() == 0) {
			System.out.println("--- 거래 내역 없음 ---");
		} else {
			for (Transaction tr : transactions) {
				System.out.println(tr);	// Transaction의 toString()이 오버라이딩 되어있음
			}			
		}
	}
	
	/*
	// + 6. 계좌 삭제 = 계좌 만료 시 or 계좌 삭제 보기 추가
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
	*/
	
	
}
