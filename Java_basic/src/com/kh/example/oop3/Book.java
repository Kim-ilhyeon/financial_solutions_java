package com.kh.example.oop3;

public class Book {
	// 필드
	String title;			// 제목
	String publisher;		// 출판사
	String author;			// 저자
	int price;				// 가격
	double discountRate;	// 할인율
	
	// 생성자
	// 기본 생성자
	public Book() {
	}
	
	// 매개변수 3개 생성자 (제목, 출판사, 저자)
	public Book(String title, String publisher, String author) {
//		this.title = title;
//		this.publisher = publisher;
//		this.author = author;
		this(title, publisher, author, 0, 0);
	}

	// 매개변수 5개 생성자 (제목, 출판사, 저자, 가격, 할인율)
	public Book
		(String title, 
		 String publisher,
		 String author,
		 int price,
		 double discountRate) {
			this.title = title;
			this.publisher = publisher;
			this.author = author;
			this.price = price;
			this.discountRate = discountRate;
	}
	
	
	// 메소드
	void inform() {
		System.out.printf("제목 : %s\n출판사 : %s\n저자 : %s\n가격 : %d\n할인율 : %f\n", title, publisher, author, price, discountRate);
	}

}
