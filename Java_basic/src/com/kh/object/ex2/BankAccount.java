package com.kh.object.ex2;

public class BankAccount {

	// 필드
	int balance;
	String accountNumber;
	
	// 생성자
	
	// 메소드
	// 입금
	public void deposit(int amount) {
		balance += amount;
	}
	
	// 출금
	public void withdraw(int amount) {
		balance -= amount;
	}
	
	// 잔액 조회
	public void checkMyBalance() {
		System.out.println("잔액 : " + balance);
	}
	
}
