package com.kh.example.inherit;

public class CircleController {
	// 필드
	private Circle c = new Circle();
	
	// 메소드
	public String calcArea(int x, int y, int radius) {
		c.setX(x);
		c.setY(y);
		c.setRadius(radius);
		return "면적 : " + c.toString() + " / " + (Math.PI * c.getRadius() * c.getRadius());
	}
	
	public String calcCircum (int x, int y, int radius) {
		c.setX(x);
		c.setY(y);
		c.setRadius(radius);
		return "둘레 : " + c.toString() + " / " + Math.PI * c.getRadius() * 2;
	}
	
	
}
