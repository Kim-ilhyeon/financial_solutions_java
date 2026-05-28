package com.kh.example.inherit;

public class Point {
	// 필드
	private int x;	// x좌표
	private int y;	// y좌표
	
	// 생성자
	public Point() {
		super();
	}
	public Point(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}

	// 메소드
	public String toString() {
		return x + ", " + y;
	}
	
	// getter / setter
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	
	
}
