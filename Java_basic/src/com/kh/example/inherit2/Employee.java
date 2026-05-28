package com.kh.example.inherit2;

public class Employee extends Person {
	// 필드
	private int salary;		// 급여
	private String dept;	// 부서
	
	// 생성자
	public Employee() {
		super();
	}
	public Employee(String name, int age, double height, double weight, int salary, String dept) {
		super(name, age, height, weight);
		this.salary = salary;
		this.dept = dept;
	}

	// 메소드
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}

	public String toString() {
		return super.toString() + ", " + this.salary + ", " + this.dept;
	}
	
	
	
}
