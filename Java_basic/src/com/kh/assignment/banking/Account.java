package com.kh.assignment.banking;

import java.time.LocalDate;
import java.util.List;
import java.util.Objects;

public class Account {

	// 필드
	private String accountNo;		// 계좌번호 (고유 값)
	private int balance;			// 잔고
	
	private LocalDate openDate;		// 계좌 개설 날짜
	private LocalDate expireDate;	// 계좌 만료 날짜
	
	private List<Transaction> history;	// 해당 계좌 별 거래 내역

	
	// 생성자
	public Account() {
		super();
	}

	public Account(String accountNo, int balance, LocalDate openDate, LocalDate expireDate, List<Transaction> history) {
		super();
		this.accountNo = accountNo;
		this.balance = 0;
		this.openDate = openDate;
		this.expireDate = expireDate;
		this.history = history;
	}

	
	
	
	// 메소드
	@Override
	public String toString() {
		return accountNo + "\n잔액 : " + balance + "\n개설 일자 : " + openDate + "\n만료 일자 : "
				+ expireDate;
	}	
	
	
	@Override
	public int hashCode() {
		return Objects.hash(accountNo, balance, openDate, expireDate);
	}

	@Override
	public boolean equals(Object obj) {
		Account account = (Account)obj;
		return this.accountNo.equals(account.getAccountNo()) &&
				this.balance == account.getBalance() &&
				this.openDate.equals(account.getOpenDate()) &&
				this.expireDate.equals(account.getExpireDate());
	}

	// getter / setter
	public String getAccountNo() {
		return accountNo;
	}

	public void setAccountNo(String accountNo) {
		this.accountNo = accountNo;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}

	public LocalDate getOpenDate() {
		return openDate;
	}

	public void setOpenDate(LocalDate openDate) {
		this.openDate = openDate;
	}

	public LocalDate getExpireDate() {
		return expireDate;
	}

	public void setExpireDate(LocalDate expireDate) {
		this.expireDate = expireDate;
	}

	public List<Transaction> getHistory() {
		return history;
	}

	public void setHistory(List<Transaction> history) {
		this.history = history;
	}
	
	
	
	
	
	
}
