package com.kh.array;

import java.util.Scanner;

public class Array2DTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		/*
		 * 사용자에게 행(m)과 열(n)을 입력받아 m행 n열의 빙고판을 만들어라.
		 * 그리고 행과 열에 들어갈 문자를 각각 입력받아 저장한 쉬 출력해라.
		 * 
		 * [console]
		 * 행 : 2
		 * 열 : 3
		 * 
		 * 1행 1열 : 바나나
		 * 1행 2열 : 배
		 * . . .
		 * 2행 3열 : 딸기
		 * 
		 * 바나나 배 수박
		 * 귤 거봉 딸기
		 */
		/*
		System.out.print("행 : ");
		int row = sc.nextInt();
		System.out.print("열 : ");
		int col = sc.nextInt();
		sc.nextLine();
		
		// 입력받은 행과 열만큼의 2차원 배열 생성
		String[][] dArray = new String[row][col];
		
		for (int i = 0; i < dArray.length; i++) {
			for (int j = 0; j < dArray[i].length; j++) {
				System.out.printf("%d행 %d열 : ", i+1, j+1);
				String word = sc.nextLine();
				dArray[i][j] = word;
			}
		}
		
		// 2차원 배열 전체출력
		System.out.println("====출력====");
		for (int i = 0; i < dArray.length; i++) {
			for (int j = 0; j < dArray[i].length; j++) {
				System.out.print(dArray[i][j] + " ");
			}
			System.out.println();
		}
		*/
		
		/*
		 * 사용자에게 좌석의 행과 열을 입력받아 좌석을 생성한다.
		 * 각 좌석에 들어갈 관객의 이름을 입력받아 저장한 뒤
		 * 모두 입력받았으면 좌석표를 출력해라.
		 * 
		 * [console]
		 * 행(줄)의 수 : 2
		 * 열(좌석)의 수 : 3
		 * 1행 1열 : 철수
		 * 1행 2열 : 민수
		 * . . .
		 * ==== 좌석표 ====
		 * 철수 민수 ...
		 * 민지 나미 ...
		 */
		System.out.print("행(줄)의 수 : ");
		int row = sc.nextInt();
		System.out.print("열(좌석)의 수 : ");
		int col = sc.nextInt();
		sc.nextLine();	// 버퍼 비우기
		
		String[][] seat = new String[row][col];
		for (int i = 0; i < seat.length; i++) {
			for (int j = 0; j < seat[i].length; j++) {
				System.out.printf("%d행 %d열 : ", i+1, j+1);
				String name = sc.nextLine();
				seat[i][j] = name;
			}
		}
		
		// 2차원 배열 전체 출력
		System.out.println("==== 좌석표 ====");
		for (int i = 0; i < seat.length; i++) {
			for (int j = 0; j < seat[i].length; j++) {
				System.out.print(seat[i][j] + " ");
			}
			System.out.println();
		}
		
		

	}

}
