package com.kh.example.inherit;

public class Circle extends Point {
	// 필드
	private int radius;	// 반지름

	
	// 생성자
	public Circle() {
		super();
	}
	
	public Circle(int radius) {
		super();
		this.radius = radius;
	}

	
	// 메소드
	public String toString() {
		return super.toString() + ", " + radius;
	}

	// getter / setter
	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}
	
	
}
