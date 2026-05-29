package com.kh.polymorphism;

public class CheeseCake extends Cake {
	
	public void milky() {
		System.out.println("치즈케이크는 느끼하다.");
	}

	
	// 부모 클래스의 Cake에도 void yummy()메소드가 존재함
	// => 자식 클래스에서 재정의
	@Override
	public void yummy() {
		System.out.println("치즈케이크 냠냠");
	}
	
}
