package com.kh.example.collection1;

import java.util.Comparator;

public class AscTitle implements Comparator {
	// 메소드
	public int compare(Object o1, Object o2) {
		Music m1 = (Music)o1;
		Music m2 = (Music)o2;
		
		int result = m1.compareTo(m2);
		
		return result;
	}
	
}
