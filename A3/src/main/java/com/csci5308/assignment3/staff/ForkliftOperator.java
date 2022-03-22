package com.csci5308.assignment3.staff;

import com.csci5308.assignment3.staff.interfaces.IForkliftOperator;

public class ForkliftOperator extends Employee implements IForkliftOperator {

	public ForkliftOperator() {
		super();
	}

	@Override
	public void storeItem(String item, int count) {
		logTime(20*count);
		System.out.println("Stored " + count + " " + item);
	}

}
