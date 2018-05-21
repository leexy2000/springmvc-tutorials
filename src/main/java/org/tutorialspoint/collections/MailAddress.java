package org.tutorialspoint.collections;

import java.util.*;

public class MailAddress {

	Properties address;

	// a setter method to set Property
	public void setAddress(Properties address) {
		this.address = address;
	}

	// prints and returns all the elements of the Property.
	public Properties getAddress() {
		System.out.println(address);
		return address;
	}

}
