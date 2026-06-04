package com.kh.genelic;

public class Run {

	/*
	 * 제네릭
	 * : 제네릭을 사용하지 않고 Object같은 넓은 범위를 수용할 수 있는 타입을 사용 시
	 * -> 형변환 필요, 런타임 오류가 생길 수 있음.
	 * 클래스나 메소드가 사용할 데이터 타입을 컴파일 시점에 지정할 수 있도록 지원하는 문법 -> 매개타입
	 * "필드, 메소드의 타입을 객체 생성 시에 전달받아서 사용한다."
	 */
	public static void main(String[] args) {
		Box aBox = new Box<>();
		aBox.setValue("10");
		// 제네릭 사용 후 타입을 전달하지 않으면 기본적으로 Object로 지정됨.
		int num = Integer.parseInt((String)aBox.getValue());
		System.out.println(num);
		
		Box<Integer> iBox = new Box<>();
//		iBox.setValue("10");	// 매개타입을 Integer로 전달했기 때문에 String전달 불가능
		iBox.setValue(10);
		int num2 = iBox.getValue();
	}

}
