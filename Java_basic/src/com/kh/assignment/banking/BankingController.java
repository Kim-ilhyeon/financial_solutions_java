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
	public int insertUser(String id, User user) {
		boolean isCheck = this.user.containsKey(id);
		if (!isCheck) {
			this.user.put(id, user);
			return 1;
		}
		return 0;
	}
	
	public User logIn(String id, String password) {
		boolean checkId = user.containsKey(id);
		if (checkId) {
			User loginUser = user.get(id);
			if (loginUser.getPassword().equals(password)) {
				// 로그인 성공!
				this.loginedId = id;
				this.loginedUser = user.get(id);
				return loginUser;
			}
		}
		return null;
	}
	
	public User viewUser() {
		boolean isCheck = user.containsKey(loginedId);
		if (isCheck) {
			return user.get(loginedId);
		}
		return null;
	}
	
	public int updatePwd(String newPwd) {
		user.get(loginedId).setPassword(newPwd);
		boolean result = user.get(loginedId).getPassword().equals(newPwd);
		if (result) {
			return 1;
		}
		return 0;
	}
	
	public int deleteUser() {
		user.remove(loginedId);
		this.loginedId = null;
		this.loginedUser = null;
		if (loginedId == null && loginedUser == null) {
			return 1;
		}
		return 0;
	}
	
	
	// -----------------------
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
					if (u.getAccount() != null && u.getAccount().getAccountNo().equals(accountNo)) {
						isDuplicate = true;
						break;
					}
				}
				
			} while (isDuplicate);
			
			loginedUser.setAccount(new Account(accountNo, 0, new ArrayList()));
			if (loginedUser.getAccount().getAccountNo() == accountNo) {
				return 1;
			}
		} else {
			return -1;			
		}
		return 0;
	}
	
	public int viewBalance() {
		Account account = loginedUser.getAccount();
		int balance = account.getBalance();
		return balance;
	}
	
	public int deposit(int money) {
		Account account = loginedUser.getAccount();
		int oldBalance = account.getBalance();
		account.setBalance(oldBalance + money);
		
		if (!(account.getBalance() < 0) && account.getBalance() == (oldBalance + money)) {
			account.getHistory().add(new Transaction("입금", money, "없음"));
			return 1;
		}
		account.setBalance(oldBalance);
		return 0;
	}

	public int transfer(int money, String accountNo) {
		Account account = loginedUser.getAccount();
		int oldBalance = account.getBalance();
		
		if (oldBalance < money) {
			return -1;
		}
		account.setBalance(oldBalance - money);
		
		if (!(account.getBalance() < 0) && account.getBalance() == (oldBalance - money)) {
			account.getHistory().add(new Transaction("송금", money, accountNo));
			return 1;
		}
		account.setBalance(oldBalance);
		return 0;
	}

	
	public List<Transaction> viewTransaction() {
		Account account = loginedUser.getAccount();
		List<Transaction> history = account.getHistory();
		return history;
	}
	
	
	public int deleteAccount() {		
		loginedUser.setAccount(null);
		Account account = loginedUser.getAccount();
		if (account == null) {
			return 1;
		}
		return 0;
	}


	
	
	// getter / setter
	public User getLoginedUser() {
		return this.loginedUser;
	}
		
	
	
}
