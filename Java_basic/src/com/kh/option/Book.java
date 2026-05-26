package com.kh.option;

/*
 * 정보은닉 : 객체 내 정보를 의도와 다르게 변경하는 것을 막기 위해
 * 		   직접 접근을 막고 메소드를 통해 접근 방식을 사용하는 것.
 * 
 * 직접접근을 막는 방법 = 접근 제한자를 사용.
 * 접근 제한자 :  클래스, 필드, 메소드 등 구성요소의 접근 범위를 제한하는 키워드이다.
 *  public > protected > default > private
 * 
 * - public : 어디서든 접근 가능
 * - protected : 같은 패키지 + 상속 관계에 있는 경우
 * - default : 같은 패키지
 * - private : 오직 클래스 내에서만 접근 가능
 */
public class Book {
	// 필드 (private)
	private String title;			// 제목
	private String publisher;		// 출판사
	private String author;			// 저자
	private int price;				// 가격
	private double discountRate;	// 할인율
	
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
	
	// getter / setter
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getPublisher() {
		return publisher;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		if (price < 0) {
			this.price = 0;
			return;
		}
		this.price = price;
	}

	public double getDiscountRate() {
		return discountRate;
	}

	public void setDiscountRate(double discountRate) {
		if (discountRate < 0 || discountRate > 1) {
			this.discountRate = 0;
			return;
		}
		this.discountRate = discountRate;
	}
	
	

}
