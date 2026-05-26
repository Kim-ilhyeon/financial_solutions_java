package com.kh.example.oop2;

public class Student {
	// 필드
	int grade;			// 학년
	int classroom;		// 반
	String name;		// 이름
	double height;		// 키
	char gender;		// 성별
	
	// 생성자
	

	// 메소드
	String informatino() {
		/* 확인용]
		System.out.println(grade);
		System.out.println(classroom);
		System.out.println(name);
		System.out.println(height);
		System.out.println(gender);
		*/
		String result = grade + ", " + classroom + ", " + name + ", " + height + ", " + gender;
		return result;
	}

	// getter / setter (alt + shift + s 하고 나서 r)
	public int getGrade() {
		return grade;
	}

	public void setGrade(int grade) {
		this.grade = grade;
	}

	public int getClassroom() {
		return classroom;
	}

	public void setClassroom(int classroom) {
		this.classroom = classroom;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public char getGender() {
		return gender;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}
	

}
