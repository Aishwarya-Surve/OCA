package com.capgemini.ocapractice.corrected;

public class App {
int count ;
public static void displayMsg() {
	count++;
	System.out.println(count);
}
public static void main(String[] args) {
	App.displayMsg();
	App.displayMsg();  
}
}
