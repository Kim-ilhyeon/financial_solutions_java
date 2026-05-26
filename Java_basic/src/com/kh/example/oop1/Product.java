package com.kh.example.oop1;

public class Product {
	// 필드
	String pName;	// 상품명
	int price;		// 가격
	String brand;	// 브랜드명
	
	// 생성자
	// 기본 생성자는 작성하지 않아도 컴파일 시 확인 후 자동으로 생성됨.
	public Product() {
		
	}
	
	// 메소드
	void information() {
		System.out.printf("상품명 : %s\n가격 : %d\n브랜드명 : %s\n", this.pName, this.price, this.brand);
	}
	
	
	
}
