package com.company.domain;

public class Contact {
	private String name;
	private String address;
	private String number;

	public Contact(String name, String address, String number) {
		this.name = name;
		this.address = address;
		this.number = number;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	@Override
	public String toString() {
		return "Contact{" +
			"name='" + name + '\'' +
			", address='" + address + '\'' +
			", number='" + number + '\'' +
			'}';
	}
}
