package com.kh.io2;

import java.io.Serializable;

public class Product implements Serializable {
	// 필드
	private String pName;	// 상품명
	private int price;		// 가격
	private String brand;	// 브랜드
	
	// 생성자
	public Product() {
		super();
		System.out.println("Product 기본생성자 호출됨");
	}
	public Product(String pName, int price, String brand) {
		super();
		this.pName = pName;
		this.price = price;
		this.brand = brand;
	}
	
	// 메소드
	@Override
	public String toString() {
		return "상품명 : " + pName + " / 가격 : " + price + " / 브랜드 : " + brand;
	}
	
	// getter / setter
	public String getpName() {
		return pName;
	}
	public void setpName(String pName) {
		this.pName = pName;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	
	

}