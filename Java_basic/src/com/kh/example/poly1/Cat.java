package com.kh.example.poly1;

public class Cat extends Animal {
	// 필드
	private String color;	// 털 색상
	
	// 생성자
	public Cat() {
		super();
	}
	
	public Cat(String name, int age, String color) {
		super(name, age);
		this.color = color;
	}


	// 메소드	
	@Override
	public void speak() {
		System.out.println("야옹!");
	}
	
	
	// getter / setter
	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	
	
	
	
	
	
}
