package com.kh.assignment.banking;

import java.util.Objects;

public class User {
	// 필드
	private String password;	// 비밀번호
	private String name;		// 이름
	
	private Account account;	// 해당 회원의 계좌 객체

	// 생성자
	public User() {
		super();
	}

	public User(String password, String name) {
		super();
		this.password = password;
		this.name = name;
		this.account = null;
	}

	
	// 메소드	
	// getter / setter
	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Account getAccount() {
		return account;
	}

	public void setAccount(Account account) {
		this.account = account;
	}
	
	
	
	
}
