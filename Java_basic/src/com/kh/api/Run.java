package com.kh.api;

public class Run {

	/*
	 * API (Application Programming Interface)
	 * : 프로그램을 만들 때 사용할 수 있도록 제공되는 미리 만들어진 기능의 모음
	 * 
	 * 자바 API : 자바 표준 라이브러리(다른 개발자가 특정 목적을 가지고 만들어서 공유해준 코드)
	 * - 자바에서는 기본 문법(변수, 제어문, 클래스 . . .)만 제공
	 * - 실제 개발에서는 문자열, 날짜 계산, 입출력, 네트워크 통신, 자료구조 등등 많은 기능이 필요함.
	 * - 이러한 기능들을 자바 개발팀에서 미리 구현해서 제공하는 클래스 or 인터페이스를 표준 API라고 함.
	 */
	public static void main(String[] args) {
		MathAPI ma = new MathAPI();
		StringAPI sa = new StringAPI();
		WrapperAPI wa = new WrapperAPI();
		DateAPI da = new DateAPI();
		
//		ma.method();
//		sa.method1();
//		sa.method2();
//		sa.method3();
//		wa.method();
		da.method();
		

	}

}
