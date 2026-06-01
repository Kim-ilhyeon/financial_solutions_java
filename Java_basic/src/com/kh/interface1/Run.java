package com.kh.interface1;

public class Run {
	public static void main (String[] args) {
		// interface는 객체 생성을 할 수는 없지만 참조변수로는 사용이 가능하다.
		Animal dog1 = new Dog();
		
		dog1.speak();
		dog1.move();
		
//		dog1.eat();		// 참조타입이 Animal이므로 eat()호출 불가능
		((Dog)dog1).eat();
	}

}
