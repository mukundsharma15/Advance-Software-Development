package com.csci5308.assignment3.staff;

import com.csci5308.assignment3.staff.interfaces.IEmployee;

public class Employee implements IEmployee {
	private int minutesWorkedSinceLastPay;

	public Employee() {
		minutesWorkedSinceLastPay = 0;
	}

	@Override
	public void logTime(int minutes) {
		// Add minutes to minutesWorkedSinceLastPay
		minutesWorkedSinceLastPay += minutes;
	}

	@Override
	public int getMinutesWorkedSinceLastPay() {
		return minutesWorkedSinceLastPay;
	}
}
