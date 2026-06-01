package com.kh.example.exception1;

public class CharacterController {

	// 생성자
	public CharacterController() {
		super();
	}
	
	// 메소드
	public int countAlpha(String s) throws CharCheckException {
		int count = 0;
		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			
			if (ch == ' ') {
				throw new CharCheckException();
			}
			
			if ((ch >= 60 && ch <= 90) || (ch >= 97 && ch <= 122) || ch == 32) {
				count++;
			}
		}
		return count;
		
	}
	
	
}
