package com.capgemini.ocapractice.corrected;

public class Customer {

	ElectricAccount acct = new ElectricAccount();
	public void useElectricity(double kwh) {
		acct.addKwh(kwh);
	}
}
