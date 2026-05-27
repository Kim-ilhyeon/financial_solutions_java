package com.kh.option;

public class Run {

	/*
	 * [package]
	 * : 클래스 간 공간적 충돌이나 접근 방법의 충돌을 막기위해
	 * 	 저장위치를 구분해서 명확하게 접근할 수 있도록 해주는 개념
	 * 
	 * 네이밍 방식
	 * 
	 * 도메인 : www.kh.com 일 경우
	 * 패키지 : com.kh.팀명 / com.kh.프로젝트명 . . .
	 */
	
	/*
	 * static 메소드
	 * : 인스턴스 변수 없이 클래스 단위로 호출이 가능
	 * 클래스.static메소드
	 * (일반적으로 객체상태와 무관하게 동작하는 기능 구현 시 사용)
	 * 인스턴스 변수, 인스턴스 메소드에 접근 불가.
	 */
	
	/*
	 * static 변수
	 * : 클래스에 소속된 모든 인스턴스가 공유하는 변수, 하나 클래스에서 공통적인 값을 유지할 때 사용.
	 * -> 일반적으로 final과 함께 많이 사용됨.
	 */
	public static void main(String[] args) {
		Counter.showCount();	// static 메소드 (클래스 메소드)
		
		Counter c1 = new Counter("첫번째");
		Counter.showCount();	// static 메소드 (클래스 메소드)
		c1.printCount();
		Counter c2 = new Counter("두번째");
		Counter.showCount();	// static 메소드 (클래스 메소드)
		c2.printCount();
		Counter c3 = new Counter("세번째");
		Counter.showCount();	// static 메소드 (클래스 메소드)
		c3.printCount();

	}

}
