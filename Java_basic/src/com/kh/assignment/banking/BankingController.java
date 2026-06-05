package com.kh.assignment.banking;

import java.util.HashMap;
import java.util.Map;

public class BankingController {
	// 필드
	private Map<String, User> user = new HashMap<>();
	// 아이디와 유저객체
	private String loginedId;
	private User loginedUser;
	private Map<String, Transaction> transaction = new HashMap<>();
	// 계좌번호와 거래내역
	
	
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
	
	// getter / setter
	public User getLoginedUser() {
		return this.loginedUser;
	}
	
	
	
}
