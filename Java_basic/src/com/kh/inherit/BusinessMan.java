package com.kh.inherit;

public class BusinessMan extends Man {
	// 필드
	private String company;
	private String position;
	
	// 생성자
	public BusinessMan() {
		super();	// 부모 클래스의 메모리 공간을 가리키는 키워드 (생성자의 첫줄에 작성해야만 한다.)
		// 생성자의 맨 첫번째 줄에 부모 생성자를 먼저 호출해 줘야한다. (생략 시 부모의 (기본)생성자를 호출)
		// -> 부모의 기본생성자가 없다면 무조건 명시적으로 써줘야 함. super("매개변수");
		System.out.println("BusinessMan객체의 기본 생성자");
	}
	
	public BusinessMan(String name, String company, String position) {
		super(name);
		this.company = company;
		this.position = position;
	}


	// 메소드
	public void tellYourInfo() {
		System.out.println("my company is " + company);
		System.out.println("my position is " + position);
		this.tellYourName(); // super키워드를 통해 부모 메모리 접근 가능.
	}

	// getter / setter
	public String getCompany() {
		return company;
	}


	public void setCompany(String company) {
		this.company = company;
	}

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}
	
	// 

}
