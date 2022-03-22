package com.csci5308.assignment3.operations;

import com.csci5308.assignment3.management.interfaces.IHumanResources;
import com.csci5308.assignment3.operations.interfaces.IShipping;
import com.csci5308.assignment3.management.interfaces.IWarehouse;
import com.csci5308.assignment3.staff.Driver;
import com.csci5308.assignment3.staff.Picker;

public class Shipping implements IShipping {
	private final IHumanResources humanResources;
	private final IWarehouse warehouse;

	public Shipping(IHumanResources humanResources, IWarehouse warehouse) {
		this.humanResources = humanResources;
		this.warehouse = warehouse;
	}

	@Override
	public void ship(String item, String account, int count) {
		Picker picker = humanResources.getPicker();
		picker.retrieve(item, count);
		Driver driver = humanResources.getDriver();
		driver.deliver(account, item, count);
		System.out.println("Shipped " + count + " " + item + " to " + account);
	}
}
