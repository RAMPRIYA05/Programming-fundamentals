package com.chainsys.polymorphism;

public class ABCBank {
      public ABCBank() {
    	  
      }
      public String userName;
      public int userPhNum;
      public String userAddress;
      public int userAadharNumber;
      public int userAccountNumber;
      public int deposit;
      public int amount;
      
     
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	public int getDeposit() {
		return deposit;
	}
	public void setDeposit(int deposit) {
		this.deposit = deposit;
	}
	public int getUserAccountNumber() {
		return userAccountNumber;
	}
	public void setUserAccountNumber(int userAccountNumber) {
		this.userAccountNumber = userAccountNumber;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public int getUserPhNum() {
		return userPhNum;
	}
	public void setUserPhNum(int userPhNum) {
		this.userPhNum = userPhNum;
	}
	public String getUserAddress() {
		return userAddress;
	}
	public void setUserAddress(String userAddress) {
		this.userAddress = userAddress;
	}
	public int getUserAadharNumber() {
		return userAadharNumber;
	}
	public void setUserAadharNumber(int userAadharNumber) {
		this.userAadharNumber = userAadharNumber;
	}
	@Override
	public String toString() {
		return "ABCBank [userName=" + userName + ", userPhNum=" + userPhNum + ", userAddress=" + userAddress
				+ ", userAadharNumber=" + userAadharNumber + ", userAccountNumber=" + userAccountNumber + ", deposit="
				+ deposit + ", amount=" + amount + "]";
	}
	
	
	
}
