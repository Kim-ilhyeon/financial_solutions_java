package com.kh.object.overload;

public class Man {
	// 필드
	String name;
	String number;	// 주민 등록 번호
	
	// 생성자
	// 자동 생성자 단축키 : alt + shift + s 누르고, o
	public Man(String name) {	// 초기화 값 -> 2개 | 전달 값 1개
//		this.name = name;
//		this.number = "입력안됨";
		this(name, "입력안됨");
		// this()를 통해서 해당 객체의 생성자를 생성자에서 호출할 수 있다.
	}

	public Man(String name, String number) {	// -> 초기화 값 -> 2개 | 전달 값 2개
		this.name = name;
		this.number = number;
	}
	
	// 메소드
	// 오버로딩 : 이름이 동일한 메서드를 매개변수를 달리하여 정의할 수 있다.
	public void showMyInfo() {
		System.out.println("저의 이름은 " + name + "입니다.");
	}

	public void showMyInfo(String gender) {
		System.out.println("저의 이름은 " + name + "입니다. 저는 " + gender + "입니다.");
	}

}
