package com.kh.example.poly1;

public class Animal {
	// 필드
	private String name;	// 이름
	private int age;		// 나이
	
	// 생성자
	public Animal() {
		super();
	}
	public Animal(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	
	// 메소드
	public void speak() {
		System.out.println("동물이 소리를 냅니다");
	}
	
	// getter / setter
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	
	

}
