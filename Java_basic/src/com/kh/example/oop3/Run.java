package com.kh.example.oop3;

public class Run {

	public static void main(String[] args) {
		Book b1 = new Book();
		b1.inform();
		System.out.println();
		
		System.out.println("====구분선====");

		Book b2 = new Book("어린왕자", "열린책들", "생택쥐페리");
		b2.inform();
		System.out.println();
		
		System.out.println("====구분선====");
		
		Book b3 = new Book("어린왕자", "열린책들", "생택쥐페리", 10600, 10);
		b3.inform();
		System.out.println();
		

	}

}
