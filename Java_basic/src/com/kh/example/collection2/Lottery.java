package com.kh.example.collection2;

import java.util.Objects;

public class Lottery {
	// 필드
	private String name;	// 이름
	private String phone;	// 휴대폰 번호('-'없이)
	
	// 생성자
	public Lottery() {
		super();
	}
	public Lottery(String name, String phone) {
		super();
		this.name = name;
		this.phone = phone;
	}
	
	
	// 메소드
	@Override
	public int hashCode() {
		return Objects.hash(name, phone);
	}
	@Override
	public boolean equals(Object obj) {
		Lottery lotto = (Lottery)obj;
		return this.name.equals(lotto.getName()) && this.phone.equals(lotto.getPhone());
	}
	@Override
	public String toString() {
		return name + " (" + phone + ")";
	}	
	
	
	
	// getter / setter
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	
	
	
	
	
	
}
