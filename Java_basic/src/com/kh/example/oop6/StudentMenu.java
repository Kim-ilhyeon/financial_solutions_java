package com.kh.example.oop6;

public class StudentMenu {
	// 필드
	private StudentController ssm = new StudentController();
	
	// 생성자
	public StudentMenu() {
		// 학생 정보 출력
		System.out.println("======= 학생 정보 출력 =======");
		Student[] sArr = ssm.printStudent();
		for (Student st : sArr) {
			if (st == null) {
				break;
			}
			System.out.println(st.inform());
		}
		System.out.println();
		
		
		// 학생 성적 출력
		System.out.println("======= 학생 성적 출력 =======");
		double[] aArr = ssm.avgScore();
		System.out.println("학생 점수 합계 : " + aArr[0]);
		System.out.println("학생 점수 평균 : " + aArr[1]);
		System.out.println();
		
		// 성적 결과 출력
		System.out.println("======= 성적 결과 출력 =======");
		for (Student st : sArr) {
			if (st == null) {
				break;
			}
			System.out.print(st.getName() + "학생은 ");
			if (st.getScore() < StudentController.CUT_LINE) {
				System.out.println("재시험 대상입니다.");
			} else {
				System.out.println("통과입니다.");
			}
		}
		System.out.println();
		
		
	}
	
	
}
