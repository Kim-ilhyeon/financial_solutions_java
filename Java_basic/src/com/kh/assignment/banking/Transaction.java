package com.kh.assignment.banking;

import java.time.LocalDateTime;
import java.util.Objects;

public class Transaction {

	// 필드
	private String type;		// 송금, 입금 여부
	private int amount;			// 거래 금액
	private String targetAccount;	// 거래 계좌 번호
	
	private LocalDateTime transactionDate;	// 거래 날짜 및 시간

	
	// 생성자
	public Transaction() {
		super();
	}

	public Transaction(String type, int amount, String targetAccount, LocalDateTime transactionDate) {
		super();
		this.type = type;
		this.amount = amount;
		this.targetAccount = targetAccount;
		this.transactionDate = transactionDate;
	}

	
	
	// 메소드
	@Override
	public int hashCode() {
		return Objects.hash(type, amount, targetAccount, transactionDate);
	}
	
	@Override
	public boolean equals(Object obj) {
		Transaction transaction = (Transaction)obj;
		return this.type.equals(transaction.getType()) &&
				this.amount == transaction.getAmount() &&
				this.targetAccount.equals(transaction.getTargetAccount()) &&
				this.transactionDate.equals(transaction.getTransactionDate());
	}
	
	
	
	// getter / setter
	public String getType() {
		return type;
	}
	
	public void setType(String type) {
		this.type = type;
	}
	
	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

	public String getTargetAccount() {
		return targetAccount;
	}

	public void setTargetAccount(String targetAccount) {
		this.targetAccount = targetAccount;
	}

	public LocalDateTime getTransactionDate() {
		return transactionDate;
	}

	public void setTransactionDate(LocalDateTime transactionDate) {
		this.transactionDate = transactionDate;
	}
	
	
}
