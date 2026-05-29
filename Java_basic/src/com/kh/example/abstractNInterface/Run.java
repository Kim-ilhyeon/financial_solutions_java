package com.kh.example.abstractNInterface;

public class Run {

	public static void main(String[] args) {
		PhoneController pc = new PhoneController();
		String[] sList = pc.method();
		
		for (String sl : sList) {
			if (sl == null) {
				break;
			}
			System.out.println(sl);
			System.out.println();
		}

	}

}
