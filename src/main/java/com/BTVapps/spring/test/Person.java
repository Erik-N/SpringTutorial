package com.BTVapps.spring.test;

public class Person {
	
	private int id;
	private String name;
	private int taxId;
	
	private Address address;
	
	public Person() {
		
	}
	
	public Person(int id, String name) {
		this.id = id;
		this.name = name;
	}

	public static Person getInstance(int id, String name) {
		System.out.println("Creating person using factory method");
		return new Person(id, name);
	}


	public void speak() {
		System.out.println("Hello I'm a person!");
	}

	public void onCreate() {
		System.out.println("Person Created " + this);
	}

	public void onDestroy() {
		System.out.println("Person destroyed");
	}
	public void setTaxId(int taxId) {
		this.taxId = taxId;
	}

	public void setAddress(Address adress) {
		this.address = adress;
	}

	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + ", taxId=" + taxId + ", adress=" + address + "]";
	}


	
	
}
