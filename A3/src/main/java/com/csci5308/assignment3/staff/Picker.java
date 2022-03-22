package com.csci5308.assignment3.staff;

import com.csci5308.assignment3.staff.interfaces.IPicker;

public class Picker extends Employee implements IPicker {

	public Picker() {
		super();
	}

	@Override
	public void retrieve(String item, int count) {
		logTime(5*count);
		System.out.println("Picked " + count + " " + item);
	}

}