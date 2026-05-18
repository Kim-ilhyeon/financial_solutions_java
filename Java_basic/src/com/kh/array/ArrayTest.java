package com.kh.array;

import java.util.Scanner;

public class ArrayTest {

	public static void main(String[] args) {
		// 1. 크기가 10인 정수형 배열 numArr을 하나 생성.
		int[] numArr = new int[10];
		
		// 2. 반복문을 통해서 numArr의 모든 값을 10으로 초기화.
		for (int i = 0; i < numArr.length; i++) {
			numArr[i] = 10;
		}
		
		// 3. for-each를 통해서 모든 배열의 요소를 출력.
		for (int na : numArr) {
			System.out.print(na + " ");
		}
		System.out.println();
		
		// 4. 사용자에게 배열의 길이를 입력받아, 입력받은 크기의 문자열 배열 nameArr를 생성.
		Scanner sc = new Scanner(System.in);
		System.out.print("배열의 길이 : ");
		int leng = sc.nextInt();
		sc.nextLine();
		String[] nameArr = new String[leng];
		
		// 5. 사용자에게 이름을 입력 받아서 nameArr에 할당
		// (nameArr의 모든 요소에 이름이 들어갈 수 있도록 반복)
		/*
		 * [console]
		 * 배열의 길이 : 3
		 * 이름 입력 : xxx
		 * 이름 입력 : xxx
		 * 이름 입력 : xxx
		 * ====입력 완료====
		 * xxx xxx xxx
		 */
		for (int i = 0; i < leng; i++) {
			System.out.print("이름 입력 : ");
			String name = sc.nextLine();
			nameArr[i] = name;
		}
		System.out.println("====입력 완료====");
		
		for (String na : nameArr) {
			System.out.print(na + " ");
		}
		System.out.println();
		
		// 6. 사용자에게 이름을 하나 입력받아, nameArr에 동일한 이름이 있다면
		// 		동일한 이름이 존재합니다. / 동일한 이름이 존재하지 않습니다. 출력
		System.out.print("이름 입력 : ");
		String name = sc.next();
		boolean same = false;
		
		for(String na : nameArr) {
			if (na.equals(name)) {
				same = true;
				break;
			}
		}
		
		/*
		if (same) {
			System.out.println("동일한 이름이 존재합니다.");			
		} else {			
			System.out.println("동일한 이름이 존재하지 않습니다.");
		}
		*/
		// 위에 if문을 삼항 연산자로 변환하여 가독성 ↑
		System.out.println(
				same
				? "동일한 이름이 존재합니다."
				: "동일한 이름이 존재하지 않습니다."
		);

	}

}
