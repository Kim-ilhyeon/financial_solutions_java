package com.kh.array.practice;

import java.util.Scanner;

public class Practice9 {

	/*
	 * [색동이]
	 * 가로, 세로의 크기가 각각 100인 정사각형 모양의 흰색 도화지가 있다.
	 * 이 도화지 위레 가로, 세로의 크기가 각각 10인 정사각형 모양의 검은색 색종이를 색종이의 변과 도화지의 변이 평행하도록 붙인다.
	 * 이러한 반식으로 색종이를 한장 또는 여러장 붙인 후 색종이가 붙은 검은 영역의 넓이를 구하는 프로그램을 작성하시오.
	 * 
	 * (입력 조건)
	 * - 첫째 줄에 색종이의 수가 주어진다.
	 * 	이어 둘째 줄부터 한줄에 하나씩 색종이를 붙인 위치가 주어진다. 
	 * 	색종이를 붙인 위치는 두개의 자연수로 주어지는데 첫번째 자연수는 색종이의 왼쪽 변과 도화지의 왼쪽 변 사이의 거리이고,
	 * 	두번째 자연수는 색종이의 아래쪽 변과 도화지의 아래쪽 변 사이의 거리이다.
	 * 	색종이의 수는 100장 이하이며, 색종이가 도화지 밖으로 나가는 경우는 없다.
	 * 
	 * (출력 조건)
	 * - 첫째 줄에 색종이가 붙은 검은 영역의 넓이를 출력한다.
	 * 
	 * [console]
	 * (입력)
	 * 3
	 * 3 7
	 * 15 7
	 * 5 2
	 * 
	 * (출력)
	 * 260
	 * 
	 * (요구사항 요약)
	 * - 도화지를 100 x 100의 2차원 배열로 표현 (boolean 또는 0/1)
	 * - 각 색종이에 대해 x <= i < x+10, y <= j < y+10 칸을 표시
	 * - 모든 색종이 처리 후, 표시된 칸의 개수(=넓이) 합산
	 * - 겹친 칸은 한번만 카운트
	 * 
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// 색종이의 갯수만큼 넓이 계산 후 겹치는 부분의 넓이를 구해서 빼준다.
		
		boolean[][] paper = new boolean[100][100];
		
		// 색종이의 갯수 confetti
		int pNum = sc.nextInt();
		
//		int[][] confetti = new int[pNum][2];
		
		for (int i = 0; i < pNum; i++) {
			// 왼쪽 아래 모서리 점의 좌표
			int x = sc.nextInt();
			int y = sc.nextInt();
			
			for (int j = x; j < x+10; j++) {
				for (int k = y; k < y+10; k++) {
					paper[j][k] = true;					
				}
			}
		}
		
		int count = 0;
		for (int i = 0; i < paper.length; i++) {
			for (int j = 0; j < paper[i].length; j++) {
				if (paper[i][j]) {
					count++;
				}
			}
		}
		
		System.out.println("count : " + count);
		
		

	}

}
