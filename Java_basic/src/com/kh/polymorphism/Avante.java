package com.kh.polymorphism;

public class Avante extends Car {

	public Avante(String color, String fuel, int year) {
		super(color, fuel, year);
	}

	@Override
	public void drive() {
		System.out.println("슈웅~ 슈웅~");
	}
	
	public void moveAvante() {
		System.out.println("빵빵~ Avante");
	}
	
	public void driveCar(Car c) {
		if (c instanceof Avante) {
			((Avante)c).moveAvante();			
		} else {
			System.out.println("실제객체가 아반떼를 포함하지 않음");
		}
	}

	@Override
	public String toString() {
		return super.toString() + "차종 : Avante";
	}
	
	
	
	
	

}
