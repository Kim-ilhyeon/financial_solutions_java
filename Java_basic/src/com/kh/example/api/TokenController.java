package com.kh.example.api;

import java.util.StringTokenizer;

public class TokenController {

	// 생성자
	public TokenController() {
		super();
	}
	
	// 메소드
	public String afterToken (String str) {
		String[] str1 = str.split(" ");
		String str2 = String.join(",", str1);
		StringTokenizer stn = new StringTokenizer(str2, ",");
		String result = "";
		int count = stn.countTokens();
		for (int i = 0; i < count; i++) {
			result += stn.nextToken();
		}
		return result;
	}
	
	public String firstCap (String input) {
		char firstChar = input.toUpperCase().charAt(0);
		String result = input.replace(input.charAt(0), firstChar);
		return result;
	}
	
	public int findChar (String input, char one) {
		int count = 0;
		for (int i = 0; i < input.length(); i++) {
			if (input.charAt(i) == one) {
				count++;
			}
		}
		return count;
	}
	
	
}
