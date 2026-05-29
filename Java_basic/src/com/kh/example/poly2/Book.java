package com.kh.example.poly2;

public class Book {
	// 필드
	private String title;		// 도서명
	private String author;		// 저자명
	private String publisher;	// 출판사명
	
	// 생성자
	public Book() {
		super();
	}
	public Book(String title, String author, String publisher) {
		super();
		this.title = title;
		this.author = author;
		this.publisher = publisher;
	}

	
	// 메소드
	public String toString() {
		return "Book [title : " + this.title + ", author : " + this.author + ", publisher : " + this.publisher;
	}
	
	
	// getter / setter 
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getPublisher() {
		return publisher;
	}
	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}

	

}
