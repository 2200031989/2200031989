package com.sreedhar;

public class UserLoginManagerDemo2 {

	public static void main(String[] args) {
		BankingProcess2 bankingprocess=new BankingProcess2();
		
		bankingprocess.viewBalance();
		
		UserLoginManager2 loginManager=UserLoginManager2.getInstance();
		loginManager.login();
		
		bankingprocess.viewBalance();
		
		bankingprocess.deposit(5000);
		bankingprocess.withdraw(2000);
		
		loginManager.logout();
		
		bankingprocess.withdraw(1000);

	}

}
