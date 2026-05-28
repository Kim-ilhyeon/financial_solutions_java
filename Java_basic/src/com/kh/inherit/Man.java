package com.kh.inherit;

public class Man {
	// 필드
	private String name;

	// 생성자
	public Man() {
		super();	// Object클래스의 생성자
		System.out.println("Man객체의 기본생성자");
	}
	
	public Man(String name) {
		this.name = name;
	}	
	
	// 메소드
	public void tellYourName() {
		System.out.println("my name is " + name);
	}
	

	// getter / setter
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}

}
