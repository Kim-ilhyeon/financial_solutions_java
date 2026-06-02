package com.kh.example.api;

import java.util.StringTokenizer;

public class TokenController {

	// 생성자
	public TokenController() {
		super();
	}
	
	// 메소드
	public static String afterToken (String str) {	// 해당 클래스의 필드를 사용하거나 다른 메소드와 연관이 없기 때문에 static메소드로 만드는 것이 좋다.
		StringTokenizer stn = new StringTokenizer(str, " ");
		
		StringBuilder sb = new StringBuilder();
		while (stn.hasMoreElements()) {
			sb.append(stn.nextToken());
		}
		return sb.toString();
	}
	
	public static String firstCap (String input) {
		char firstChar = input.toUpperCase().charAt(0);
		// String result = first + input.substring(1);	// substring()메소드를 사용해도 가능
		String result = input.replace(input.charAt(0), firstChar);
		return result;
	}
	
	public static int findChar (String input, char one) {
		int count = 0;
		for (int i = 0; i < input.length(); i++) {
			if (input.charAt(i) == one) {
				count++;
			}
		}
		return count;
	}
	
	
}
