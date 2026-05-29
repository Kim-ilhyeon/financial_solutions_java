package com.kh.example.poly2;

public class CookBook extends Book {
	// 필드
	private boolean coupon;		// 요리학원 쿠폰 유무

	
	// 생성자
	public CookBook() {
		super();
	}
	
	public CookBook(String title, String author, String publisher, boolean coupon) {
		super(title, author, publisher);
		this.coupon = coupon;
	}

	
	// 메소드
	@Override
	public String toString() {
		return "CookBook [" + super.toString() + ", coupon : " + this.coupon + "]";
	}
	
	
	// getter / setter
	public boolean getCoupon() {
		return coupon;
	}
	
	public void setCoupon(boolean coupon) {
		this.coupon = coupon;
	}
	
	
}
