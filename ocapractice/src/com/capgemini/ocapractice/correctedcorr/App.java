package com.capgemini.ocapractice.correctedcorr;

public class App {

	int count;
	public static void displayMsg () {
		count++;
		System.out.println("welcome  "+" visite" + count);
	}
	public static void main(String[] args) {
		App.displayMsg();
		App.displayMsg();
	}
}
