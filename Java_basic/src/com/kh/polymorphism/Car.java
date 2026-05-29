package com.kh.polymorphism;

public class Car {
	private String color;
	private String fuel;
	private int year;
	
	
	public Car() {
		super();
	}
	public Car(String color, String fuel, int year) {
		super();
		this.color = color;
		this.fuel = fuel;
		this.year = year;
	}
	
	
	public void drive() {
		System.out.println("부릉부릉~");
	}
	
	
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getFuel() {
		return fuel;
	}
	public void setFuel(String fuel) {
		this.fuel = fuel;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	
	
	// alt + shift + s => s 누르면 toString()메소드를 오버라이딩 해준다.
	// Object에 있는 toString() 메소드를 오버라이딩 한다.
	@Override
	public String toString() {
		return "Car [color=" + color + ", fuel=" + fuel + ", year=" + year + "]";
	}
	
	
	
	

}
