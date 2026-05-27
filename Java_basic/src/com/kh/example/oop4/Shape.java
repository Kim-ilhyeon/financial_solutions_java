package com.kh.example.oop4;

public class Shape {
	// 필드
	private int type;		// 도형 타입 번호 (3=삼각형, 4=사각형)
	private double height;	// 높이
	private double width;	// 너비
	private String color = "white";	// 색상 (기본값 : white)
	
	// 생성자
	public Shape() {
	}
	public Shape(int type, double height, double width) {
		this.type = type;
		this.height = height;
		this.width = width;
//		this.color = "white";
	}
	
	// 메소드
	public String information() {
		String result = this.height + " " + this.width + " " + this.color;
		return result;
	}
	
	// getter / setter
	public int getType() {
		return type;
	}
	public void setType(int type) {
		this.type = type;
	}
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	public double getWidth() {
		return width;
	}
	public void setWidth(double width) {
		this.width = width;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		if (color == "") {
			this.color = "white";
		}
		this.color = color;
	}
	
	
	
	

}
