package org.tutorialspoint.collections;

import java.util.*;

public class Countries {
	private List<String> member = null;

	public void setMember(List<String> member) {
		this.member = member;
	}
	public List<String> getMember() {
		System.out.println(member);
		return member;
	}	

}
