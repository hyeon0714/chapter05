package com.javaex.ex05;

public class Person {
	
	private String name;
	private String hp;
	private String company;
	
	public Person() {
	}
	
	public Person(String name, String hp, String company) {
		this.company=company;
		this.hp=hp;
		this.name=name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getHp() {
		return hp;
	}

	public void setHp(String hp) {
		this.hp = hp;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	@Override
	public String toString() {
		return "이름:"+name+"hp:"+hp+"회사:"+company;
	}
	
	
}
