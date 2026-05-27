package com.kh.option;

public class Counter {
	// 클래스 변수 (static 변수) -> 프로그램 시작과 동시에 static 메모리에 별도로 할당, 프로그램 종료 시 반환
	static int count = 0;
	
	// 인스턴스 변수 -> heap메모리에 객체 생성 시 할당되는 변수
	private String name;

	public Counter(String name) {
		this.name = name;
		count++;	// 객체 생성 시 마다 1증가
	}
	
	public void printCount() {
		System.out.println("count : " + this.count);
	}
	
	public static void showCount() {
		System.out.println("count : " + count);
	}
	

}
