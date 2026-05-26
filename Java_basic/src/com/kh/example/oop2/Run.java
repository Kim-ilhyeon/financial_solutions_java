package com.kh.example.oop2;

public class Run {

	public static void main(String[] args) {
		Student s1 = new Student();

		System.out.println(s1.informatino());
		
		s1.grade = 1;
		s1.classroom = 2;
		// setter와 getter는 필드값을 저장하거나 반환하는 메소드
		s1.setName("김일현");
		s1.setClassroom(4);
		System.out.println(s1.getName());
		System.out.println(s1.informatino());
		
	}

}
