package com.kh.example.inherit2;

import java.util.Scanner;

public class PersonMenu {
	// 필드
	private Scanner sc = new Scanner(System.in);
	private PersonController pc = new PersonController();
	
	// 메소드
	public void mainMenu() {
		Student[] sArr = pc.printStudent();
		Employee[] eArr = pc.printEmployee();
		while (true) {
			int[] cArr = pc.personCount();
			System.out.println("학생은 최대 " + sArr.length + "명까지 저장할 수 있습니다.");
			System.out.println("현재 저장된 학생은 " + cArr[0] + "명입니다.");
			System.out.println("사원은 최대 " + eArr.length + "명까지 저장할 수 있습니다.");
			System.out.println("현재 저장된 사원은 " + cArr[1] + "명입니다.");
			System.out.println();
			
			System.out.println("==== 메뉴 ====");
			System.out.println("1. 학생 메뉴");
			System.out.println("2. 사원 메뉴");
			System.out.println("9. 끝내기");
			System.out.print("메뉴 번호 : ");
			int menuNum = sc.nextInt();
			sc.nextLine();
			
			switch (menuNum) {
			case 1 : 
				studentMenu();
				break;
			case 2 : 
				employeeMenu();
				break;
			case 9 :
				return;
			default : 
				System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");
			}
		}
	}
	
	public void studentMenu() {
		while (true) {
			System.out.println("==== 학생 메뉴 ====");
			System.out.println("1. 학생 추가");
			System.out.println("2. 학생 보기");
			System.out.println("9. 메인으로");
			System.out.print("메뉴 번호 : ");
			int menuNum = sc.nextInt();
			sc.nextLine();
			
			switch (menuNum) {
			case 1 : 
				insertStudent();
				break;
			case 2 : 
				printStudent();
				break;
			case 9 :
				return;
			default:
				System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");
			}
		}
	}
	
	public void employeeMenu() {
		while (true) {
			System.out.println("==== 사원 메뉴 ====");
			System.out.println("1. 사원 추가");
			System.out.println("2. 사원 보기");
			System.out.println("9. 메인으로");
			System.out.print("메뉴 번호 : ");
			int menuNum = sc.nextInt();
			sc.nextLine();
			
			switch (menuNum) {
			case 1 : 
				insertEmployee();
				break;
			case 2 : 
				printEmployee();
				break;
			case 9 :
				return;
			default:
				System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");
			}
		}
	}
	
	public void insertStudent() {
		boolean notWhether = true;
		int[] cArr = pc.personCount();
		if (cArr[0] == 3) {
			System.out.println("학생을 담을 수 있는 공간이 꽉 찼기 때문에 학생 추가를 종료하고, 학생 메뉴로 돌아갑니다.");
			notWhether = false;
//			return;
		}
		while (notWhether) {
			System.out.print("학생 이름 : ");
			String name = sc.nextLine();
			System.out.print("학생 나이 : ");
			int age = sc.nextInt();
			System.out.print("학생 키 : ");
			double height = sc.nextInt();
			System.out.print("학생 몸무게 : ");
			double weight = sc.nextInt();
			System.out.print("학생 학년 : ");
			int grade = sc.nextInt();
			sc.nextLine();
			System.out.print("학생 전공 : ");
			String major = sc.nextLine();
			
			pc.insertStudent(name, age, height, weight, grade, major);
			cArr = pc.personCount();
			if (cArr[0] == 3) {
				System.out.println("학생을 담을 수 있는 공간이 꽉 찼기 때문에 학생 추가를 종료하고, 학생 메뉴로 돌아갑니다.");
				return;
			}
			System.out.print("그만하시려면 N(또는 n), 이어하시려면 아무 키나 누르세요 : ");
			char stop = sc.nextLine().toLowerCase().charAt(0);
			if (stop == 'n') {
				notWhether = false;
//				break;
			}
		}
	}
	
	public void printStudent() {
		int count = 0;
		Student[] sArr = pc.printStudent();
		for (Student st : sArr) {
			if (st == null) {
				if (count == 0) {
					System.out.println("현재 저장된 학생은 0명입니다.");
				}
				break;
			}
			System.out.println(st.toString());
			count++;
		}
	}
	
	public void insertEmployee() {
		boolean notWhether = true;
		int[] cArr = pc.personCount();
		if (cArr[1] == 10) {
			System.out.println("사원을 담을 수 있는 공간이 꽉 찼기 때문에 사원 추가를 종료하고, 사원 메뉴로 돌아갑니다.");
			notWhether = false;
			return;
		}
		while (notWhether) {
			System.out.print("사원 이름 : ");
			String name = sc.nextLine();
			System.out.print("사원 나이 : ");
			int age = sc.nextInt();
			System.out.print("사원 키 : ");
			double height = sc.nextInt();
			System.out.print("사원 몸무게 : ");
			double weight = sc.nextInt();
			System.out.print("사원 급여 : ");
			int salary = sc.nextInt();
			sc.nextLine();
			System.out.print("사원 부서 : ");
			String dept = sc.nextLine();
			
			pc.insertEmployee(name, age, height, weight, salary, dept);
			cArr = pc.personCount();
			if (cArr[1] == 10) {
				System.out.println("사원을 담을 수 있는 공간이 꽉 찼기 때문에 사원 추가를 종료하고, 사원 메뉴로 돌아갑니다.");
				return;
			}
			System.out.print("그만하시려면 N(또는 n), 이어하시려면 아무 키나 누르세요 : ");
			char stop = sc.nextLine().toLowerCase().charAt(0);
			if (stop == 'n') {
				notWhether = false;
			}
		}
	}
	
	public void printEmployee() {
		int count = 0;
		Employee[] eArr = pc.printEmployee();
		for (Employee emp : eArr) {
			if (emp == null) {
				if (count == 0) {
					System.out.println("현재 저장된 사원은 0명입니다.");
				}
				break;
			}
			System.out.println(emp.toString());
			count++;
		}
	}
	
	
}
