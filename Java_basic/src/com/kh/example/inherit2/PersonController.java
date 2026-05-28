package com.kh.example.inherit2;

public class PersonController {
	// 필드
	private Student[] s = new Student[3];		// 학생 객체 배열
	private Employee[] e = new Employee[10];	// 사원 객체 배열
	
	// 메소드
	public int[] personCount() {
		int[] cArr = new int[2];
		int sCount = 0;
		int eCount = 0;
		for (Student st : s) {
			if (st == null) {
				break;				
			}
			sCount++;
		}
		for (Employee emp : e) {
			if (emp == null) {
				break;
			}
			eCount++;
		}
		cArr[0] = sCount;
		cArr[1] = eCount;
		return cArr;
	}

	public void insertStudent(String name, int age, double height, double weight, int grade, String major) {
		for (int i = 0; i < s.length; i++) {
			if (s[i] == null) {
				s[i] = new Student(name, age, height, weight, grade, major);
				break;
			}
		}
	}
	
	public Student[] printStudent() {
		return s;
	}
	
	public void insertEmployee(String name, int age, double height, double weight, int salary, String dept) {
		for (int i = 0; i< e.length; i++) {
			if (e[i] == null) {
				e[i] = new Employee(name, age, height, weight, salary, dept);
				break;
			}
		}
	}
	
	public Employee[] printEmployee() {
		return e;		
	}

	

}
