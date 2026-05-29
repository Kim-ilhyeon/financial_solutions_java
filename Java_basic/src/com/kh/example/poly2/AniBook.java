package com.kh.example.poly2;

public class AniBook extends Book {
	// 필드
	private int accessAge;		// 제한 나이
	
	// 생성자
	public AniBook() {
		super();
	}
	
	public AniBook(String title, String author, String publisher, int accessAge) {
		super(title, author, publisher);
		this.accessAge = accessAge;
	}
	
	
	// 메소드
	@Override
	public String toString() {
		return "AniBook [" + super.toString() + ", accessAge : " + this.accessAge + "]";
	}
	
	
	// getter / setter
	public int getAccessAge() {
		return accessAge;
	}

	public void setAccessAge(int accessAge) {
		this.accessAge = accessAge;
	}
	
	
	
	
}
