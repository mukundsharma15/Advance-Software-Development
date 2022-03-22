package com.csci5308.assignment3;

import com.csci5308.assignment3.management.HumanResources;
import com.csci5308.assignment3.management.Warehouse;
import com.csci5308.assignment3.management.interfaces.IHumanResources;
import com.csci5308.assignment3.management.interfaces.IWarehouse;
import com.csci5308.assignment3.operations.Facade;
import com.csci5308.assignment3.operations.interfaces.IFacade;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Main {
	static final String FILE_NAME = "input.txt";
	static final String PATH = ".";

	private static IHumanResources humanResources;
	private static IFacade facade;
	private static BufferedReader reader;

	public static void main(String[] args) throws IOException {
		System.out.println("Welcome to the warehouse!");
		initialize();
		try {
			String currentDIR = new java.io.File(PATH).getCanonicalPath();
			System.out.println("Current directory:" + currentDIR);
			reader = new BufferedReader(new FileReader(FILE_NAME));
			String line = reader.readLine();
			while (line != null) {
				if (line.length() > 0)
					executeInstruction(line);
				line = reader.readLine();
			}
		}
		catch (Exception e) {
			System.out.println("Error working with filesystem: " + e.getMessage());
		}finally {
			reader.close();
		}
		System.out.println("Human resources reports " + humanResources.getTotalMinutesWorked() + " minutes worked.");
	}

	private static void initialize() {
		humanResources = new HumanResources();
		IWarehouse warehouse = new Warehouse();
		facade = new Facade(humanResources, warehouse);
	}

	private static void executeInstruction(String line) {
		String[] string = line.split(" ");
		if (string[0].equals("RECEIVE"))
			facade.receive(string[1], Integer.parseInt(string[2]));
		else if (string[0].equals("SHIP"))
			facade.ship(string[1], string[2], Integer.parseInt(string[3]));
	}
}
