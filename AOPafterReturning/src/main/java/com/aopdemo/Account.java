package com.aopdemo;

public class Account {

	private String name;
	private String level;

	public Account() {
	}

	public Account(String name, String level) {
		this.name = name;
		this.level = level;
	}

	public String getName() {
		System.out.println("String getMethod() called");
		return name;

	}
	
	public void setName(String name) {
		System.out.println("String setMethod() called");
		this.name = name;

	}

	public String getLevel() {
		return level;
	}

	public void setLevel(String level) {
		this.level = level;
	}

	@Override
	public String toString() {
		return "Account{" +
				"name='" + name + '\'' +
				", level='" + level + '\'' +
				'}';
	}
}
