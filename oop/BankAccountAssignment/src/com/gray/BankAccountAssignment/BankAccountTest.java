package com.gray.BankAccountAssignment;

public class BankAccountTest {

	public static void main(String[] args) {
		
		BankAccount user1 = new BankAccount(0,0);
		
		
		user1.setSavingsBalance(56.09);
	
		user1.setCheckingBalance(200.89);
	
//		Deposit to checking
		user1.depositToAccount("checking", 100.00);

		
//		Deposit to savings
		user1.depositToAccount("saving", 400.00);

		
////	Withdraw from savings,should ===> throw error for insufficient funds
		user1.withdrawFromSavings(700.05);
//	
	
//		Withdraw from savings
		user1.withdrawFromSavings(80.00);
		
		
//		Error savingsBalance not visible which is correct <-- savingsBalance is private, so a setter is needed to access 
//		user1.savingsBalance = 888.99;
		
		
		System.out.println(user1.totalBalances());  
	
	}

}
       