package com.kh.inherit;

	/*
	 * 상속이란 ? 
	 * : 부모클래스의 필드와 메소드를 자식클래스가 물려 받아 사용하는 것. (부모의 규칙을 물려받는 느낌)
	 * -> 자식객체 생성 시 -> 부모클래스 생성자 실행 -> 자식클래스 생성자 실행
	 * => 부모부분과 자식부분이 순차적으로 메모리 구조를 만듦 (자식객체 내부에는 부모객체의 메모리공간이 존재한다의 개념이다.)
	 * 
	 * 장점
	 * 1. 재사용성과 생산성이 증가
	 * 2. 유지보수성이 증가
	 * 
	 * 특징
	 * : 단일 상속만 가능하다. (다중 상속은 불가 = 부모는 하나이다.)
	 * 
	 * super키워드
	 * - 자식 생성자 첫줄에는 super(...)키워드를 통한 부모생성자 호출 가능
	 *   (생략 시 부모클래스의 기본생성자가 자동 호출, 부모클래스의 기본생성자가 없을 경우에는 명시적으로 작성해줘야 함)
	 *   
	 * Object 클래스
	 * - 모든 클래스는 Object라는 최상위 클래스를 상속 받는다.
	 * - Object클래스의 메소드 : toString(), equals(), hashcode() 등은 모든 클래스에서 사용 가능하다.
	 */
public class Run {
	public static void main (String[] args) {
		/*
			Man m1 = new Man();
			m1.setName("김일현");
			m1.tellYourName();
			
			BusinessMan bm1 = new BusinessMan();
			bm1.setName("김우진");
			bm1.tellYourName();
		*/
		
		Desktop d1 = new Desktop();
		Desktop d2 = new Desktop("d-100", 1000000, "LG", false);
		
		TV t1 = new TV();
		TV t2 = new TV("t-100", 2000000, "LG", 75);
		
		System.out.println(d2.inform());
		System.out.println(t2.inform());
		
		
	}
	
	
}
