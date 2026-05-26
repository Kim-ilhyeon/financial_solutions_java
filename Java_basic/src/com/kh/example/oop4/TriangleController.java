package com.kh.example.oop4;

public class TriangleController {
	// 필드
	private Shape s = new Shape();
	
	// 메소드
	public double calcArea (double height, double width) {
		s = new Shape(0, height, width);
		return s.getWidth() * s.getHeight() / 2;
	}
	
	public void paintColor(String color) {
		s.setColor(color);
	}
	
	public String print() {
		return ("삼각형 " + s.information());
	}

}
