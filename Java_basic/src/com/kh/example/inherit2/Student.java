package com.kh.example.inherit2;

public class Student extends Person {
	// 필드
	private int grade;		// 학년
	private String major;	// 전공
	
	// 생성자
	public Student() {
		super();
	}
	public Student(String name, int age, double height, double weight, int grade, String major) {
		super(name, age, height, weight);
		this.grade = grade;
		this.major = major;
	}

	// 메소드
	public int getGrade() {
		return grade;
	}
	public void setGrade(int grade) {
		this.grade = grade;
	}
	public String getMajor() {
		return major;
	}
	public void setMajor(String major) {
		this.major = major;
	}

	public String toString() {
		return super.toString() + ", " + this.grade + ", " + this.major;
	}
	
	

}
