package com.kh.assignment.banking;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
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

	public Account(String accountNo, int balance, List<Transaction> history) {
		super();
		this.accountNo = accountNo;
		this.balance = balance;
		this.openDate = LocalDate.now();
		this.expireDate = this.openDate.plusYears(5);	// LoclaDate의 해당 날짜에서 1년후로 증가하는 메소드
		this.history = history;
	}
	

	// 메소드
	@Override
	public String toString() {
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy.MM.dd");
		String openDateStr = (openDate != null) ? openDate.format(formatter) : "미정";
		
		return "계좌번호 : " + accountNo + "\n잔액 : " + balance + "원\n개설 일자 : " + openDateStr + "\n만료 일자 : "
				+ expireDate;
	}	
	@Override
	public int hashCode() {
		return Objects.hash(accountNo);
	}
	@Override
	public boolean equals(Object obj) {
		Account account = (Account)obj;
		return this.accountNo.equals(account.getAccountNo());	
	}

	
	// getter / setter
	public String getAccountNo() {
		return accountNo;
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
