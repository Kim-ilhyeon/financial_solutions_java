package com.kh.object.ex1;

/*
 * 접근 제한자 class 클래스명 {
 * 		// 필드 -> 사용할 데이터를 선언하는 영역
 * 				(고유한 값을 가지는 필드가 있는 것을 '권장'한다.
 * 
 * 		// 생성자 -> 데이터를 초기화하기 위한 특수목적의 메소드
 * 
 * 		// 메소드 -> 클래스의 기능을 정의하는 영역
 * 
 * }
 */
public class Student {
	// 필드 영역
	String name;
	int age;
	
	// 생성자 영역
	
	// 메소드 영역
	// /내 정보를 출력하는 기능
	public void myInfo() {
		System.out.printf("안녕하세요. 저는 %d살의 %s입니다.\n", age, name);
	}
	
}
