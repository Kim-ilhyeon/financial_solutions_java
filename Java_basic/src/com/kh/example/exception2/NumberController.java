package com.kh.example.exception2;

public class NumberController {
	// 생성자
	public NumberController() {
		super();
	}
	
	
	// 메소드
	public boolean checkDouble(int num1, int num2) throws NumRangeException {
		boolean check = false;
		if (num1 >= 1 && num1 <= 100 && num2 >= 1 && num2 <= 100) {
			if (num1 % num2 == 0) {
				check = true;
			}
		} else {
			throw new NumRangeException();
		}
		return check;
	}
	
	

}
