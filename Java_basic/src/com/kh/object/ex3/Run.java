package com.kh.object.ex3;

public class Run {

	public static void main(String[] args) {
		Math m1 = new Math();
		
		System.out.println(m1.adder(10));
		System.out.println(m1.adder(10, 20));
		System.out.println(m1.adder('a', 'b'));
		System.out.println(m1.adder(10, "살입니다."));
		System.out.println(m1.adder("살입니다.", 10));

	}

}
