package com.kh.assignment.banking;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BankingController {
	// 필드
	private Map<String, User> user = new HashMap<>();
	// 아이디와 유저객체
	private String loginedId;
	private User loginedUser;
	
	
	// 메소드
	
	// 회원 기능
	
	// 1. 회원가입 
	// [전달받은 값을 통해서 Map<String, User> user에 해당 키 값이 포함되어있는지를 containsKey() 메소드를 사용해서 확인 후
	// 중복이 없다면 user에 id와 user를 키와 벨류 값으로 추가 후 1 반환시킴, 중복이 있다면 0반환 시킴]
	public int insertUser(String id, User user) {
		boolean checkId = this.user.containsKey(id);
		if (!checkId) {
			this.user.put(id, user);
			return 1;
		}
		return 0;
	}
	
	
	// 2. 로그인 
	// [전달받은 id와 pwd값을 가지고 Map<String, User> user에 해당 키 값이 포함되어있는지를 containsKey() 메소드를 사용해서 확인 후
	// 포함되어있다면 loginUser에 전달받은 키값을 가지고 있는 User객체를 저장 하여 해당 객체의 비밀번호와 전달받은 pwd가 동일한 값인지
	// equals() 메소드로 비교 후 동일한 경우 현재 클래스의 필드 loginedId와 loginedUser에 id와 user벨류값을 각각 저장한 후 로그인한 User객체를 반환함]
	public User logIn(String id, String pwd) {
		boolean checkId = user.containsKey(id);
		if (checkId) {
			User loginUser = user.get(id);
			if (loginUser.getPassword().equals(pwd)) {
				// 로그인 성공!
				this.loginedId = id;
				this.loginedUser = user.get(id);
				return loginUser;
			}
		}
		return null;
	}
	
	// 3. 내 정보조회 
	// [현재 클래스 필드loginedId값을 통해서 Map<String, User> user에 해당 키값이 존재하는지를 확인 후
	// 있다면 해당 키값을 가진 user의 벨류 값(User객체)을 반환함]
	public User viewUser() {
		boolean isCheck = user.containsKey(loginedId);
		if (isCheck) {
			return user.get(loginedId);
		}
		return null;
	}
	
	// 4. 비밀번호 변경 
	// [현재 클래스의 필드 loginedId를 통해서 현재 로그인된 회원 객체로 접근하여 setPassword() 메소드를 통해서
	// 전달받은 비밀번호로 변경 후 제대로 변경되었는지를 확인 후 잘 변경되었으면 1을 반환시킴, 그렇지 않으면 0을 반환시킴]
	public int updatePwd(String newPwd) {
		user.get(loginedId).setPassword(newPwd);
		boolean result = user.get(loginedId).getPassword().equals(newPwd);
		if (result) {
			return 1;
		}
		return 0;
	}
	
	// 5. 회원 탈퇴(삭제) 
	// [현재 클래스의 필드 loginedId를 가지고 현재 로그인된 회원인 Map<String, User> user에 접근하여 remove()메소드로 삭제 후
	// 다시 loginedId를 키값으로 가지고 있는지를 확인 후 없다면 현재 클래스의 필드인 loginedId와 loginedUser의 값을 null로 변경 후 1을 반환시킴]
	public int deleteUser() {
		user.remove(loginedId);
		boolean checkId = user.containsKey(loginedId);
		if (!checkId) {
			this.loginedId = null;
			this.loginedUser = null;
			return 1;
		}
		return 0;
	}
	
	// -----------------------
	
	
	// 계좌 기능
	
	// 1. 계좌 개설 
	// [현재 클래스의 loginedUser의 getAccount() 메소드를 통해서 로그인된 회원의 Account에 접근한 후 해당 Account가 null(아직 생성X)이면
	// 생성을 하는데 100000000 ~ 999999999 (9자리)사이의 값을 랜덤으로 받아서 변수에 저장하고, 중복된 값이 Map<String , User> user에 있는지
	// 반복문을 통해서 확인을 하고 중복값이 없다면 반복문을 탈출하여 loginedUser에 접근하여 setAccount()메소드를 통해서
	// 현재 로그인된 회원의 계좌객체를 해당 accountNo로 생성 후 1 반환시킴, 이미 계좌 있을 경우 -1반환, 실패할 경우 0 반환시킴]
	public int insertAccount() {
		Account account = loginedUser.getAccount();
		boolean isDuplicate;
		String accountNo;
		if (account == null) {
			do {
				isDuplicate = false;
				int random = (int)(Math.random() * (999999999 - 100000000 + 1)) + 100000000;
				accountNo = String.valueOf(random);
				
				for (User u : user.values()) {
					if (u.getAccount() != null && !(u.getAccount().getAccountNo().equals(accountNo))) {
						isDuplicate = true;
						break;
					}
				}
				
			} while (isDuplicate);
			
			loginedUser.setAccount(new Account(accountNo, 0, new ArrayList()));
			if (loginedUser.getAccount().getAccountNo() == accountNo) {
				return 1;	// 성공
			}
		} else {
			return -1;		// 이미 계좌 있음
		}
		return 0;			// 실패
	}
	
	
	// 2. 잔액 확인 
	// [현재 클래스의 필드인 loginedUser에 접근하여 getAccount()메소드를 사용해 로그인한 회원의 계좌객체를 변수에 저장 후
	// 해당 계좌의 잔액을 getBalance()로 접근해서 반환시킴]
	public int viewBalance() {
		Account account = loginedUser.getAccount();
		int balance = account.getBalance();
		return balance;
	}
	
	// 3. 입금 
	// [현재 클래스의 필드인 loginedUser에 접근하여 getAccount()메소드를 사용해 로그인한 회원의 계좌객체를 변수에 저장 후
	// 해당 계좌의 잔액을 getBalance()로 접근해서 oldBalance변수에 저장 후 setBalance()메소드로 oldBalance + money(입금금액)으로 변경 후
	// 계좌의 잔액이 음수가 아니고, 현재 계좌의 잔액이 입금 반영이 되었는지 확인 후 Account객체의 필드인 List<Transaction>에 거래내역 추가 후
	// 1을 반환시킴, 만약 금액이 잘못 반영되었거나 반영이 안되었다면 실패라서 다시 입금 전 금액으로 다시 변경 후 0을 반환시킴
	public int deposit(int money) {
		Account account = loginedUser.getAccount();
		int oldBalance = account.getBalance();
		account.setBalance(oldBalance + money);
		
		if (!(account.getBalance() < 0) && account.getBalance() == (oldBalance + money)) {
			account.getHistory().add(new Transaction("입금", money, "없음"));
			return 1;	// 성공
		}
		account.setBalance(oldBalance);	// 실패한 경우 다시 입금 전 금액으로 되돌리는 작업
		return 0;	// 실패
	}

	// 4. 송금 
	// [현재 클래스의 필드인 loginedUser를 통해서 로그인한 회원의 계좌에 접근하여 account변수에 저장 후 getBalance() 메소드를 통해 
	// 송금 전 금액을 oldBalance변수에 저장, 송금 전 잔액이 송금하려는 금액보다 작은 경우에는 -1을 반환시킴(= 잔액 부족)
	// 그게 아니라면 해당 계좌의 잔액을 setBalance()를 사용해 oldBalance-money(송금금액)으로 변경 후 금액 반영이 잘 되었는지를 확인해서
	// Account객체의 필드인 List<Transaction>에 거래내역 추가 후 1을 반환시킴, 반영이 정상적으로 되지 않았다면 송금 전 금액으로 다시 변경 후 0을 반환시킴]
	public int transfer(int money, String accountNo) {
		Account account = loginedUser.getAccount();
		int oldBalance = account.getBalance();
		
		if (oldBalance < money) {
			return -1;	// 잔액 부족 실패
		}
		account.setBalance(oldBalance - money);
		
		if (!(account.getBalance() < 0) && account.getBalance() == (oldBalance - money)) {
			account.getHistory().add(new Transaction("송금", money, accountNo));
			return 1;	// 성공
		}
		account.setBalance(oldBalance);	// 실패한 경우 다시 송금 전 금액으로 되돌리는 과정
		return 0;		// 실패
	}

	// 5. 거래내역 조회 
	// [현재 클래스의 필드인 loginedUser에 접근하여 getAccount()메소드를 통해서 로그인한 회원의 계좌를 account 변수에 저장 후
	// 해당 Account객체의 getHistory()를 통해서 해당 계좌의 List<Transaction>를 history 변수에 저장하여 반환시킴]
	public List<Transaction> viewTransaction() {
		Account account = loginedUser.getAccount();
		List<Transaction> history = account.getHistory();
		return history;
	}
	
	// 6. 계좌 삭제 
	// [현재 클래스의 필드인 loginedUser에 접근하여 setAccount()메소드를 통해서 null로 값 변경 후
	// 현재 로그인한 회원의 계좌의 값이 null인지 확인하여 삭제되었다면 1반환, null이 아니라면 0을 반환시킴]
	public int deleteAccount() {		
		loginedUser.setAccount(null);
		Account account = loginedUser.getAccount();
		if (account == null) {
			return 1;	// 성공
		}
		return 0;		// 실패
	}


	// getter / setter
	public User getLoginedUser() {
		return this.loginedUser;
	}
		
	
	
}
