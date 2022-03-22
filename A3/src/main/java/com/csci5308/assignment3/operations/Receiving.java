package com.csci5308.assignment3.operations;

import com.csci5308.assignment3.management.interfaces.*;
import com.csci5308.assignment3.operations.interfaces.IReceiving;
import com.csci5308.assignment3.staff.ForkliftOperator;

public class Receiving implements IReceiving {
	private final IHumanResources humanResources;
	private final IWarehouse warehouse;

	public Receiving(IHumanResources humanResources, IWarehouse warehouse) {
		this.humanResources = humanResources;
		this.warehouse = warehouse;
	}

	@Override
	public void receive(String item, int count) {
		ForkliftOperator operator = humanResources.forkLiftOperator();
		operator.storeItem(item, count);
		System.out.println("Received " + count + " " + item);
	}
}
