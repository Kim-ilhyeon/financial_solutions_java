package com.kh.example.collection3;

public class Member {
	// 필드
	private String password;	// 비밀번호
	private String name;		// 이름
	
	// 생성자
	public Member() {
		super();
	}
	public Member(String password, String name) {
		super();
		this.password = password;
		this.name = name;
	}
	
	
	// 메소드
	@Override
	public String toString() {
		return this.name + " - " + this.password;
	}	
	
	
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
	
	// 
	
	
}
