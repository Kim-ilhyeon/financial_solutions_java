package com.kh.example.inherit;

public class Rectangle extends Point {
	// 필드
	private int width;		// 너비
	private int height;		// 높이
	
	// 생성자
	public Rectangle() {
		super();
	}
	public Rectangle(int width, int height) {
		super();
		this.width = width;
		this.height = height;
	}
	
	
	// 메소드
	public String toString() {
		return super.toString() + ", " + height + ", " + width;
	}
	
	// getter / setter
	public int getWidth() {
		return width;
	}
	public void setWidth(int width) {
		this.width = width;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	
	
	
	
}
