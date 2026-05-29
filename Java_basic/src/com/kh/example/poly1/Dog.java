package com.kh.example.poly1;

public class Dog extends Animal {
	// 필드
	private String breed;	// 견종

	
	// 생성자
	public Dog() {
		super();
	}
	
	public Dog(String name, int age, String breed) {
		super(name, age);
		this.breed = breed;
	}

	
	
	// 메소드
	@Override
	public void speak() {
		System.out.println("멍멍!");
	}
	

	// getter / setter
	public String getBreed() {
		return breed;
	}
	

	public void setBreed(String breed) {
		this.breed = breed;
	}
	
	
	
	
	
	
	
}
