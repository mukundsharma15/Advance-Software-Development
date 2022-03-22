package com.csci5308.assignment3.staff;

import com.csci5308.assignment3.staff.interfaces.IDriver;

public class Driver extends Employee implements IDriver{

	public Driver() {
		super();
	}

	@Override
	public void deliver(String account, String item, int count) {
		logTime(15*count);
		System.out.println("Delivered " + item + " to " + account);
	}
}
