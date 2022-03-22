package com.csci5308.assignment3.management;

import com.csci5308.assignment3.management.interfaces.IHumanResources;
import com.csci5308.assignment3.staff.Driver;
import com.csci5308.assignment3.staff.ForkliftOperator;
import com.csci5308.assignment3.staff.Picker;
import com.csci5308.assignment3.staff.interfaces.IEmployee;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class HumanResources implements IHumanResources {
	private int nextDriver;
	private int nextForkLiftOperator;
	private int nextPicker;
	private final List<IEmployee> drivers;
	private final List<IEmployee> forkLiftOperators;
	private final List<IEmployee> pickers;

	public HumanResources() {
		nextDriver = 0;
		nextForkLiftOperator = 0;
		nextPicker = 0;
		drivers = new ArrayList<>();
		drivers.add(new Driver());
		drivers.add(new Driver());
		drivers.add(new Driver());
		drivers.add(new Driver());
		drivers.add(new Driver());
		forkLiftOperators = new ArrayList<>();
		forkLiftOperators.add(new ForkliftOperator());
		forkLiftOperators.add(new ForkliftOperator());
		forkLiftOperators.add(new ForkliftOperator());
		forkLiftOperators.add(new ForkliftOperator());
		forkLiftOperators.add(new ForkliftOperator());
		pickers = new ArrayList<>();
		pickers.add(new Picker());
		pickers.add(new Picker());
		pickers.add(new Picker());
		pickers.add(new Picker());
		pickers.add(new Picker());
	}

	@Override
	public Driver getDriver() {
		Driver driver = (Driver)drivers.get(nextDriver);
		nextDriver = (nextDriver + 1) % 5;
		return driver;
	}

	@Override
	public Picker getPicker() {
		Picker picker = (Picker)pickers.get(nextPicker);
		nextPicker = (nextPicker + 1) % 5;
		return picker;
	}

	@Override
	public ForkliftOperator forkLiftOperator() {
		ForkliftOperator operator = (ForkliftOperator) forkLiftOperators.get(nextForkLiftOperator);
		nextForkLiftOperator = (nextForkLiftOperator + 1) % 5;
		return operator;
	}

	@Override
	public int getTotalMinutesWorked() {
		int count = 0;
		Iterator<IEmployee> iter = drivers.iterator();
		while (iter.hasNext())
		{
			count += iter.next().getMinutesWorkedSinceLastPay();
		}
		iter = pickers.iterator();
		while (iter.hasNext())
		{
			count += iter.next().getMinutesWorkedSinceLastPay();
		}
		iter = forkLiftOperators.iterator();
		while (iter.hasNext())
		{
			count += iter.next().getMinutesWorkedSinceLastPay();
		}
		return count;
	}
}
