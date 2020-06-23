package com.capgemini.ocapractice.corrected;

public class Q17 {
	public static void main(String[] args) {
		CheckingAccount acct = new CheckingAccount((int) (Math.random() * 1000));
		//acct.amount=0;
		//acct.changeAmount(-acct.amount);
		acct.changeAmount(-acct.getAmount());
		System.out.println(acct.getAmount());
	}
}
