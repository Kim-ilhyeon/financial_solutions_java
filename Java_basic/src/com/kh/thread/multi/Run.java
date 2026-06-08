package com.kh.thread.multi;

public class Run {
	public static void main (String[] args) {
		Task1 t1 = new Task1();
		Task2 t2 = new Task2();
		
		t2.start();	// 홀수만
		t1.start();	// 짝수만
		// => t2.start();를 다 하고 나서 t1.start()를 하는게 아니라 왔다갔다 작업을 하면서 진행 중이다.
	}
	
	
}
