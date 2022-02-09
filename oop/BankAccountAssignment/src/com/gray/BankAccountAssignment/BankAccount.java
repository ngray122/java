package com.gray.BankAccountAssignment;

public class BankAccount {
	
	
//	declared member variables
	private double savingsBalance;
	private double checkingBalance;
	
//	creating static class member that has number of all accounts so far
	public static int numberOfAccounts = 0;
	
//	creating static class member that tracks the total amount of money stored in every account created
	public static double totalAmountOfMoneyInAllAccounts =0;
	
	public BankAccount() {
	
	}
	
	
//	BankAccount Constructor
	public BankAccount(double checkingBalance, double savingsBalance) {
		this.checkingBalance = checkingBalance;
		this.savingsBalance = savingsBalance;
		numberOfAccounts++;
	}
	

//	getter for checkingBalance
	public double getCheckingBalance() {
		return this.checkingBalance;
	}
	
// 	setter for checkingBalance
	public void setCheckingBalance(double checkingBalance) {
		this.checkingBalance = checkingBalance;
	}

//	getter for savingsBalance
	public double getSavingsBalance() {
		return this.savingsBalance;
	}
	
//	Setter for savingsBalance
	public void setSavingsBalance(double savingsBalance) {
		this.savingsBalance = savingsBalance;
	}
	

//	method to allow a user to deposit money into either checkings or savings
	public void depositToAccount(String account, double amount) {
		if(account.equals( "checking")) {
			this.setCheckingBalance(amount);			
		}else if (account.equals("saving")){
			this.setSavingsBalance(amount);

		}
		totalAmountOfMoneyInAllAccounts += amount;	
	}
	
	
	
	//method to withdraw money from one account, if insufficient funds, do not allow
		public void withdrawFromSavings(double amount){
			if(this.savingsBalance < amount) {
				System.out.println("There are not enough funds to make a withdraw");
			}
			else {
				this.savingsBalance-=amount;
					
			}

		}
		
//		method to see total sum of checking and saving
		public double totalBalances() {
			return this.savingsBalance + this.checkingBalance;
			
		}
		
			
		
	
}




