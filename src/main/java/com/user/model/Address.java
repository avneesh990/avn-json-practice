package com.user.model;

import java.io.Serializable;

public class Address implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String userAddress;

	public String getUserAddress() {
		return userAddress;
	}

	public void setUserAddress(String userAddress) {
		this.userAddress = userAddress;
	}

	@Override
	public String toString() {
		return "Address [userAddress=" + userAddress + "]";
	}
}
