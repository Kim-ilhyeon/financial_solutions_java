package com.kh.object.ex1;

public class Run {

	/*
	 * 해당 클래스는 객체를 생성하기 위한 클래스가 아닌 실행을 위한 main메소드를 포함한 클래스
	 */
	public static void main(String[] args) {
		// 학생
		
		// 객체를 생성할 때
		// class명 객체이름; -> class타입의 참조변수 생성
		Student kim;
		// 객체이름 = new class명() -> 새로운 class타입의 메모리가 생성 -> 객체 생성
		kim = new Student();
		
		kim.name = "김일현";	// -> kim이 가진 주소값의 메모리에 있는 객체의 name에 "김일현" 값 저장(초기화)
		kim.age = 16;
		kim.myInfo();
		
		System.out.println(kim);
		
		Student park = new Student();
		park.name = "박지수";
		park.age = 19;
		park.myInfo();
		
		System.out.println(park);
		
	}

}
