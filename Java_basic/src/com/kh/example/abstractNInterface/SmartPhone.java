package com.kh.example.abstractNInterface;

public abstract class SmartPhone {
	// 필드
	private String maker;
	
	// 생성자
	public SmartPhone() {
		super();
	}
	
	
	// 메소드
	public abstract String printInformation();

	
	// getter / setter
	public String getMaker() {
		return maker;
	}


	public void setMaker(String maker) {
		this.maker = maker;
	}
	
	
	
	
	
	
}
