package com.aurionpro.model;

import java.util.Objects;

public class Account {
	int accountId;
	String accountName;
	public Account(int accountId, String accountName) {
		super();
		this.accountId = accountId;
		this.accountName = accountName;
	}
	public int getAccountId() {
		return accountId;
	}
	public void setAccountId(int accountId) {
		this.accountId = accountId;
	}
	public String getAccountName() {
		return accountName;
	}
	public void setAccountName(String accountName) {
		this.accountName = accountName;
	}
	@Override
	public String toString() {
		return "Account [accountId=" + accountId + ", accountName=" + accountName + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(accountId);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Account other = (Account) obj;
		return accountId == other.accountId;
	}
	
	
	

}
