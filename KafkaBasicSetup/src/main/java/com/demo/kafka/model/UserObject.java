package com.demo.kafka.model;

import java.io.Serializable;

public class UserObject implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String name;
	private String phoneNumber;
	
	
	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getPhoneNumber() {
		return phoneNumber;
	}


	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}


	@Override
	public String toString() {
		return "UserObject [name=" + name + ", phoneNumber=" + phoneNumber + "]";
	}
	
}
