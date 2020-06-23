package com.capgemini.ocapractice.corrected;

public class Test18 {

	void readCard(int cardNo) throws Exception {
		System.out.println("Read");
	}

	void checkCard(int cardNo) throws RuntimeException {
		System.out.println("Check");
	}

	public static void main(String[] args) {
		Test18 ex = new Test18();
		int cardNo = 12344;
		ex.checkCard(cardNo);
		//ex.readCard(cardNo); compilation error
	}
}
