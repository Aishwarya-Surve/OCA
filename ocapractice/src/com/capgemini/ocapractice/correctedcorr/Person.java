package com.capgemini.ocapractice.correctedcorr;

public class Person {

	String name;
	int age;
	
	public Person(String name) {
		
		this();
		setName(name);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	public Person (String name , int age) {
		Person(name);
		setAge(age);
	}
	
	public String show() {
		return name + " " + age;
	}
}
