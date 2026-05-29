package com.kh.example.poly2;

public class LibraryController {
	// 필드
	private Member mem = new Member();
	private Book[] bList = new Book[5];
	// 초기화 블록
	{
		bList[0] = new CookBook("백종원의 집밥", "백종원", "tvN", true);
		bList[1] = new AniBook("아기공룡 뿌꾸", "미티", "원모어", 19);
		bList[2] = new AniBook("루피의 원치스", "루피", "japan", 12);
		bList[3] = new CookBook("이혜정의 얼마나 맛있게요?", "이혜정", "문학", false);
		bList[4] = new CookBook("최현석의 날 따라해봐", "최현석", "소금책", true);
	}
	
	// 메소드
	public void insertMember(Member mem) {
		this.mem = mem;
	}
	
	public Member myInfo() {
		return mem;
	}
	
	public Book[] selectAll() {
		return bList;
	}
	
	public Book[] searchBook(String keword) {
		Book[] kList = new Book[bList.length];
		for (Book bl : bList) {
			Boolean contain = bl.getTitle().contains(keword);
			if (contain) {
				for (int i = 0; i< kList.length; i++) {
					if (kList[i] == null) {
						kList[i] = bl;
						break;
					}
				}
			}
		}
		return kList;
	}
	
	public int rentBook(int index) {
		int result = 0;
		
		if (bList[index] instanceof AniBook) {
			if (mem.getAge() < ((AniBook)bList[index]).getAccessAge()) {
				result = 1;		// -> 나이제한으로 대여 불가
			}
		} else if (bList[index] instanceof CookBook) {
			if (((CookBook)bList[index]).getCoupon()) {
				// member.couponCount++ 후 result = 2 대여성공 + 쿠폰 발급
				mem.setCouponCount(mem.getCouponCount() + 1);
				result = 2;		// -> 대여 성공
			}
		}
		
		return result;
	}
	
	
	
	
	
}
