package com.kh.object.overload;

public class Run {

	public static void main(String[] args) {
		Man m1 = new Man("김일현");
		Man m2 = new Man("김지우", "010101-3215148");
		
		m1.showMyInfo();
		m1.showMyInfo("남자");

	}

}
