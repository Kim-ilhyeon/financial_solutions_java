package com.kh.collection.set;

import java.util.Objects;

public class Human {
	// 필드
	private String name;
	private int age;
	
	// 생성자
	public Human() {
		super();
	}
	public Human(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	
	
	// 메소드
	
	
	
	// getter / setter
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	// toString() 단축키 : (Shift + alt + s) => s 후에 필요한 필드 체크 후 Generate
	@Override
	public String toString() {
		return "Human [name=" + name + ", age=" + age + "]";
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(name, age);
	}
	
	@Override
	// 객체 생성 시 객체비교를 할 일이 있는 객체라면 equals()를 재정의 해야함.
	public boolean equals(Object obj) {
		if (obj instanceof Human) {	// 주소 값은 다르지만 Human객체라면 필드 비교를 통해 확인
			Human h = (Human)obj;
			return this.name.equals(h.getName()) && this.age == h.getAge();
		}
		return super.equals(obj);
	}
	
	
}
