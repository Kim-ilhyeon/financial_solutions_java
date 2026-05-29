package com.kh.interface1;

/*
 * 
 */
public interface Animal {
	/*public static final */ int NUM = 0;
	
	// 추상 메소드
	// interface에서는 추상메소드만 사용이 가능하기 때문에 -> 기본적으로 abstract키워드를 사용하지 않아도 abstract(추상)메소드로 생성이 된다.
	/* public abstract */ void speak();
	
	public abstract void move();
	
}
