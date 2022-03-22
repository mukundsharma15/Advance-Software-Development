package com.csci5308.assignment3.management;

import com.csci5308.assignment3.management.interfaces.IWarehouse;

import java.util.HashMap;
import java.util.Map;

public class Warehouse implements IWarehouse {
	private final Map<String, Integer> storedItems;

	public Warehouse() {
		storedItems = new HashMap<>();
	}

	@Override
	public void add(String item, int count) {
		if (storedItems.containsKey(item)) {
			storedItems.put(item, storedItems.get(item) + count);
		}
		else {
			storedItems.put(item, count);
		}
	}

	@Override
	public void remove(String item, int count) {
		storedItems.put(item, storedItems.get(item) - count);
	}
}
