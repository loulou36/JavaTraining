package account;

import bank.Bank;

public class Account {
	private String accNbr;
	private String remarks;
	private String accType;
	private double balance;
	private float yieldYearly;
	private Bank bank;
	
	public void openAccount() {
		//create new account
		
		
	}
	public void closeAccount() {
		//close account
	}
	public void showAccount() {
		//show all account characteristics 
		
	}
	public boolean searchAccount(String accNumber) {
		//return true if account exists
		
		return false;
	}
	public void deposit(double sumDeposit) {
		this.balance-=sumDeposit;
		
	}
	public void withdrawal(double sumWithdrawal) {
		this.balance+=sumWithdrawal;
	}
	public double getBalance() {
		return this.balance;
	}
	
	

	
}
