package com.kh.thread.runnable;

// 스레드를 만드는 방법2
// Thread클래스를 상속받는 클래스를 작성.
public class Task2 extends Thread {

	// 메인문처럼 해당 스레드 실행 시 독립적으로 실행되는 메소드
	@Override
	public void run() {
		int n1 = 20;
		int n2 = 30;
		
		// Thread.currentThread() -> 지금 실행 중인 스레드 정보 가져오기
		String name = Thread.currentThread().getName();
		System.out.println(name + " : " + (n1 + n2));
	}
	
	
}
