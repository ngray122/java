package com.gray.BankAccountAssignment;

public class BankAccountTest {

	public static void main(String[] args) {
		
		BankAccount user1 = new BankAccount(0,0);
		
		
//		user1.setSavingsBalance(56.09);
//		System.out.println(user1.getSavingsBalance());
//		
//		amounts for line 14 and 19 don't sum???????
//		user1.setCheckingBalance(200.89);
//		System.out.println(user1.getCheckingBalance());

		
//		Deposit to checking
		user1.depositToAccount("checking", 700.87);
//		System.out.println(user1.getCheckingBalance());
		
//		Deposit to savings
		user1.depositToAccount("saving", 246.33);
		System.out.println(user1.getSavingsBalance());

		
//		Withdraw from savings, throws error for insufficient funds
//		user1.withdrawFromSavings(700.05);
		
//		
		user1.withdrawFromSavings(80.05);
//		System.out.println(user1.getSavingsBalance());
//		prints out 80.05, should 166.28 which is balance after withdraw
		
		
//		Error savingsBalance not visible which is correct <-- savingsBalance is private, so a setter is needed to access 
//		user1.savingsBalance = 888.99;
		
		user1.totalBalances();     
	
	}

}
       