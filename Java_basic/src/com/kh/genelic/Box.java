package com.kh.genelic;

// <T> : T라고 우선 임의로 타입을 정해놓고, 실제 인스턴스 생성시 타입을 정하겠다.
public class Box <T> {
	private T value;
	private T[] arr;
	private int num;
	
	// 생성자
	public Box() {
		super();
	}
	public Box(T value, T[] arr, int num) {
		super();
		this.value = value;
		this.arr = arr;
		this.num = num;
	}
	
	
	// 메소드
	
	
	
	
	// getter / setter
	public T getValue() {
		return value;
	}
	public void setValue(T value) {
		this.value = value;
	}
	public T[] getArr() {
		return arr;
	}
	public void setArr(T[] arr) {
		this.arr = arr;
	}
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	
	
	
}
